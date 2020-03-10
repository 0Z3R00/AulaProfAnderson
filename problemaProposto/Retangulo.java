package problemaProposto;

public class Retangulo extends Poligono implements Diagonal{

	public Retangulo(double base, double altura) {
		super(base, altura);
	}
	
	@Override
	public double area() {
		return (super.getBase()*super.getAltura());
	}
	
	@Override
	public double perimetro() {
		return 2*(super.getBase()+super.getAltura());
	}

	@Override
	public double diagonal() {
		return Math.sqrt((Math.pow(super.getAltura(), 2))+(Math.pow(super.getBase(), 2)));
	}

}
