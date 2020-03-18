
public final class ProdutorFabricaImpressao{
	private ProdutorFabricaImpressao() {
	}
	
	public static FabricaImpressao getFabrica() {
		int numero = (int)(100000*Math.random());
		numero = numero%2;
		if (numero == 0) {
			return getFabrica("TELA");
		} else {
			return getFabrica("ARQUIVO");
		}
	}
	
	private static FabricaImpressao getFabrica(String tipoFab) {
		switch(tipoFab) {
		case "TELA":
			return new FabricaImpressaoTela();
		case "ARQUIVO":
			return new FabricaImpressaoArquivo();
		}
		return null;
	}
}
