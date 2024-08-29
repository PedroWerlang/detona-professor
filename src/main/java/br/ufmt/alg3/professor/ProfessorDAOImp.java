package br.ufmt.alg3.professor;

import com.sun.tools.javac.util.List;

import br.ufmt.alg3.curso.Curso;

public class ProfessorDAOImp implements ProfessorDAO {

private List<Curso> banco = new ArrayList<Curso>();

    public void inserir(Curso curso){
        System.out.println("Inserindo curso");
        banco.add(curso);
    } 

    public void remover(Curso curso){
        System.out.println("Removendo Curso");
        banco.remove(curso);
    }
        

    public void atualizar(Curso curso){
        System.out.println("Atualizando curso");
        int idx = banco.indexOf(curso);
        if(idx != -1){
            banco.set(idx, curso)
        }
    }

    public List<Curso> leitura(){
        return banco;
    }
}
