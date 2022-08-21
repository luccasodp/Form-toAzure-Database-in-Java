package pacote;

public class Responsavel extends Pessoa{
	private String ctt; //contato;

	public void setResponsavel(String nome, String cep, String cpf, String tel, String ctt) {
		super.setPessoa(nome, cep, cpf, tel);
		setCtt(ctt);
	}
	
	public String setBCresponsavel(){
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
		return (conecta.insert("[dbo].[responsavel]", getNome(), getCep(), getCpf(), getTel(), getCtt()));
	}
	
	
	private String getCtt() {
		return ctt;
	}

	private void setCtt(String ctt) {
		this.ctt = ctt;
	}
	
}
