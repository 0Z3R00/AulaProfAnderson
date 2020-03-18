public class FabricaImpressaoArquivo implements FabricaImpressao{

   @Override
   public Impressao getInstance(String tipo) {
      switch(tipo) {
         case "HELLO":
            return new ImpressaoArquivo();
      }
      return null;
   }


}