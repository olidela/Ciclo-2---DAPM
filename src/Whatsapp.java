public class Whatsapp {

	static class mensagem extends Mensagem{

		public mensagem(String hEnvio, String message) {
			super(hEnvio, message);
		}	
	}
	
	//Contato
	static Contato larissa1 = new Contato();
	static String name1 = larissa1.setNome("Larissa");
	static String cell1 = larissa1.setCelular("9990099900");

	
	//Mensagem
	static mensagem larissa = new mensagem("13h", "Oi tudo bom?");
	static String msg1 = larissa.getHoraEnvio();

	private static void listarContatos() {
		System.out.println("Contato: " + larissa1.getNome() + "  Celular: " + larissa1.getCelular());
	  }
	
	private static void listarMensagens() {
		System.out.println(larissa.getHoraEnvio() + ":" + larissa.getConteudo());
	  }
	
	public static void main(String[] args) {
		listarContatos();
		listarMensagens();
}
}