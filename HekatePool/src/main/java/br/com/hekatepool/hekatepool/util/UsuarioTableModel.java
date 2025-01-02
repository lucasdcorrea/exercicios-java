/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hekatepool.hekatepool.util;

import br.com.hekatepool.hekatepool.entidades.Usuario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jessi
 */
public class UsuarioTableModel extends AbstractTableModel {
    
    private List<Usuario> usuarios;
    private String [] colunas = {"ID", "NOME", "USERNAME", "PERFIL", "STATUS", "CRIADO EM", "ULTIMO LOGIN"};

    public UsuarioTableModel(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    

    @Override
    public int getRowCount() {
        return usuarios.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        Usuario usuario = usuarios.get(linha);
        
        switch(coluna) {
            case 0: return usuario.getId();
            case 1: return usuario.getNome();
            case 2: return usuario.getUsername();
            case 3: return usuario.getPerfil();
            case 4: return usuario.isStatus();
            case 5: return usuario.getDataHoraCriacao();
            case 6: return usuario.getUltimoLogin();
            default: return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false; 
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    
    
    
    
    
    
}