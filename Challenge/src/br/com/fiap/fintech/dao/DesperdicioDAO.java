package br.com.fiap.fintech.dao;

//classe DisperdicioDAO: 

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.fintech.model.Desperdicio;

public class DesperdicioDAO {
	
	private Connection conn;

	public DesperdicioDAO(Connection conn) {

		this.conn = conn;

	}

    public void inserirDesperdicio(Desperdicio desperdicio) {
    	
    	String sql = "INSERT INTO t_desperdicio (qt_tx_dis, dt_medicao, qt_meta_desperdicio, dt_meta, ds_possui_iniciativa, ds_iniciativa, dt_conclusao_iniciativa) VALUES (?, ?, ?, ?, ?, ?, ?)";

		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			
            stmt.setInt(1, desperdicio.getQtTxDis());
            stmt.setDate(2, new java.sql.Date(desperdicio.getDtMedicao().getTime()));
            stmt.setInt(3, desperdicio.getQtMetaDesperdicio());
            stmt.setDate(4, new java.sql.Date(desperdicio.getDtMeta().getTime()));
            stmt.setString(5, desperdicio.getDsPossuiIniciativa());
            stmt.setString(6, desperdicio.getDsIniciativa());
            stmt.setDate(7, new java.sql.Date(desperdicio.getDtConclusaoIniciativa().getTime()));

            stmt.executeUpdate();
            System.out.println("Inserção realizada com sucesso.");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir o desperdício: " + e.getMessage());
        }
    }

}