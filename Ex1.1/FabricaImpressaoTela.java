public class FabricaImpressaoTela implements FabricaImpressao{

@Override
	public Impressao getInstance(String tipo) {
		switch(tipo) {
		case "HELLO":
			return new ImpressaoTela();
		}
		return null;
	}


} 