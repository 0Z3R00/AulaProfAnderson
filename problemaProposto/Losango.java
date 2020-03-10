package problemaProposto;

public class Losango extends Poligono {


	public Losango(double base, double altura) {
		super(base, altura);
	}
	@Override
	public double area() {
		return ((super.getBase()*super.getAltura())/2);
	}
	
	@Override
	public double perimetro() {
		return 4*super.getBase();
	}

}
