

public class TesteImpressao {

	public static void main(String[] args) {
		FabricaImpressao fabrica = ProdutorFabricaImpressao.getFabrica();
		Impressao msg = fabrica.getInstance("HELLO");
		msg.imprime();
	}

}
