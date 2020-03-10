package aula01;

import java.util.ArrayList;

public class TesteEmpregado {
	
	public static void main(String[] args) {
		ArrayList<Empregado> empregados = new ArrayList<>();
		empregados.add(new Mensalista("Jose Pereira", 3500.0));
		empregados.add(new Gerente("Roberto Almeida", 7000.0));
		empregados.add(new Diretor("Joao Silva", 25000.0));
		empregados.add(new Comissionado("Maria Pereira", 1500.0, 5000.0));
		
		for(Empregado emp:empregados) {
			System.out.println(emp.getNome());
			System.out.println(emp.salario());
			if(emp instanceof Bonus) {
				System.out.println(((Bonus)emp).bonus());
			}
		}
		System.out.println("*****************");
	}

}
