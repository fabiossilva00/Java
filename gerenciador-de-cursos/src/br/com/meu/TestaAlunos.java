package br.com.meu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

      public static void main(String[] args) {
            final Set<String> alunos = new HashSet<>();
            alunos.add("Nomer");
            alunos.add("Aluno");
            alunos.add("Outro");
            alunos.add("Vamos la");
            alunos.add("Vamos la");

            System.out.println(alunos.contains("Nomer"));
            System.out.println(alunos.size());

            System.out.println(alunos);

            System.out.println(alunos);

            System.out.println("Serio q tem isso ?" + alunos.add("Boolean"));

            final Collection<Integer> numeros = new ArrayList<Integer>();

            final long inicio = System.currentTimeMillis();

            for (int i = 1; i <= 50000; i++) {
                  numeros.add(i);
            }

            for (final Integer numero : numeros) {
                  numeros.contains(numero);
            }

            final long fim = System.currentTimeMillis();

            final long tempoDeExecucao = fim - inicio;

            System.out.println("Tempo gasto: " + tempoDeExecucao);

      }

}
