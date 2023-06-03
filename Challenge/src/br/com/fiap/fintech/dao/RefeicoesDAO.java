package br.com.fiap.fintech.dao;

//classe DisperdicioDAO: 

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.fintech.model.Refeicoes;

public class RefeicoesDAO {
	
	private Connection conn;

	public RefeicoesDAO(Connection conn) {

		this.conn = conn;

	}

	public void inserirRefeicoes(Refeicoes refeicoes) {
        try (PreparedStatement stmt = conn.prepareStatement("INSERT INTO t_refeicoes (qt_refei_b, qt_mrefeicoes_totais_bilhoes, dt_medicao, dt_meta, ds_possui_iniciativas, ds_iniciativa, dt_conclusao_iniciativa) VALUES (?, ?, ?, ?, ?, ?, ?)")) {

            stmt.setInt(1, refeicoes.getQtRefeiB());
            stmt.setInt(2, refeicoes.getQtMRefeicoesTotaisBilhoes());
            stmt.setDate(3, new java.sql.Date(refeicoes.getDtMedicao().getTime()));
            stmt.setDate(4, new java.sql.Date(refeicoes.getDtMeta().getTime()));
            stmt.setString(5, refeicoes.getDsPossuiIniciativas());
            stmt.setString(6, refeicoes.getDsIniciativa());
            stmt.setDate(7, new java.sql.Date(refeicoes.getDtConclusaoIniciativa().getTime()));

            stmt.executeUpdate();
            System.out.println("Inserção realizada com sucesso.");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir as refeições: " + e.getMessage());
        }
    }
}