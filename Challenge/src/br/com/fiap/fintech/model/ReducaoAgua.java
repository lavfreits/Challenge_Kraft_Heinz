package br.com.fiap.fintech.model;

import java.util.Date;

public class ReducaoAgua {
	 private int qtUaguaLt;
	 private int qtMetaReducaoLt;
	 private Date dtMedicao;
	 private Date dtMeta;
	 private String dsPssuiIniciat;
	 private String dsIniciativa;
	 private Date dtConclusaoIniciativa;
	 
	 public int getQtUaguaLt() {
	     return qtUaguaLt;
	 }
	 
	 public void setQtUaguaLt(int qtUaguaLt) {
	     this.qtUaguaLt = qtUaguaLt;
	 }
	 
	 public int getQtMetaReducaoLt() {
	     return qtMetaReducaoLt;
	 }
	 
	 public void setQtMetaReducaoLt(int qtMetaReducaoLt) {
	     this.qtMetaReducaoLt = qtMetaReducaoLt;
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
	 
	 public String getDsPssuiIniciat() {
	     return dsPssuiIniciat;
	 }
	 
	 public void setDsPssuiIniciat(String dsPssuiIniciat) {
	     this.dsPssuiIniciat = dsPssuiIniciat;
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