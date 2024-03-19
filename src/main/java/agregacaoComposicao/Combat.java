
package agregacaoComposicao;

public class Combat 
{
    public static void main(String[] args)
    {
        //Array de lutadores:
        Lutador[] lista = new Lutador[6]; 
        
        lista[0] = new Lutador("Pretty Boy", "Franca", 31, 1.75f, 68.9f, 11, 2, 1);
        lista[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        lista[2] = new Lutador("Snapshador", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        lista[3] = new Lutador("Dead Code", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);
        lista[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        lista[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        
        
        Luta UECluta01 = new Luta();
        UECluta01.marcarLuta(lista[0], lista[1]);
        UECluta01.lutar();
        
        System.out.println("\nSTATUS ATUAL DOS LUTADORES: ");
        lista[0].status();
        lista[1].status();
        
    }
}
