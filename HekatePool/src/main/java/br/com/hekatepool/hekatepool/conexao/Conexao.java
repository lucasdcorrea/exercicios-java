/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hekatepool.hekatepool.conexao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author jessi
 */
public interface Conexao {
    
    public Connection obterConexao() throws SQLException;
    public void fecharConexao()throws SQLException;
    
}