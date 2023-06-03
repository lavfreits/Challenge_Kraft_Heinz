package br.com.fiap.fintech.model;

import java.util.Date;

public class Refeicoes {
	 private int qtRefeiB;
	 private int qtMRefeicoesTotaisBilhoes;
	 private Date dtMedicao;
	 private Date dtMeta;
	 private String dsPossuiIniciativas;
	 private String dsIniciativa;
	 private Date dtConclusaoIniciativa;
	 
	 public int getQtRefeiB() {
	     return qtRefeiB;
	 }
	 
	 public void setQtRefeiB(int qtRefeiB) {
	     this.qtRefeiB = qtRefeiB;
	 }
	 
	 public int getQtMRefeicoesTotaisBilhoes() {
	     return qtMRefeicoesTotaisBilhoes;
	 }
	 
	 public void setQtMRefeicoesTotaisBilhoes(int qtMRefeicoesTotaisBilhoes) {
	     this.qtMRefeicoesTotaisBilhoes = qtMRefeicoesTotaisBilhoes;
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