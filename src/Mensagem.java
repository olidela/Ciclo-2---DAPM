
public abstract class Mensagem {
	//private String destinatario;
	private String horaEnvio;
	private String conteudo;
	
	public Mensagem (String hEnvio, String message) {
		this.setHoraEnvio(hEnvio);
		this.setConteudo(message);
	}

	public String getHoraEnvio() {
		return horaEnvio;
	}

	public void setHoraEnvio(String horaEnvio) {
		this.horaEnvio = horaEnvio;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	
}
