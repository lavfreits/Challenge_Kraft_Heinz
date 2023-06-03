package br.com.fiap.fintech.tests;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.Random;

import br.com.fiap.fintech.dao.DesperdicioDAO;
import br.com.fiap.fintech.dao.MonitoramentoDAO;
import br.com.fiap.fintech.dao.ReducaoAcucarDAO;
import br.com.fiap.fintech.dao.ReducaoAguaDAO;
import br.com.fiap.fintech.dao.RefeicoesDAO;
//import br.com.fiap.fintech.dao.RefeicoesDAO;
import br.com.fiap.fintech.factory.ConnectionFactory;
import br.com.fiap.fintech.model.Desperdicio;
import br.com.fiap.fintech.model.Monitoramento;
import br.com.fiap.fintech.model.ReducaoAcucar;
import br.com.fiap.fintech.model.ReducaoAgua;
import br.com.fiap.fintech.model.Refeicoes;

public class TesteDAOs {

	private static final Connection CONNECTION = ConnectionFactory.getConnection();
		
	public static void main(String[] args) throws SQLException {
		
	
		// Inserir dados na tabela Desperdicio
		Desperdicio desperdicio = new Desperdicio();
		desperdicio.setQtTxDis(15);
		desperdicio.setDtMedicao(new Date(27/05/2023));
		desperdicio.setQtMetaDesperdicio(5);
		desperdicio.setDtMeta(new Date(27/05/2025));
		desperdicio.setDsPossuiIniciativa("Sim");
		desperdicio.setDsIniciativa("Red desperdício");
		desperdicio.setDtConclusaoIniciativa(new Date(27/05/2030));

		DesperdicioDAO desperdicioDAO = new DesperdicioDAO(CONNECTION);
//		desperdicioDAO.inserirDesperdicio(desperdicio);
	
		// Inserir dados na tabela ReducaoAcucar
		ReducaoAcucar reducaoAcucar = new ReducaoAcucar();
		reducaoAcucar.setQtRacucarM(50.5f);
		reducaoAcucar.setQtMetaReducAcucarTotal("100kg");
		reducaoAcucar.setDtMedicao(new Date());
		reducaoAcucar.setDtMeta(new Date());
		reducaoAcucar.setDsPossuiIniciativas("Sim");
		reducaoAcucar.setDsIniciativa("Red açúcar");
		reducaoAcucar.setDtConclusaoIniciativa(new Date());

		ReducaoAcucarDAO reducaoAcucarDAO = new ReducaoAcucarDAO(CONNECTION);
//		reducaoAcucarDAO.inserirReducaoAcucar(reducaoAcucar);

		// Inserir dados na tabela ReducaoAgua
		ReducaoAgua reducaoAgua = new ReducaoAgua();
		reducaoAgua.setQtUaguaLt(100);
		reducaoAgua.setQtMetaReducaoLt(50);
		reducaoAgua.setDtMedicao(new Date());
		reducaoAgua.setDtMeta(new Date());
		reducaoAgua.setDsPssuiIniciat("Sim");
		reducaoAgua.setDsIniciativa("Red de água");
		reducaoAgua.setDtConclusaoIniciativa(new Date());

		ReducaoAguaDAO reducaoAguaDAO = new ReducaoAguaDAO(CONNECTION);
//		reducaoAguaDAO.inserirReducaoAgua(reducaoAgua);
		
		// Inserir dados na tabela Refeicoes
		Refeicoes refeicoes = new Refeicoes();
		refeicoes.setQtRefeiB(500);
		refeicoes.setQtMRefeicoesTotaisBilhoes(10);
		refeicoes.setDtMedicao(new Date());
		refeicoes.setDtMeta(new Date());
		refeicoes.setDsPossuiIniciativas("Sim");
		refeicoes.setDsIniciativa("Redução disp");
		refeicoes.setDtConclusaoIniciativa(new Date());

		RefeicoesDAO refeicoesDAO = new RefeicoesDAO(CONNECTION);
//		refeicoesDAO.inserirRefeicoes(refeicoes);
		
		// Inserir dados na tabela Monitoramento
		Monitoramento monitoramento = new Monitoramento();
		monitoramento.setMrIndicador(new Random().nextInt(100));
		monitoramento.setDtReferencia(new Date());
		
		//Setando as chaves estrangeiras
		monitoramento.setTDesperdicioQtTxDis(desperdicio.getQtTxDis());
		monitoramento.setTReducaoAcucarQtRacucarM(reducaoAcucar.getQtRacucarM());
		monitoramento.setTReducAguaQtUaguaLt(reducaoAgua.getQtUaguaLt());
		monitoramento.setTRefeicoesQtRefeiB(refeicoes.getQtRefeiB());
		
		MonitoramentoDAO monitoramentoDAO = new MonitoramentoDAO(CONNECTION);
		monitoramentoDAO.inserirMonitoramento(monitoramento);
	}

}

