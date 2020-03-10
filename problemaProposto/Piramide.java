package problemaProposto;

public class Piramide extends Triangulo implements Volume{
	
	public Piramide(double base, double altura) {
		super(base, altura);
	}
	
	@Override
	public double area() {
		return  (Math.pow(super.getBase(), 2)) + (4*super.area());
	}

	@Override
	public double perimetro() {
		return 0;
	}
	
	@Override
	public double volume() {
		return (super.getBase()*super.getBase()*super.getAltura())/3;
		
	}

	

}
