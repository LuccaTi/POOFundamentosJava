
package exercicioJava;


public class ClasseMainExercicio 
{
    public static void main(String[] args)
    {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 25, 'M');
        p[1] = new Pessoa("Maria", 27, 'F');
        
        l[0] = new Livro("Aprendendo Java", "Jose da Silva", 300, p[0]);
        l[1] = new Livro("POO para iniciantes", "Pedro Paulo", 500, p[1]);
        l[2] = new Livro("Java Avancado", "Maria Candido", 800, p[0]);
        
        System.out.println("\n" + l[0].detalhes());
        
        
        
        System.out.println("\n" + l[1].detalhes());
        l[1].folhear(100);
        l[1].avancarPagina();
        
        
        System.out.println("\n" + l[2].detalhes());
        l[2].abrir();
        l[2].folhear(256);
        l[2].avancarPagina();
        
    }
}
