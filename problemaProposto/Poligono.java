package problemaProposto;

public abstract class Poligono extends Figura{
	private double base, altura, baseM;

	public Poligono(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public Poligono(double baseA, double baseB, double altura) {
		super();
		this.base = baseA;
		this.baseM = baseB;
		this.altura = altura;
	}

	@Override
	public double area(){
		return 0;
	}

	@Override
	public double perimetro() {
		return 0;
	}

	public double getBase() {
		return base;
	}

	public double getBaseM() {
		return baseM;
	}

	public double getAltura() {
		return altura;
	}

}
