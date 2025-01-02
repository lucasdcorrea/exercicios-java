/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hekatepool.hekatepool.entidades;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author jessi
 */
public class Usuario {

    private Long id;
    private String nome;
    private String username;
    private String senha;
    private PERFIL perfil;
    private boolean status;
    private LocalDateTime dataHoraCriacao;
    private LocalDateTime ultimoLogin;

    public Usuario() {
        this.status = true;
    }

    public Usuario(Long id, String nome, String username, String senha, PERFIL perfil, LocalDateTime dataHoraCriacao, LocalDateTime ultimoLogin) {
        this.id = id;
        this.nome = nome;
        this.username = username;
        this.senha = senha;
        this.perfil = perfil;
        this.dataHoraCriacao = dataHoraCriacao;
        this.ultimoLogin = ultimoLogin;
        this.status = true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public PERFIL getPerfil() {
        return perfil;
    }

    public void setPerfil(PERFIL perfil) {
        this.perfil = perfil;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDateTime getDataHoraCriacao() {
        return dataHoraCriacao;
    }

    public void setDataHoraCriacao(LocalDateTime dataHoraCriacao) {
        this.dataHoraCriacao = dataHoraCriacao;
    }

    public LocalDateTime getUltimoLogin() {
        return ultimoLogin;
    }

    public void setUltimoLogin(LocalDateTime ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }

    public void reset() {
        this.status = true;
    }

    public void mudarStatus() {
        this.status = !this.status;
    }

    public boolean isStatus() {
        return status;
    }

}
