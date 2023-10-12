/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.Scanner;
/**
 *
 * @author Matheus
 */
public class Pessoa {

    private long id;
    private static long serial;
    private String nome;
    private String sexo;
    private LocalDate nascimento;
    private String login;
    private String senha;
    private String tipoUsuario;
    private LocalDate dataModificacao;
    private LocalDate dataCriacao;

    public Pessoa() {

    }

    public Pessoa(String nome, String sexo, LocalDate nascimento, String login, String senha, String tipoUsuario) {
        id = Pessoa.serial++;
        this.nome = nome;
        this.sexo = sexo;
        this.login = login;
        this.senha = senha;
        this.nascimento = nascimento;
        this.tipoUsuario = tipoUsuario;
        this.dataCriacao = LocalDate.now();
        this.dataModificacao = LocalDate.now();
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public LocalDate getDataModificacao() {
        return dataModificacao;
    }

    public void setDataModificacao(LocalDate dataModificacao) {
        this.dataModificacao = dataModificacao;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

 

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 61 * hash + Objects.hashCode(this.nome);
        hash = 61 * hash + Objects.hashCode(this.sexo);
        hash = 61 * hash + Objects.hashCode(this.nascimento);
        hash = 61 * hash + Objects.hashCode(this.login);
        hash = 61 * hash + Objects.hashCode(this.senha);
        hash = 61 * hash + Objects.hashCode(this.tipoUsuario);
        hash = 61 * hash + Objects.hashCode(this.dataModificacao);
        hash = 61 * hash + Objects.hashCode(this.dataCriacao);
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
        final Pessoa other = (Pessoa) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.sexo, other.sexo)) {
            return false;
        }
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        if (!Objects.equals(this.tipoUsuario, other.tipoUsuario)) {
            return false;
        }
        if (!Objects.equals(this.nascimento, other.nascimento)) {
            return false;
        }
        if (!Objects.equals(this.dataModificacao, other.dataModificacao)) {
            return false;
        }
        return Objects.equals(this.dataCriacao, other.dataCriacao);
    }

    @Override
    public String toString() {
        return "Pessoa: \n"
                + "......................................." + "\n"
                + "id...: " + id + "\n"
                + "nome...: " + nome + "\n"
                + "sexo...: " + sexo + "\n"
                + "nascimento...: " + nascimento + "\n"
                + "login...: " + login + "\n"
                + "senha...: " + senha + "\n"
                + "tipoUsuario...: " + tipoUsuario + "\n"
                + "dataCriacao...: " + dataCriacao + "\n"
                + "dataModificacao...: " + dataModificacao + "\n"
                + ".......................................";
    }

}
