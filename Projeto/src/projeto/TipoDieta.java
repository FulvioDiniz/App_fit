/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.time.LocalDateTime;
import java.util.Objects;
/**
 *
 * @author Matheus
 */
public class TipoDieta {
    
    private long id;
    private String nome;
    private double carboidrato;
    private double proteína;
    private double gordura;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataModificacao;

    public TipoDieta() {
    }
    
    

    public TipoDieta(long id, String nome, double carboidrato, double proteína, double gordura, LocalDateTime dataCriacao, LocalDateTime dataModificacao) {
        this.id = id;
        this.nome = nome;
        this.carboidrato = carboidrato;
        this.proteína = proteína;
        this.gordura = gordura;
        this.dataCriacao = dataCriacao;
        this.dataModificacao = dataModificacao;
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

    public double getCarboidrato() {
        return carboidrato;
    }

    public void setCarboidrato(double carboidrato) {
        this.carboidrato = carboidrato;
    }

    public double getProteína() {
        return proteína;
    }

    public void setProteína(double proteína) {
        this.proteína = proteína;
    }

    public double getGordura() {
        return gordura;
    }

    public void setGordura(double gordura) {
        this.gordura = gordura;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDateTime getDataModificacao() {
        return dataModificacao;
    }

    public void setDataModificacao(LocalDateTime dataModificacao) {
        this.dataModificacao = dataModificacao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.carboidrato) ^ (Double.doubleToLongBits(this.carboidrato) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.proteína) ^ (Double.doubleToLongBits(this.proteína) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.gordura) ^ (Double.doubleToLongBits(this.gordura) >>> 32));
        hash = 89 * hash + Objects.hashCode(this.dataCriacao);
        hash = 89 * hash + Objects.hashCode(this.dataModificacao);
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
        final TipoDieta other = (TipoDieta) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.carboidrato) != Double.doubleToLongBits(other.carboidrato)) {
            return false;
        }
        if (Double.doubleToLongBits(this.proteína) != Double.doubleToLongBits(other.proteína)) {
            return false;
        }
        if (Double.doubleToLongBits(this.gordura) != Double.doubleToLongBits(other.gordura)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.dataCriacao, other.dataCriacao)) {
            return false;
        }
        return Objects.equals(this.dataModificacao, other.dataModificacao);
    }

    @Override
    public String toString() {
        return "***********************************"
               +"TipoDieta" + "\n" 
               + "id...: " + id + "\n" 
               + "nome...: " + nome + "\n"
               + "carboidrato...: " + carboidrato +"\n"
               + "proteina...: " + proteína + "\n"
               + "gordura...: " + gordura + "\n"
               + "dataCriacao...: " + dataCriacao +"\n"
               + "dataModificacao...: " + dataModificacao + "\n"
               +"***********************************";
    }
    
    
    
    
    
    
}
