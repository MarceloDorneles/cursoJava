package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio_AtualizarRegistro {

	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		
		Connection conexao = FabricaConexao.getConexao();
		String comandoSQL1 = "SELECT * FROM pessoas WHERE codigo = ?";
		String comandoSQL2 = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
		
		List<Pessoa> pessoasNovas = new ArrayList<>();
		List<Pessoa> pessoasAntigas = new ArrayList<>();
		
		System.out.print("Selecione o ID, que deseja alterar: ");
		int id = entrada.nextInt();
		
		System.out.print("Novo nome: ");
		String novoNome = entrada2.nextLine();
		
		PreparedStatement ppst = conexao.prepareStatement(comandoSQL1);
		ppst.setInt(1, id);
		ResultSet resultado1 = ppst.executeQuery();
		
		while(resultado1.next()) {
			int codigo = resultado1.getInt("codigo");
			String nome = resultado1.getString("nome");
			pessoasAntigas.add(new Pessoa(codigo, nome));
		}
		
		
		ppst.close();
		
		
		PreparedStatement ppst2 = conexao.prepareStatement(comandoSQL2);
		ppst2.setString(1, novoNome);
		ppst2.setInt(2, id);
		ppst2.execute();
		System.out.println("Alteração Realizada!");
		ppst2.close();
		
		PreparedStatement ppst3 = conexao.prepareStatement(comandoSQL1);
		ppst3.setInt(1, id);
		ResultSet resultado2 = ppst3.executeQuery();
		
		while(resultado2.next()) {
			int codigo = resultado2.getInt("codigo");
			String nome = resultado2.getString("nome");
			pessoasNovas.add(new Pessoa(codigo, nome));
		}
		
		for(Pessoa p: pessoasAntigas) {
			System.out.println("Nome Antigo: " + p.getNome());
		}
		
		for(Pessoa p: pessoasNovas) {
			System.out.println("Nome Novo: " + p.getNome());
		}
		
		ppst2.close();

		conexao.close();
		entrada.close();
		entrada2.close();
	}
}


/*
				RESPOSTA PROFESSOR


	public statci void main (String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("");
		int codigo = entrada.nextInt();
		
		String select = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
		String update = "UPDATE pessoas SET nome = ? WHERE codigo= ?";
		
		Connection conexao = FabricaConexaoger.getConexao();
		PreparedStatement stmt = conexao.prepareStatement(select);
		stmt.setInt(1,codigo);
		ResultSet r = stmt.executeQuery();
		
		if(resultado.next()) {
			Pessoa p = new Pessoa(r.getInt(1), r.getString(2));
			
			System.out.println("O nome atual é " + p.getNome());
			
			System.out.print("Informe o novo nome: ");
			String novoNome = entrada.nextLine();
			
			stmt.close();
			stmt = conexao.PrepareStatement(update);
			stmt.SetString(1, novoNome);
			stmt.SetInt(2, codigo);
			
			System.out.println("Pessoa Alterada com sucesso!");
		}


		conexao.close();
		entrada.close();

	}
*/