package pacote;

public class Aluno extends Pessoa{
	private String matricula;
	private String turma;
	private String serie;
	private String turno;
	
	
	
	public void setAluno(String nome, String cep, String cpf, String tel, String matricula,String turma, String serie, String turno) {
		super.setPessoa(nome, cep, cpf, tel);
		setMatricula(matricula);
		setTurma(turma);
		setSerie(serie);
		setTurno(turno);
	}
	
	public String setBCaluno(){
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
		return (conecta.insert("[dbo].[aluno]", getNome(), getCep(), getCpf(), getTel(), getMatricula(),getTurma(),getSerie(),getTurno()));
	}
	
	
	private String getMatricula() {
		return matricula;
	}
	private void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	private String getTurma() {
		return turma;
	}
	private void setTurma(String turma) {
		this.turma = turma;
	}
	
	
	private String getSerie() {
		return serie;
	}
	private void setSerie(String serie) {
		this.serie = serie;
	}
	
	
	private String getTurno() {
		return turno;
	}
	private void setTurno(String turno) {
		this.turno = turno;
	}
	
	
}
