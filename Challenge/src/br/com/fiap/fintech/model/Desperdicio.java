package br.com.fiap.fintech.model;

import java.util.Date;

public class Desperdicio {
    private int qtTxDis;
    private Date dtMedicao;
    private int qtMetaDesperdicio;
    private Date dtMeta;
    private String dsPossuiIniciativa;
    private String dsIniciativa;
    private Date dtConclusaoIniciativa;
 
    
    public int getQtTxDis() {
        return qtTxDis;
    }
    
    public void setQtTxDis(int qtTxDis) {
        this.qtTxDis = qtTxDis;
    }
    
    public Date getDtMedicao() {
        return dtMedicao;
    }
    
    public void setDtMedicao(Date dtMedicao) {
        this.dtMedicao = dtMedicao;
    }
    
    public int getQtMetaDesperdicio() {
        return qtMetaDesperdicio;
    }
    
    public void setQtMetaDesperdicio(int qtMetaDesperdicio) {
        this.qtMetaDesperdicio = qtMetaDesperdicio;
    }
    
    public Date getDtMeta() {
        return dtMeta;
    }
    
    public void setDtMeta(Date dtMeta) {
        this.dtMeta = dtMeta;
    }
    
    public String getDsPossuiIniciativa() {
        return dsPossuiIniciativa;
    }
    
    public void setDsPossuiIniciativa(String dsPossuiIniciativa) {
        this.dsPossuiIniciativa = dsPossuiIniciativa;
    }
    
    public String getDsIniciativa() {
        return dsIniciativa;
    }
    
    public void setDsIniciativa(String dsIniciativa) {
        this.dsIniciativa = dsIniciativa;
    }
    
    public Date getDtConclusaoIniciativa() {
        return dtConclusaoIniciativa;
    }
    
    public void setDtConclusaoIniciativa(Date dtConclusaoIniciativa) {
        this.dtConclusaoIniciativa = dtConclusaoIniciativa;
    }
	
}