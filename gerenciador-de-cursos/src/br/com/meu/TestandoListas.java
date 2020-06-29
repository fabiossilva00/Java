package br.com.meu;

import java.util.ArrayList;

public class TestandoListas {

	public static void main(String[] args) {
		String aula1 = "Aula 1";
		String aula2 = "Aula 2";
		String aula3 = "Aula 3";
		
		ArrayList<String> aulas = new ArrayList<>();
		
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas.toString());
		
		for (String aula : aulas) {
			System.out.println(aula);
		}
		
		
		System.out.println(aulas.get(1));
		System.out.println(aulas.size());
		System.out.println(aulas.isEmpty());
		
		aulas.forEach(aula -> {
			System.out.println(aula);
		});
		System.out.println();
		
		
	}
	
}
