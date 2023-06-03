package br.com.fiap.fintech.dao;

//classe DisperdicioDAO: 

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.fintech.model.ReducaoAgua;

public class ReducaoAguaDAO {
	
	private Connection conn;

	public ReducaoAguaDAO(Connection conn) {

		this.conn = conn;

	}

	public void inserirReducaoAgua(ReducaoAgua reducaoAgua) {
        try (PreparedStatement stmt = conn.prepareStatement("INSERT INTO t_reduc_agua (qt_uagua_lt, qt_meta_reducao_lt, dt_medicao, dt_meta, ds_pssui_iniciat, ds_iniciativa, dt_conclusao_iniciativa) VALUES (?, ?, ?, ?, ?, ?, ?)")) {

            stmt.setInt(1, reducaoAgua.getQtUaguaLt());
            stmt.setInt(2, reducaoAgua.getQtMetaReducaoLt());
            stmt.setDate(3, new java.sql.Date(reducaoAgua.getDtMedicao().getTime()));
            stmt.setDate(4, new java.sql.Date(reducaoAgua.getDtMeta().getTime()));
            stmt.setString(5, reducaoAgua.getDsPssuiIniciat());
            stmt.setString(6, reducaoAgua.getDsIniciativa());
            stmt.setDate(7, new java.sql.Date(reducaoAgua.getDtConclusaoIniciativa().getTime()));

            stmt.executeUpdate();
            System.out.println("Inserção realizada com sucesso.");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir a redução de água: " + e.getMessage());
        }
    }
}