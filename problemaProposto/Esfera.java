package problemaProposto;

public class Esfera extends Circulo implements Volume{
	
	public Esfera(double raio) {
		super(raio);
	}
	
	@Override
	public double area() {
		return 4*Math.PI*Math.pow(super.getRaio(), 2);
	}
	
	@Override
	public double perimetro() {
		return 2*Math.PI*super.getRaio();
	}
	
	@Override
	public double volume() {
		
		return  (Math.PI*(Math.pow(super.getRaio(),3)))*1.3333333333333;
	}
	

}
