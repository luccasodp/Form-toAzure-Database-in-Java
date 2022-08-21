package pacote;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;


public class Conexao {
	String conn;
	String login;
	String senha;
	
	
	public void setReqToConnect(String conn,String login, String senha) {
		setConn(conn);
		setLogin(login);
		setSenha(senha);
	}
	
	public String insert(String tabela,String a1){
		String sql= "Insert Into "+tabela+" values ('"+a1+"'');";
			
		ConnAndInsert(getLogin(),getSenha(),sql,getCnnString());
		return("Os dados foram inseridos com sucesso");
	}
	
	public String insert(String tabela,String a1,String a2){
		String sql= "Insert Into "+tabela+" values ('"+a1+"','"+a2+"');";
			
		ConnAndInsert(getLogin(),getSenha(),sql,getCnnString());
		return("Os dados foram inseridos com sucesso");
	}	
	
	public String insert(String tabela,String a1,String a2, String a3){
		String sql= "Insert Into "+tabela+" values ('"+a1+"','"+a2+"','"+a3+"');";
			
		ConnAndInsert(getLogin(),getSenha(),sql,getCnnString());
		return("Os dados foram inseridos com sucesso");
	}	
	
	public String insert(String tabela,String a1,String a2, String a3,String a4){
		String sql= "Insert Into "+tabela+" values ('"+a1+"','"+a2+"','"+a3+"','"+a4+"');";
			
		ConnAndInsert(getLogin(),getSenha(),sql,getCnnString());
		return("Os dados foram inseridos com sucesso");
	}	
	
	public String insert(String tabela,String a1,String a2, String a3,String a4,String a5){
		String sql= "Insert Into "+tabela+" values ('"+a1+"','"+a2+"','"+a3+"','"+a4+"','"+a5+"');";
			
		ConnAndInsert(getLogin(),getSenha(),sql,getCnnString());
		return("Os dados foram inseridos com sucesso");
	}	
	
	public String insert(String tabela,String a1,String a2, String a3,String a4,String a5,String a6){
		String sql= "Insert Into "+tabela+" values ('"+a1+"','"+a2+"','"+a3+"','"+a4+"','"+a5+"','"+a6+"');";
			
		ConnAndInsert(getLogin(),getSenha(),sql,getCnnString());
		return("Os dados foram inseridos com sucesso");
	}	
	
	public String insert(String tabela,String a1,String a2, String a3,String a4,String a5,String a6,String a7){
		String sql= "Insert Into "+tabela+" values ('"+a1+"','"+a2+"','"+a3+"','"+a4+"','"+a5+"','"+a6+"','"+a7+"');";
			
		ConnAndInsert(getLogin(),getSenha(),sql,getCnnString());
		return("Os dados foram inseridos com sucesso");
	}		
	
	public String insert(String tabela,String a1,String a2, String a3,String a4,String a5,String a6,String a7, String a8){
		
		String sql= "Insert Into "+tabela+" values ('"+a1+"','"+a2+"','"+a3+"','"+a4+"','"+a5+"','"+a6+"','"+a7+"','"+a8+"');";
			
		ConnAndInsert(getLogin(),getSenha(),sql,getCnnString());
		return("Os dados foram inseridos com sucesso");	
	}
	
	public String insert(String tabela,String a1,String a2, String a3,String a4,String a5,String a6,String a7, String a8, String a9){
		
		String sql= "Insert Into "+tabela+" values ('"+a1+"','"+a2+"','"+a3+"','"+a4+"','"+a5+"','"+a6+"','"+a7+"','"+a8+"','"+a9+"');";
			
		ConnAndInsert(getLogin(),getSenha(),sql,getCnnString());
		return("Os dados foram inseridos com sucesso");	
	}
	
	public String insert(String tabela,String a1,String a2, String a3,String a4,String a5,String a6,String a7, String a8, String a9,String a10){
		
		String sql= "Insert Into "+tabela+" values ('"+a1+"','"+a2+"','"+a3+"','"+a4+"','"+a5+"','"+a6+"','"+a7+"','"+a8+"','"+a9+"','"+a10+"');";
			
		ConnAndInsert(getLogin(),getSenha(),sql,getCnnString());
		return("Os dados foram inseridos com sucesso");	
				
	}
		
		
	
	
	
	
	private void ConnAndInsert(String nome, String senha, String sql, String cnnStr) {
		try	(Connection cnn = DriverManager.getConnection(cnnStr);
				PreparedStatement statement = cnn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);){
			ResultSet resultSet=null;
			statement.execute();
			resultSet = statement.getGeneratedKeys();
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}	
	
	
	private void setConn(String Conn) {
		this.conn=Conn;
	}
	
	private void setLogin(String login) {
		this.login=login;
	}
	
	private void setSenha(String senha) {
		this.senha=senha;
	}
	
	private String getLogin() {
		return(login);
	}
	private String getSenha() {
		return senha;
	}
	private String getCnnString() {
		return(conn);
	}
}





