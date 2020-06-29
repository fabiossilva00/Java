package br.com.meu;

public class Aula implements Comparable<Aula> {

	private String titulo;
	private int tempo;
	
	Aula(final String titulo, final int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	@Override
	public String toString() {
		return String.format("Aula: %s, duração: %d", this.titulo, this.tempo);
	}

	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
	}
	
}
