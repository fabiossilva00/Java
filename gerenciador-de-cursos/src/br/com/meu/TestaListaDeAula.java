package br.com.meu;

import java.util.ArrayList;
import java.util.Comparator;

public class TestaListaDeAula {
	
	public static void main(String[] args) {
		Aula a1 = new Aula("Aula 1 ", 15);
		Aula a2 = new Aula("Aula 2", 10);
		Aula a3 = new Aula("Aula 3", 25);
		Aula a4 = new Aula("Aula 4", 3);
		
		ArrayList<Aula> aulas = new ArrayList<Aula>();
		
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		aulas.add(a4);
		
		aulas.forEach(aula -> {
			System.out.println(aula.toString());
		});
		
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas.toString());
		
	}
	
}
