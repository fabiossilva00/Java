package br.com.meu;

public class TestaBuscaAlunosNoCurso {

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

            final Aluno aluno = curso.buscaMatricula(1);
      }
}
