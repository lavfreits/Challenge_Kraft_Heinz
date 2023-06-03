package br.com.fiap.fintech.dao;

//classe DisperdicioDAO: 

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.fintech.model.Monitoramento;

public class MonitoramentoDAO {
	
	private Connection conn;

	public MonitoramentoDAO(Connection conn) {

		this.conn = conn;

	}

    public void inserirMonitoramento(Monitoramento monitoramento) {
        try (PreparedStatement stmt = conn.prepareStatement("INSERT INTO t_monitoramento (mr_indicador, dt_referencia, t_reduc_agua_qt_uagua_lt, t_refeicoes_qt_refei_b, t_reducao_acucar_qt_racucar_m, t_desperdicio_qt_tx_dis) VALUES (?, ?, ?, ?, ?, ?)")) {

            stmt.setInt(1, monitoramento.getMrIndicador());
            stmt.setDate(2, new java.sql.Date(monitoramento.getDtReferencia().getTime()));
            stmt.setInt(3, monitoramento.getTReducAguaQtUaguaLt());
            stmt.setInt(4, monitoramento.getTRefeicoesQtRefeiB());
            stmt.setFloat(5, monitoramento.getTReducaoAcucarQtRacucarM());
            stmt.setInt(6, monitoramento.getTDesperdicioQtTxDis());

            stmt.executeUpdate();
            System.out.println("Inserção realizada com sucesso.");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir o monitoramento: " + e.getMessage());
        }
    }

}