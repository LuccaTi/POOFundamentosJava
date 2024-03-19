package fundamentosComExemplos;

public class Aluno extends Pessoas
{
    private int matricula;
    private String curso;
    
    public void cancelarMatricula()
    {
        System.out.println("Matricula sera cancelada!");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
