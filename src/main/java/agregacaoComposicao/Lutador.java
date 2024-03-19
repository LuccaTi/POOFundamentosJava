
package agregacaoComposicao;


public class Lutador 

{
    //Atributos;
    private String nome, nacionalidade;
    private int idade;
    private float altura, peso;
    private String categoria;
    private int vitorias, derrotas, empates;
    
    
    //Construtor;
    public Lutador(String nome, String nacionalidade, int idade, float altura, 
            float peso, int vitorias, int derrotas, int empates) 
    {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    
    //Métodos públicos;    
    public void apresentar()
    {
        System.out.println("-------------------------------------------");
        System.out.println("Apresentamos o lutador: " + this.getNome());
        System.out.println("Diretamente da(o) " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + " anos e " + this.getAltura() + " de altura,");
        System.out.println("pesando " + this.getPeso() + " Kg,\n");
        
    }
    
    public void status()
    {
        System.out.println(this.getNome() + ", categoria de peso " + this.getCategoria());
        System.out.println("Placar de " + this.getVitorias() + " vitorias,");
        System.out.println(this.getDerrotas() + " derrotas,");
        System.out.println(this.getEmpates() + " empates,\n");
    }
    
    public void ganharLuta()
    {
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta()
    {
        this.setEmpates(this.getDerrotas() + 1);
    }
    
    public void empatarLuta()
    {
        this.setEmpates(this.getEmpates() + 1);
    }
    
    
    //Métodos getters e setters;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
        
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
       if (this.peso < 52.2)
       {
           this.categoria = "invalido";
       } else if (this.peso <= 70.3)
       {
           this.categoria = "leve";
       } else if (this.peso <= 83.9)
       {
           this.categoria = "medio";
       } if (this.peso <= 120.2)
       {
           this.categoria = "pesado";
       } else
       {
           this.categoria = "invalido";
       }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
