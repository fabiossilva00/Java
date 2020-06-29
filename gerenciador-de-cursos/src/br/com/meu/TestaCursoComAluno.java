package br.com.meu;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

      public static void main(String[] args) {

            final Curso curso = new Curso("Abobrinha", "Gilo");
            curso.adiciona(new Aula("Capitulo 1", 2));
            curso.adiciona(new Aula("Capitulo 1", 15));
            curso.adiciona(new Aula("Capitulo 1", 7));
            curso.adiciona(new Aula("Capitulo 1", 10));
            curso.adiciona(new Aula("Capitulo 1", 3));

            final Aluno aluno1 = new Aluno("Aluno Primeiro", 1);
            final Aluno aluno2 = new Aluno("Segundo Aluno", 2);
            final Aluno aluno3 = new Aluno("Aluno 3", 3);
            final Aluno aluno4 = new Aluno("Aluno Quatro", 4);

            curso.matricular(aluno1);
            curso.matricular(aluno2);
            curso.matricular(aluno3);

            final Set<Aluno> alunos = curso.getAlunos();
            alunos.forEach(aluno -> {
                  //                  System.out.println(aluno);
            });

            final Iterator<Aluno> iteratorAlunos = alunos.iterator();
            while (iteratorAlunos.hasNext()) {
                  final Aluno aluno = iteratorAlunos.next();
                  System.out.println(aluno);
            }

            System.out.println(alunos.contains(aluno3));
            System.out.println(curso.getAlunos().contains(aluno4));

            final boolean isMatriculado = curso.isMatriculado(aluno1);
            System.out.println(isMatriculado);

            final Aluno alunoDeNovo = new Aluno("Aluno 3", 3);
            curso.matricular(alunoDeNovo);
            System.out.println(curso.isMatriculado(alunoDeNovo));

      }

}
