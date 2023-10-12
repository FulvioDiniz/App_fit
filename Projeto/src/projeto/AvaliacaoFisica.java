
import java.util.Date;

public class AvaliacaoFisica {

    private long id;
    private Pessoa pessoa;
    private double peso;
    private double altura;
    private int idade;
    private double pescoço;
    private double cintura;
    private double quadril;
    private double tmb;
    private double bf;
    private double massaGorda;
    private double massaMagra;
    private Date dataCriacao;
    private Date dataAlteracao;
    private double imc;
    private int qtdAtividade;
    private String caracExercicio;

    public long getId() {
        return id;
    }

    public String getCaracExercicio() {
        return caracExercicio;
    }

    public void setCaracExercicio(String caracExercicio) {
        this.caracExercicio = caracExercicio;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPescoço() {
        return pescoço;
    }

    public void setPescoço(double pescoço) {
        this.pescoço = pescoço;
    }

    public double getCintura() {
        return cintura;
    }

    public void setCintura(double cintura) {
        this.cintura = cintura;
    }

    public double getQuadril() {
        return quadril;
    }

    public void setQuadril(double quadril) {
        this.quadril = quadril;
    }

    public double getTmb() {
        return tmb;
    }

    public void setTmb(double tmb) {
        this.tmb = tmb;
    }

    public double getBf() {
        return bf;
    }

    public void setBf(double bf) {
        this.bf = bf;
    }

    public int getQtdAtividade() {
        return qtdAtividade;
    }

    public void setQtdAtividade(int qtdAtividade) {
        this.qtdAtividade = qtdAtividade;
    }

    public double TaxaAtividade() {
        double taxa = 0;
        if(getQtdAtividade() < 1){
            taxa = 1.2;
        }
        else if(getQtdAtividade() >= 1 && getQtdAtividade() <= 3 && getCaracExercicio().equals("Leve")){
            taxa = 1.375;            
        }
        else if(getQtdAtividade() >= 6 && getQtdAtividade() <= 7 && getCaracExercicio().equals("Moderado")){
            taxa = 1.55;
        }
        else if(getQtdAtividade() >= 6 && getQtdAtividade() <= 7 && getCaracExercicio().equals("Intenso")){
            taxa = 1.725;
        }
        else if(getQtdAtividade() >= 6 && getQtdAtividade() <= 7 && getCaracExercicio().equals("Muito Intenso")){
            taxa = 1.9;
        }
        return taxa;
    
    }

    public double CalculoTMB(double peso, double altura, int idade, String sexo) {
        double tmb = 0;
        double fatoratividade = TaxaAtividade();
        if (sexo.equals("Masculino")) {
            tmb = fatoratividade * 66 + (13.7 * peso) + (5 * altura) - (6.8 * idade);
        } else if (sexo.equals("Feminino")) {
            tmb = fatoratividade * 655 + (9.6 * peso) + (1.8 * altura) - (4.7 * idade);
        }
        return tmb;
    }

    public void CalculoBF(double cintura, double quadril, double pescoço, String sexo, double altura) {
        double bf = 0;
        if (sexo.equals("Masculino")) {
            bf = 86.010 * Math.log10(cintura - pescoço) - 70.041 * Math.log10(altura) + 36.76;
            setBf(bf);
            setMassaGorda(bf * getPeso() / 100);
            setMassaMagra(getPeso() - getMassaGorda());
        } else if (sexo.equals("Feminino")) {
            bf = 163.205 * Math.log10(cintura + quadril - pescoço) - 97.684 * Math.log10(altura) - 78.387;
            setBf(bf);
            setMassaGorda(bf * getPeso() / 100);
            setMassaMagra(getPeso() - getMassaGorda());
        }
    }

    public double getMassaGorda() {
        return massaGorda;
    }

    public void setMassaGorda(double massaGorda) {
        this.massaGorda = massaGorda;
    }

    public double getMassaMagra() {
        return massaMagra;
    }

    public void setMassaMagra(double massaMagra) {
        this.massaMagra = massaMagra;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(Date dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public void CalculoIMC(double peso, double altura) {
        setPeso(peso);
        altura = altura / 100;
        double imc = getPeso() / (altura * altura);
        setImc(imc);

    }

    public void analiseAtleta() {
        double parametro = getBf();
        double idade = getIdade();
        Pessoa pessoa = getPessoa();
        if (pessoa.getSexo().equals("Masculino")) {
            if (idade >= 20 && idade <= 29) {
                if (parametro < 11) {
                    System.out.println("Atleta com BF abaixo do normal");
                } else if (parametro >= 11 && parametro <= 13) {
                    System.out.println("Atleta com BF normal");
                } else if (parametro >= 14 && parametro <= 20) {
                    System.out.println("Atleta com BF acima do normal");
                } else if (parametro > 20) {
                    System.out.println("Atleta com BF alto");
                }
            } else if (idade >= 30 && idade <= 39) {
                if (parametro < 12) {
                    System.out.println("Atleta com BF abaixo do normal");
                } else if (parametro >= 12 && parametro <= 14) {
                    System.out.println("Atleta com BF normal");
                } else if (parametro >= 15 && parametro <= 21) {
                    System.out.println("Atleta com BF acima do normal");
                } else if (parametro > 21) {
                    System.out.println("Atleta com BF alto");
                }
            } else if (idade >= 40 && idade <= 49) {
                if (parametro < 14) {
                    System.out.println("Atleta com BF abaixo do normal");
                } else if (parametro >= 14 && parametro <= 16) {
                    System.out.println("Atleta com BF normal");
                } else if (parametro >= 17 && parametro <= 23) {
                    System.out.println("Atleta com BF acima do normal");
                } else if (parametro > 23) {
                    System.out.println("Atleta com BF alto");
                }
            } else if (idade >= 50 && idade <= 59) {
                if (parametro < 15) {
                    System.out.println("Atleta com BF abaixo do normal");
                } else if (parametro >= 15 && parametro <= 17) {
                    System.out.println("Atleta com BF normal");
                } else if (parametro >= 18 && parametro <= 24) {
                    System.out.println("Atleta com BF acima do normal");
                } else if (parametro > 24) {
                    System.out.println("Atleta com BF alto");
                }
            }

        } else {
            if (idade >= 20 && idade <= 29) {
                if (parametro < 16) {
                    System.out.println("Atleta com BF abaixo do normal");
                } else if (parametro >= 16 && parametro <= 19) {
                    System.out.println("Atleta com BF normal");
                } else if (parametro >= 20 && parametro <= 28) {
                    System.out.println("Atleta com BF acima do normal");
                } else if (parametro > 28) {
                    System.out.println("Atleta com BF alto");
                }
            } else if (idade >= 30 && idade <= 39) {
                if (parametro < 17) {
                    System.out.println("Atleta com BF abaixo do normal");
                } else if (parametro >= 17 && parametro <= 20) {
                    System.out.println("Atleta com BF normal");
                } else if (parametro >= 21 && parametro <= 29) {
                    System.out.println("Atleta com BF acima do normal");
                } else if (parametro > 29) {
                    System.out.println("Atleta com BF alto");
                }
            } else if (idade >= 40 && idade <= 49) {
                if (parametro < 18) {
                    System.out.println("Atleta com BF abaixo do normal");
                } else if (parametro >= 18 && parametro <= 21) {
                    System.out.println("Atleta com BF normal");
                } else if (parametro >= 22 && parametro <= 30) {
                    System.out.println("Atleta com BF acima do normal");
                } else if (parametro > 30) {
                    System.out.println("Atleta com BF alto");
                }
            } else if (idade >= 50 && idade <= 59) {
                if (parametro < 19) {
                    System.out.println("Atleta com BF abaixo do normal");
                } else if (parametro >= 19 && parametro <= 22) {
                    System.out.println("Atleta com BF normal");
                } else if (parametro >= 23 && parametro <= 31) {
                    System.out.println("Atleta com BF acima do normal");
                } else if (parametro > 31) {
                    System.out.println("Atleta com BF alto");
                }

            }

        }
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        AvaliacaoFisica avaliacao = new AvaliacaoFisica();
        pessoa.setSexo("Masculino");
        pessoa.setNome("João");
        pessoa.setLogin("joao");
        pessoa.setSenha("123");
        pessoa.setTipoUsuario("Atleta");
        avaliacao.setPessoa(pessoa);
        avaliacao.setPeso(80);
        avaliacao.setAltura(180);
        avaliacao.setIdade(20);
        avaliacao.setPescoço(40);
        avaliacao.setCintura(80);
        avaliacao.setQuadril(90);
        avaliacao.setQtdAtividade(7);
        avaliacao.setCaracExercicio("Muito intenso");
        avaliacao.setTmb(avaliacao.CalculoTMB(avaliacao.getPeso(), avaliacao.getAltura(), avaliacao.getIdade(),
                pessoa.getSexo()));
        avaliacao.CalculoBF(avaliacao.getCintura(), avaliacao.getQuadril(), avaliacao.getPescoço(), pessoa.getSexo(),
                avaliacao.getAltura());
        avaliacao.analiseAtleta();
        avaliacao.CalculoIMC(avaliacao.getPeso(), avaliacao.getAltura());
        System.out.println("TMB: " + avaliacao.getTmb());
        System.out.println("BF: " + avaliacao.getBf());
        System.out.println("Massa Gorda: " + avaliacao.getMassaGorda());
        System.out.println("Massa Magra: " + avaliacao.getMassaMagra());
        System.out.println("IMC: " + avaliacao.getImc());

    }

}
