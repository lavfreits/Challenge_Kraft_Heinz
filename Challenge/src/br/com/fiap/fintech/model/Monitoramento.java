package br.com.fiap.fintech.model;

import java.util.Date;

public class Monitoramento {
    private int mrIndicador;
    private Date dtReferencia;
    private int tReducAguaQtUaguaLt;
    private int tRefeicoesQtRefeiB;
    private float tReducaoAcucarQtRacucarM;
    private int tDesperdicioQtTxDis;
    
    public int getMrIndicador() {
        return mrIndicador;
    }
    
    public void setMrIndicador(int mrIndicador) {
        this.mrIndicador = mrIndicador;
    }
    
    public Date getDtReferencia() {
        return dtReferencia;
    }
    
    public void setDtReferencia(Date dtReferencia) {
        this.dtReferencia = dtReferencia;
    }
    
    public int getTReducAguaQtUaguaLt() {
        return tReducAguaQtUaguaLt;
    }
    
    public void setTReducAguaQtUaguaLt(int tReducAguaQtUaguaLt) {
        this.tReducAguaQtUaguaLt = tReducAguaQtUaguaLt;
    }
    
    public int getTRefeicoesQtRefeiB() {
        return tRefeicoesQtRefeiB;
    }
    
    public void setTRefeicoesQtRefeiB(int tRefeicoesQtRefeiB) {
        this.tRefeicoesQtRefeiB = tRefeicoesQtRefeiB;
    }
    
    public float getTReducaoAcucarQtRacucarM() {
        return tReducaoAcucarQtRacucarM;
    }
    
    public void setTReducaoAcucarQtRacucarM(float tReducaoAcucarQtRacucarM) {
        this.tReducaoAcucarQtRacucarM = tReducaoAcucarQtRacucarM;
    }
    
    public int getTDesperdicioQtTxDis() {
        return tDesperdicioQtTxDis;
    }
    
    public void setTDesperdicioQtTxDis(int desperdicio) {
        this.tDesperdicioQtTxDis = desperdicio;
    }

}