package heranca;

public final class Bolsista extends Aluno
{
    private float bolsa;
    
    public void renovarBolsa()
    {
        System.out.println("Renovando bolsa de " + this.nome);
    }
    
    //Sobreposição do método herdado.
    @Override
    public void pagarMensalidade()
    {
        System.out.println(this.nome + ", bolsista, pagamento realizado!");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
}
