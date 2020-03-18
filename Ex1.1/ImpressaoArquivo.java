
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ImpressaoArquivo implements Impressao{

	@Override
	public void imprime() {
		try {
			PrintWriter writer = new PrintWriter("output.txt");
			writer.write("Hello World !!!");
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
