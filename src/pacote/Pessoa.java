package pacote;

public class Pessoa {
	private String nome;
	private String cep;
	private String cpf;
	private String tel;
	
	public void setPessoa(String nome, String cep, String cpf, String tel) {
		setNome(nome);
		setCep(cep);
		setCpf(cpf);
		setTel(tel);
	}
	
	
	
	
	protected String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	protected String getCep() {
		return cep;
	}

	private void setCep(String cep2) {
		this.cep = cep2;
	}

	protected String getCpf() {
		return cpf;
	}

	private void setCpf(String cpf) {
		this.cpf = cpf;
	}

	protected String getTel() {
		return tel;
	}

	private void setTel(String tel2) {
		this.tel = tel2;
	}
}
