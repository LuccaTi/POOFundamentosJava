
package visibilidade;


public class Caneta 
{
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
   
    
    protected boolean tampada = true;
    
    
    public void status()
    {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada? " + this.tampada);
    }
    
    public void escrever()
    {
        
    }
    
    public void rabiscar()
    {
        if(!this.tampada)
        {
            System.out.println("Estou rabiscando.");
        }else{
            System.out.println("ERRO! caneta tampada.");
        }
    }
    
    public void pintar()
    {
        
    }
    
    protected void tampar()
    {
        if(!this.tampada)
        {
            this.tampada = true;
        }else
        {
            System.out.println("Caneta ja esta tampada!");
        }
    }
    
    protected void destampar()
    {
        if(this.tampada)
        {
            this.tampada = false;
        }else{
            System.out.println("Caneta ja esta destampada!");
        }
    }
    
    
}
