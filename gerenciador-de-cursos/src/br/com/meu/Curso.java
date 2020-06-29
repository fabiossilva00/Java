package br.com.meu;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Curso {

      private final String nome;
      private final String instrutor;
      private final List<Aula> aulas = new LinkedList<Aula>();
      private final Set<Aluno> alunos = new HashSet<>();
      private final Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

      public Curso(String nome, String instrutor) {
            super();
            this.nome = nome;
            this.instrutor = instrutor;
      }

      public String getNome() {
            return nome;
      }

      public String getInstrutor() {
            return instrutor;
      }

      public List<Aula> getAulas() {
            return Collections.unmodifiableList(aulas);
      }

      public void adiciona(Aula a) {
            aulas.add(a);
      }

      public int getTempoTotal() {
            return aulas.stream().mapToInt(Aula::getTempo).sum();
      }

      @Override
      public String toString() {
            return String.format("{ Curso: %s, tempo: %d }", nome, getTempoTotal());
      }

      public boolean matricular(Aluno aluno) {
            matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
            return alunos.add(aluno);
      }

      public Set<Aluno> getAlunos() {
            return Collections.unmodifiableSet(alunos);
      }

      public boolean isMatriculado(Aluno aluno) {
            return alunos.contains(aluno);
      }

      public Aluno buscaMatricula(int matricula) {
            return matriculaParaAluno.get(matricula);
      }

}
