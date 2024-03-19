
package exercicioJava;

public class Livro implements Publicacao
{
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    
    public String detalhes() {
        return "Livro:\n" + "titulo: " + titulo + ", autor: " + autor + ", totalPaginas: " + totalPaginas + 
                ", paginaAtual: " + paginaAtual + ", aberto: " + aberto + ", leitor: " + leitor.getNome();
    }
    
    
  
    
    //Construtor:
    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginaAtual = 0;
        this.leitor = leitor;
        this.aberto = false;
    }
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String     autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int pagina) {
        if(pagina < this.totalPaginas && pagina >= 0 && this.getAberto()){
        this.setPaginaAtual(pagina);  
        } else {
            System.out.println("Impossivel folhear, livro fechado ou pagina inserida invalida!");
        }
    }

    @Override
    public void avancarPagina() {
        if(this.getAberto() && this.getPaginaAtual() >= 0 && this.getPaginaAtual() < this.getTotalPaginas()){
        this.setPaginaAtual(this.getPaginaAtual() + 1);  
        } else {
            System.out.println("Impossivel avancar pagina, livro fechado ou pagina inserida invalida!");
        }
    }

    @Override
    public void voltarPagina() {
        if(this.getAberto() && this.getPaginaAtual() > 0 && this.getPaginaAtual() <= this.getTotalPaginas()){
        this.setPaginaAtual(this.getPaginaAtual() - 1);  
        } else {
            System.out.println("Impossivel voltar pagina, o livro esta fechado ou a pagina e invalida!");
        }
    }
    
    
}
