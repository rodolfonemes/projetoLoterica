/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rnsilva
 */
public class Retirada {
    private String caixa;
    private String funcionario;
    private String periodo;
       
    
    public Retirada(String caixa, String funcionario, String periodo) {
        this.caixa = "";
        this.funcionario = "";
        this.periodo = "";
    }
    
    public Retirada() {
        
        this.caixa = "";
        this.funcionario = "";
        this.periodo = "";
    }

    public String getCaixa() {
        return caixa;
    }

    public void setCaixa(String caixa) {
        this.caixa = caixa;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
      
}
