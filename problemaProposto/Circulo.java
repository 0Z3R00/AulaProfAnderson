package problemaProposto;

public class Circulo  extends Figura{
	private double raio;
	
	public Circulo(double raio) {
		super();
		this.raio = raio;
	}
	
	
	public double getRaio() {
		return raio;
	}

	@Override
	public double area() {
		return Math.PI*(raio*raio);
	}
	
	@Override
	public double perimetro() {
		return 2*Math.PI*raio;
	}


}
