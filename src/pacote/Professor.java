package pacote;

public class Professor extends Funcionario{
	private String formacao;
	
	public void setProf(String nome,String cep, String cpf, String tel, String CTPS, String salario, String cargo, String formacao) {
		super.setFunc(nome, cep, cpf, tel,CTPS,salario,cargo);
		setFormacao(formacao);
	}
	public String setBCprofessor(){
		Conexao conecta = new Conexao();
		String conn, login,senha;
		conn=("jdbc:sqlserver://luccasdatagold.database.windows.net:1433;"
				+ "database=luccasdatagold;"
				+ "user=luccas.baixinho@luccasdatagold;"
				+ "password=Borges_2006!;"
				+ "encrypt=true;"
				+ "trustServerCertificate=false;"
				+ "hostNameInCertificate=*.database.windows.net;loginTimeout=30;");
		login=("luccas.baixinho@luccasdatagold");
		senha=("Borges_2006!");
		conecta.setReqToConnect(conn,login,senha);				
		return (conecta.insert("[dbo].[professor]", getNome(), getCep(), getCpf(), getTel(), getCTPS(),getSalario(),getCargo(),getFormacao()));
	}
	private String getFormacao() {
		return formacao;
	}

	private void setFormacao(String formacao) {
		this.formacao = formacao;
	}
}
