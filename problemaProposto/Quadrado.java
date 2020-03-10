package problemaProposto;

public class Quadrado extends Poligono implements Diagonal{

	public Quadrado(double base) {
		super(base,base);
	}

	@Override
	public double area() {
		return (super.getBase()*super.getBase());
	}

	@Override
	public double perimetro() {
		return 4*super.getBase();
	}

	@Override
	public double diagonal() {
		return super.getBase()*(Math.sqrt(2));
	}

}
