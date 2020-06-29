package br.com.meu;

public class TestaCurso {

      public static void main(String[] args) {
            final Curso c = new Curso("NomeCurso", "InstrutorCurso");

            c.adiciona(new Aula("Aula1", 13));
            c.adiciona(new Aula("Aula2", 17));
            c.adiciona(new Aula("Aula3", 2));

            System.out.println(c.getAulas());

      }

}
