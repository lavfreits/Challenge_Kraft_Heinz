package br.com.fiap.fintech.model;

import java.util.Date;

public class ReducaoAcucar {
	 private float qtRacucarM;
	 private String qtMetaReducAcucarTotal;
	 private Date dtMedicao;
	 private Date dtMeta;
	 private String dsPossuiIniciativas;
	 private String dsIniciativa;
	 private Date dtConclusaoIniciativa;
	 
	 public float getQtRacucarM() {
	     return qtRacucarM;
	 }
	 
	 public void setQtRacucarM(float qtRacucarM) {
	     this.qtRacucarM = qtRacucarM;
	 }
	 
	 public String getQtMetaReducAcucarTotal() {
	     return qtMetaReducAcucarTotal;
	 }
	 
	 public void setQtMetaReducAcucarTotal(String qtMetaReducAcucarTotal) {
	     this.qtMetaReducAcucarTotal = qtMetaReducAcucarTotal;
	 }
	 
	 public Date getDtMedicao() {
	     return dtMedicao;
	 }
	 
	 public void setDtMedicao(Date dtMedicao) {
	     this.dtMedicao = dtMedicao;
	 }
	 
	 public Date getDtMeta() {
	     return dtMeta;
	 }
	 
	 public void setDtMeta(Date dtMeta) {
	     this.dtMeta = dtMeta;
	 }
	 
	 public String getDsPossuiIniciativas() {
	     return dsPossuiIniciativas;
	 }
	 
	 public void setDsPossuiIniciativas(String dsPossuiIniciativas) {
	     this.dsPossuiIniciativas = dsPossuiIniciativas;
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