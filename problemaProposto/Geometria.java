package problemaProposto;

import java.util.ArrayList;

public class Geometria {

	public static void main(String[] args) {
		ArrayList<Figura> figuras = new ArrayList<>();
		figuras.add(new Circulo(5.0));
		figuras.add(new Quadrado(5.0));
		figuras.add(new Retangulo(5.0, 10.0));
		figuras.add(new Triangulo(5.0, 10.0));
		figuras.add(new Losango(33.2, 10.1));
		figuras.add(new Trapezio(5.0, 10.0, 6.0, 7.0, 8.0));
		figuras.add(new Cubo(8.0));
		figuras.add(new Esfera(8.0));
		figuras.add(new Cilindro(8.0, 5.0));
		figuras.add(new Piramide(8.0, 5.0));

		for(Figura fig:figuras) {
			System.out.println("Area: " + fig.area());
			System.out.println("Perimetro :" + fig.perimetro());
			if(fig instanceof Volume) {
				System.out.println("Volume: " + ((Volume)fig).volume());
			}
			if(fig instanceof Diagonal) {
				System.out.println("Diagonal: " + ((Diagonal)fig).diagonal());
			}
			
			System.out.println("*****************");
		}

	}

}
