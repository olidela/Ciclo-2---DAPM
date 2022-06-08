public class Contato {
	
	//private : apenas os metodos dentro da classe conseguem acessar o atributo.
	// os metodos da classe whatsapp não conseguem acessar esses atributos.
	
	private String nome;
	private String celular;
	
	// get e set são usados pois as variaveis possuem acesso private
	// assim podemos acessar os atributos.
	
	//permite pegar o valor do atributo
	public String getNome() {
		return nome;
	}
	
	//permite alterar o valor do atributo
	public String setNome(String nome) {
		this.nome = nome;
		return nome;
	}
	public String getCelular() {
		return celular;
	}
	public String setCelular(String celular) {
		this.celular = celular;
		return celular;
	}

}
