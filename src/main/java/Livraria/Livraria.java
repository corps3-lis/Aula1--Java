
package Livraria;

//Classe/Instância
public class Livraria {
      public static void main(String args[]) {
        System.out.println("Bem-vindo a livraria!");
        
        Livro livro1 = new Livro("Noites Brancas");
        Livro livro2 = new Livro("Crime e castigo");
        Livro livro3 = new Livro("O Idiota");
        
        livro1.genero = "Ficção";
        livro2.genero = "Ficção Policial/Romance";
        livro3.genero = "Romance";
        
        System.out.println("Título: " + livro1.titulo + " Autor: " + livro1.autor + " Gênero: " + livro1.genero);
         System.out.println("Título: " + livro2.titulo + " Autor: " + livro2.autor + " Gênero: " + livro2.genero);
          System.out.println("Título: " + livro3.titulo + " Autor: " + livro3.autor + " Gênero: " + livro3.genero);
}
    }
