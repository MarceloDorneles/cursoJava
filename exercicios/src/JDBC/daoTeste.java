package JDBC;

public class daoTeste {

	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome, codigo) VALUES (?, ?)";
		System.out.println(dao.incluir(sql, "Filomena Susana Malessa", 1000));
		System.out.println(dao.incluir(sql, "Maria Eduarda Malessa Dorneles", 1001));
		System.out.println(dao.incluir(sql, "Rafael Melo", 1002));
		
		dao.close();
		
		;
	}
}
