
package agregacaoComposicao;

import java.util.Random;


public class Luta 
{
    //Agregação;
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    public void marcarLuta(Lutador L1, Lutador L2)
    {
        if(L1.getCategoria().equals(L2.getCategoria()) && (L1 != L2))
        {
            this.setAprovada(true);
            this.setDesafiante(L1);
            this.setDesafiado(L2);
        } else
        {
            this.setAprovada(false);
            this.setDesafiante(null);
            this.setDesafiado(null);
        }
    }
    
    public void lutar()
    {
        if(this.getAprovada())
        {
            System.out.println("### DESAFIANTE ###");
           this.getDesafiante().apresentar();
            System.out.println("### DESAFIADO ###");
           this.getDesafiado().apresentar();
           
           Random aleatorio = new Random();
           
           //O método gera um valor aleatório;
           int vencedor = aleatorio.nextInt(3); // 0, 1, 2
           
            System.out.println("### RESULTADO ###");
           switch (vencedor)
           {
               case 0: //Empate
                   System.out.println("\nEMPATOU!");
                   this.getDesafiante().empatarLuta();
                   this.getDesafiado().empatarLuta();
                   break;
                   
               case 1: //Desafiante vence
                   System.out.println("\nDESAFIANTE VENCEU!");
                   this.getDesafiante().ganharLuta();
                   this.getDesafiado().perderLuta();
                   System.out.println("Vitoria do " + this.getDesafiante().getNome());
                   break;
                   
               case 2: //Desafiado vence
                   System.out.println("\nDESAFIADO VENCEU!");
                   this.getDesafiante().perderLuta();
                   this.getDesafiante().ganharLuta();
                   System.out.println("Vitoria do " + this.getDesafiado().getNome());
                   break;
           }
           
        }else {
            System.out.println("A luta nao pode acontecer.");
        }
        
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
}
