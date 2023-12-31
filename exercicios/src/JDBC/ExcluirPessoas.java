package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoas {

	public static void main(String[] args) throws SQLException{
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o c�digo: ");
		int id = entrada.nextInt();
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "DELETE FROM pessoas WHERE codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, id);
		
		int contador = stmt.executeUpdate();
		
		if(contador > 0) {
			System.out.println("Pessoa exlu�da com sucesso!");
		} else {
			System.out.println("Nada feito!");
		}
		
		System.out.println("Linhas afetadas: " + contador);
		
		conexao.close();
		entrada.close();
	}
}
