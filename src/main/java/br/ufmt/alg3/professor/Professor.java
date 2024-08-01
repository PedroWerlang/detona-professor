package br.ufmt.alg3.professor;

public class Professor {
    private String nome;
    private String areaAtuacao;
    private String disciplina;
    private float nota; // Estrela de 0-5 fracionada
    private String semestre; //2024/1
    private String departamento;
    private String comentario;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setAreaAtuacao(String areaAtuacao){
        this.areaAtuacao = areaAtuacao;
    }

    public String getAreaAtuacao(){
        return areaAtuacao;
    }

    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }

    public String getDisciplina(){
        return disciplina;
    }

    public void setNota(float nota){
        this.nota = nota;
    }

    public float getNota(){
        return nota;
    }

    public void setSemestre(String semestre){
        this.semestre = semestre;
    }

    public String getSemestre(){
        return semestre;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public String getDepartamento(){
        return departamento;
    }

    public void setComentario(String comentario){
        this.comentario = comentario;
    }

    public String getComentario(){
        return comentario;
    }
}