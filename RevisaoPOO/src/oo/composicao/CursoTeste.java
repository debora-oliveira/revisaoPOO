package oo.composicao;

public class CursoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Ana");
        Curso curso1 = new Curso("Java completo");
        Curso curso2 = new Curso("Web 2.0");
        Curso curso3 = new Curso("React Native");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        aluno1.adicionarCurso(curso1);
        aluno1.adicionarCurso(curso2);

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);

        for(Aluno aluno: curso3.alunos){
            System.out.println("Matriculado no curso 3: "+aluno.nome);
        }
    }
}
