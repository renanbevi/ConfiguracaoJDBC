package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import factory.ConnectionFactory;

public class TestaListagem {
	
	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory factory = new ConnectionFactory();
			factory.recuperarConexao();
			Connection connection = factory.recuperarConexao();
			
			Statement stm = connection.createStatement();
			stm.execute("SELECT * FROM PRODUTO");
			
			ResultSet rst = stm.getResultSet();
			
			while(rst.next()) {
				int id = rst.getInt("id");
				String nome = rst.getString("nome");
				String descricao = rst.getString("descricao");
				System.out.println(id);
				System.out.println(nome);
				System.out.println(descricao);
				
			}
			
			
			
			
		
		
		
	}
	
	

}
