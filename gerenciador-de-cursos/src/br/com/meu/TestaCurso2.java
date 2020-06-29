package br.com.meu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

      public static void main(String[] args) {
            final Curso c = new Curso("NomeCurso", "InstrutorCurso");

            c.adiciona(new Aula("Aula1", 13));
            c.adiciona(new Aula("MAula", 17));
            c.adiciona(new Aula("FAula3", 2));

            System.out.println(c.getAulas());
            final List<Aula> aulasImutaveis = c.getAulas();
            final List<Aula> aulas = new ArrayList<>(aulasImutaveis);

            Collections.sort(aulas);
            System.out.println(aulas);
            System.out.println(c.getTempoTotal());

            System.out.println(c.toString());

      }

}
