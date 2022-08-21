package pacote;

public class Funcionario extends Pessoa{
	private String CTPS;
	private String salario;
	private String cargo;
	
	public void setFunc(String nome,String cep, String cpf, String tel, String CTPS, String salario, String cargo) {
		super.setPessoa(nome, cep, cpf, tel);
		setCTPS(CTPS);
		setSalario(salario);
		setCargo(cargo);
	}
	public String setBCfunconario(){
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
		return (conecta.insert("[dbo].[funcionario]", getNome(), getCep(), getCpf(), getTel(), getCTPS(),getSalario(),getCargo()));
	}
	
	public String getCTPS() {
		return CTPS;
	}
	private void setCTPS(String cTPS2) {
		CTPS = cTPS2;
	}



	public String getSalario() {
		return salario;
	}
	private void setSalario(String salario2) {
		this.salario = salario2;
	}


	protected String getCargo() {
		return cargo;
	}
	private void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
