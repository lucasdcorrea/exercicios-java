/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hekatepool.hekatepool.controller;

import br.com.hekatepool.hekatepool.dao.AutenticacaoDao;
import br.com.hekatepool.hekatepool.dao.ClienteDao;
import br.com.hekatepool.hekatepool.entidades.Cliente;
import br.com.hekatepool.hekatepool.util.ClienteTableModel;
import br.com.hekatepool.hekatepool.view.formulario.Dashboard;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author jessi
 */
public class ClienteController implements ActionListener, MouseListener, KeyListener{
    
    private Dashboard dashboard;
    private AutenticacaoDao autenticacaoDao;
    private ClienteDao clienteDao;
    private ClienteTableModel clienteTableModel;
    private Cliente cliente;

    public ClienteController(Dashboard dashboard) {
        this.dashboard = dashboard;
        this.clienteDao = new ClienteDao();
        actualizarTabelaCliente(clienteDao.todosCliente());
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String accao = ae.getActionCommand().toLowerCase();
        
        switch(accao) {
            case "adicionar": adicionar(); break;
            case "salvar": salvar(); break;
            case "cancelar": cancelar();break;
        }
    }

    public void salvar() {
        String idString = this.dashboard.getTxtClienteId().getText();
        String nome = this.dashboard.getTxtClienteNome().getText();
        String telefone = this.dashboard.getTxtClienteTelefone().getText();
        String endereco = this.dashboard.getTxtClienteEndereco().getText();
        
        Long id = Long.valueOf(idString);
        
        Cliente cliente = new Cliente(id, nome, telefone, endereco);
        String mensagem = clienteDao.salvar(cliente);
        
        if(mensagem.startsWith("Cliente")) {
            mensagemNaTela(mensagem, Color.GREEN);
            actualizarTabelaCliente(clienteDao.todosCliente());
        }else {
            mensagemNaTela(mensagem, Color.RED);
        }
    }
    
    private void mensagemNaTela(String mensagem, Color color) {
         this.dashboard.getLabelClienteMensagem().setBackground(color);
         this.dashboard.getLabelClienteMensagem().setText(mensagem);
    }

    private void cancelar() {
        limpar();
        this.dashboard.getDialogCliente().setVisible(false);
    }
    
    private void limpar() {
        this.dashboard.getTxtClienteId().setText("0");
        this.dashboard.getTxtClienteNome().setText("");
        this.dashboard.getTxtClienteTelefone().setText("");
        this.dashboard.getTxtClienteEndereco().setText("");
    }
    
    private void mostrarTela() {
        this.dashboard.getDialogCliente().pack();
        this.dashboard.getDialogCliente().setLocationRelativeTo(dashboard);
        this.dashboard.getDialogCliente().setVisible(true);
    }

    private void adicionar() {
        mostrarTela();
    }

    private void actualizarTabelaCliente(List<Cliente> todosCliente) {
        List<Cliente> clientes = clienteDao.todosCliente();
        this.clienteTableModel = new ClienteTableModel(clientes);
        this.dashboard.getTabelaCliente().setModel(clienteTableModel);
        this.dashboard.getLabelHomeCliente().setText(String.format("%d", clientes.size()));
    }
    
      @Override
    public void mouseClicked(MouseEvent me) {
        int linhaSelecionada = this.dashboard.getTabelaCliente().getSelectedRow();
        this.cliente = clienteTableModel.getClientes().get(linhaSelecionada);
    }

    @Override
    public void mousePressed(MouseEvent me) { }

    @Override
    public void mouseReleased(MouseEvent me) {}

    @Override
    public void mouseEntered(MouseEvent me) {}

    @Override
    public void mouseExited(MouseEvent me) {}

    @Override
    public void keyTyped(KeyEvent ke) {}

    @Override
    public void keyPressed(KeyEvent ke) {}

    @Override
    public void keyReleased(KeyEvent ke) {
        String pesquisar = this.dashboard.getTxtClientePesquisar().getText();
        
        if(pesquisar.isEmpty()) {
            actualizarTabelaCliente(clienteDao.todosCliente());
        } else {
            List<Cliente> clienteTemp = this.clienteDao.todosCliente()
                    .stream()
                    .filter((Cliente u) -> {
                        return u.getNome().toLowerCase().contains(pesquisar.toLowerCase()) || 
                                String.valueOf(u.getId().hashCode()).contains(pesquisar.toLowerCase());
                    })
                    .collect(Collectors.toList());
            
            actualizarTabelaCliente(clienteTemp);
        }
        
    }
    
    
}
