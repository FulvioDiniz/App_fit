/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Matheus
 */
public class Alimento {

    private long id;
    private static long serial;
    private String nome;
    private double carboidratos;
    private double proteina;
    private double gordura;
    private double caloria;
    private double porcao;
    private String tipoUsuario;
    private LocalDate dataModificacao;
    private LocalDate dataCriacao;

    public Alimento() {
    }

    

    public Alimento(String nome, double carboidratos, double prtoteina, double gordura) {
        id = ++Alimento.serial;
        this.nome = nome;
        this.carboidratos = carboidratos;
        this.proteina = proteina;
        this.gordura = gordura;
        this.porcao = 100.0;
        this.dataCriacao = LocalDate.now();
        this.dataModificacao = LocalDate.now();

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCarboidratos() {
        return carboidratos;
    }

    public void setCarboidratos(double carboidratos) {
        this.carboidratos = carboidratos;
    }

    public double getProteina() {
        return proteina;
    }

    public void setProteina(double proteina) {
        this.proteina = proteina;
    }

    public double getGordura() {
        return gordura;
    }

    public void setGordura(double gordura) {
        this.gordura = gordura;
    }

    public double getCaloria() {
        return caloria;
    }

    public void setCaloria(double caloria) {
        this.caloria = caloria;
    }

    public double getPorcao() {
        return porcao;
    }

    public void setPorcao(double porcao) {
        this.porcao = porcao;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
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
    



    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 19 * hash + Objects.hashCode(this.nome);
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.carboidratos) ^ (Double.doubleToLongBits(this.carboidratos) >>> 32));
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.proteina) ^ (Double.doubleToLongBits(this.proteina) >>> 32));
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.gordura) ^ (Double.doubleToLongBits(this.gordura) >>> 32));
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.caloria) ^ (Double.doubleToLongBits(this.caloria) >>> 32));
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.porcao) ^ (Double.doubleToLongBits(this.porcao) >>> 32));
        hash = 19 * hash + Objects.hashCode(this.tipoUsuario);
        hash = 19 * hash + Objects.hashCode(this.dataModificacao);
        hash = 19 * hash + Objects.hashCode(this.dataCriacao);
        return hash;
    }

    /**
     *
     * @param obj
     * @return
     */
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
        final Alimento other = (Alimento) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.carboidratos != other.carboidratos) {
            return false;
        }
        if (this.proteina != other.proteina) {
            return false;
        }
        if (this.gordura != other.gordura) {
            return false;
        }
        if (this.caloria != other.caloria) {
            return false;
        }
        if (this.porcao != other.porcao) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.tipoUsuario, other.tipoUsuario)) {
            return false;
        }
        if (!Objects.equals(this.dataModificacao, other.dataModificacao)) {
            return false;
        }
        return Objects.equals(this.dataCriacao, other.dataCriacao);
    }

    @Override
    public String toString() {
        return "Alimento" + "/n"
                + "id...: " + id + "/n"
                + "nome...: " + nome + "/n"
                + "carboidratos...: " + carboidratos + "/n"
                + "proteina...: " + proteina + "/n"
                + "gordura...: " + gordura + "/n"
                + "caloria...: " + caloria + "/n"
                + "porcao...: " + porcao + "/n"
                + "tipoUsuario...: " + tipoUsuario + "/n"
                + "dataModificacao...: " + dataModificacao + "/n"
                + "dataCriacao...: " + dataCriacao + "/n";

    }

    

}
