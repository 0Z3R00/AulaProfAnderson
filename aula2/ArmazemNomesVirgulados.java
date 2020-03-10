package aula2;

import java.util.List;

public class ArmazemNomesVirgulados extends ArmazemNomes {

	public ArmazemNomesVirgulados(List<Nome> nomes) {
		super(nomes);
	}

	@Override
	protected CriadorDeNomes getCriador() {
		return new CriadorDeNomesVirgulados();
	}

}
