package br.ufmt.alg3;

import br.ufmt.alg3.curso.Curso;
import br.ufmt.alg3.professor.Professor;

public class App 
{
    public static void main( String[] args )
    {
        Curso c = new Curso("SI"); //Declara a variavel "c" e instancia o Objeto;
        System.out.println(c.getNome()); //print

        System.out.println(c.getPeriodo());

        Professor p = new Professor();
        p.setNome("Raphael"); //objeto.metodo(parametro)
        p.setAreaAtuacao("TI");
        p.setDisciplina("Algoritmos III");
        p.setSemestre("2024/1");

        System.out.println(p.getNome());
    }
}