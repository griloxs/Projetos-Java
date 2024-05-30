package arvore_hierarquia;

import com.mycompany.programascomheranca.Pessoa;

/**
 *
 * @author Luís
 * 
 * Classes Abstratas:  Não podem ser instanciadas e criar
 * objetos, ou seja, serve somente como progenitora (Classe Mãe);
 * 
 * Método Abstrato: Usamos em Interface, ele é declarado mas não
 * implementado na progenitora, sendo colocado dentro de uma interface ou
 * de uma classe abstrata.
 * 
 * Classe Final: Não pode ser herdade por outra classe, sendo assim obrigatóriamente
 * uma "folha", não podendo "ter filhos"
 * 
 * Método Final: Não pode ser sobrescrito pelas subclasses, sendo obrigatóriamente herdado.
 * 
 */
public class ArvoreHierarquica {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        
        
        //Informações Aluno
        /* Aluno a1 = new Aluno();
        a1.setNome("Luis");
        a1.setMatricula(132456);
        a1.setCurso("Informática");
        a1.setIdade(30);
        a1.setSexo("M");
        System.out.println(a1.detalhePessoa());
        System.out.println(a1.detalhesAluno());
        a1.pagarMensalidade();*/
        
        //Informações Visitante
        /* Visitante v1 = new Visitante();
        v1.setNome("Marcia");
        v1.setIdade(60);
        v1.setSexo("F");
        System.out.println(v1.detalhePessoa());*/
        
        //Informações Bolsista
        Bolsista b1 = new Bolsista();
        b1.setNome("Irineu");
        b1.setIdade(23);
        b1.setSexo("M");
        b1.setMatricula(531112);
        b1.setCurso("Padeiro");
        b1.pagarMensalidade();
        b1.renovarBolsa();
        System.out.println(b1.detalhePessoa());
        System.out.println(b1.detalhesAluno());
        
        
    }
}