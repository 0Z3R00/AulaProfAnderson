package problemaProposto;

public class Cubo extends Quadrado implements Volume{
	
	public Cubo(double a) {
		super(a);
	}
	
	@Override
	public double area() {
		return 6*super.getBase();
	}
	
	@Override
	public double perimetro() {
		return 12*super.getBase();
	}
	
	@Override
	public double diagonal() {
		return 0;
	}
	
	@Override
	public double volume(){
		return Math.pow(super.getBase(), 3);
	}
	
	

}
