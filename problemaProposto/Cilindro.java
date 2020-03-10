package problemaProposto;

public class Cilindro extends Circulo implements Volume{
	private double altura;
	
	public Cilindro(double raio, double altura) {
		super(raio);
		this.altura = altura;
	}
	
	@Override
	public double area() {
		return super.area() * altura;
	}
	
	@Override
	public double perimetro() {
		return 0;
	}
	

	@Override
	public double volume(){
		return  Math.PI*altura*(Math.pow(super.getRaio(), 3));
	}


}
