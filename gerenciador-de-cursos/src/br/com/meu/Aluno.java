package br.com.meu;

import com.sun.istack.internal.NotNull;

public class Aluno {

      @NotNull
      private final String nome;
      private final int numeroMatricula;

      public Aluno(String nome, int numeroMatricula) {
            super();
            this.nome = nome;
            this.numeroMatricula = numeroMatricula;
      }

      public String getNome() {
            return nome;
      }

      public int getNumeroMatricula() {
            return numeroMatricula;
      }

      @Override
      public int hashCode() {
            return nome.hashCode();
      }

      @Override
      public boolean equals(Object obj) {
            final Aluno outroAluno = (Aluno) obj;

            return nome.equals(outroAluno.nome);
      }

      @Override
      public String toString() {
            return String.format("Nome: %s, Matricula: %d", nome, numeroMatricula);
      }

}
