
package visibilidade;


public class AulaVisibilidade 
{
    public static void main (String[] args)
    {
        Caneta c1 = new Caneta();
        
        //Atributos públicos.
        c1.modelo = "Caneta bic";
        c1.cor = "Azul";
        c1.carga = 90;
        
        //Atributo protegido, pode ser acessado porque está no mesmo pacote, mesmo sem herança.
        c1.tampada = false;
        
        c1.status();
    }
}
