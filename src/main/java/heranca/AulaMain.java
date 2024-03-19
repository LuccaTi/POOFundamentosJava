
package heranca;

public class AulaMain {
    public static void main (String[] args)
    {
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(1111);
        a1.setCurso("Analise e Desenvolvimento de Sistemas");
        a1.setIdade(25);
        a1.setSexo("M");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1998);
        b1.setNome("Lucca");
        b1.setBolsa(90.7f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        
                
    }
    
}
