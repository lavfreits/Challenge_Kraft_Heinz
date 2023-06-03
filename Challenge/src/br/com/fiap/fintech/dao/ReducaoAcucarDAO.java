package br.com.fiap.fintech.dao;

//classe DisperdicioDAO: 

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.fintech.model.ReducaoAcucar;

public class ReducaoAcucarDAO {
		
	private Connection conn;
		
	
	public ReducaoAcucarDAO(Connection conn) {

		this.conn = conn;

	}

	public void inserirReducaoAcucar(ReducaoAcucar reducaoAcucar) {
        try (PreparedStatement stmt = conn.prepareStatement("INSERT INTO t_reducao_acucar (qt_racucar_m, qt_meta_reduc_acucar_total, dt_medicao, dt_meta, ds_possui_iniciativas, ds_iniciativa, dt_conclusao_iniciativa) VALUES (?, ?, ?, ?, ?, ?, ?)")) {

            stmt.setFloat(1, reducaoAcucar.getQtRacucarM());
            stmt.setString(2, reducaoAcucar.getQtMetaReducAcucarTotal());
            stmt.setDate(3, new java.sql.Date(reducaoAcucar.getDtMedicao().getTime()));
            stmt.setDate(4, new java.sql.Date(reducaoAcucar.getDtMeta().getTime()));
            stmt.setString(5, reducaoAcucar.getDsPossuiIniciativas());
            stmt.setString(6, reducaoAcucar.getDsIniciativa());
            stmt.setDate(7, new java.sql.Date(reducaoAcucar.getDtConclusaoIniciativa().getTime()));

            stmt.executeUpdate();
            System.out.println("Inserção realizada com sucesso.");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir a redução de açúcar: " + e.getMessage());
        }
    }
}