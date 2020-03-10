package problemaProposto;

public class Trapezio extends Poligono{
	private double ladoA, ladoB;

	public Trapezio(double baseA,double baseB, double altura, double ladoA, double ladoB){
		super(baseA, baseB, altura);
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}
	
	@Override
	public double area() {
		return ((super.getBase()+super.getBaseM())*super.getAltura())/2;
	}
	
	@Override
	public double perimetro() {
		return super.getBase()+super.getBaseM()+ladoA+ladoB;
	}




}
