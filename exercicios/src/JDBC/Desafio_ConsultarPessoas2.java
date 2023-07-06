package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio_ConsultarPessoas2 {

	//MINHA RESPOSTA
	
	public static void main(String[] args) throws SQLException {

		Scanner entrada = new Scanner(System.in);
	
		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";
		
		System.out.println("Selecione a Composição : \n(Começa, Contém, Termina)");
		String comp = entrada.nextLine();
		
		if (comp.equalsIgnoreCase("Começa".trim()) || 
				comp.equalsIgnoreCase("Contém".trim())||
				comp.equalsIgnoreCase("Termina".trim())) {
			
			System.out.println("Insira o Fragment de Busca:");
			String frag = entrada.nextLine();

			String obj = null;			
			
			if(comp.equalsIgnoreCase("Começa".trim())) {
				obj = frag + "%";	
			} else if (comp.equalsIgnoreCase("Contém".trim())) {
				obj = "%" + frag + "%";
			} else if (comp.equalsIgnoreCase("Termina".trim())) {
				obj = "%" + frag;
			} 
			
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, obj);
			ResultSet resultado = stmt.executeQuery();

			List<Pessoa> pessoas = new ArrayList<>();
			
			while(resultado.next()) {
				int codigo = resultado.getInt("codigo");
				String nome = resultado.getString("nome");
				pessoas.add(new Pessoa(codigo, nome));
			}
			
			for(Pessoa p: pessoas) {
				System.out.println(p.getCodigo() + " ==> " + p.getNome());
			}
			
			stmt.close();
			conexao.close();
			
		} else {
			System.out.println("Composição inválida!!");
		}
		entrada.close();
	}
} 
