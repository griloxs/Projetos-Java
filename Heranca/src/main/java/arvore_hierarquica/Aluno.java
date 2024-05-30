package arvore_hierarquica;

/**
 * @author Luís
 */

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade de aluno(a)" + this.nome);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int m) {
        this.matricula = m;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String c) {
        this.curso = c;
    }

   
    public String detalhesAluno() {
        return "Matricula: " + matricula + "\nCursando: " + curso;
    }
    
    
}