package AT05.ex1;

public class Livro {
   String titulo;
   String autor;
   int npagina;

   public Livro(String titulo, String aut	or, int npagina){
       this.titulo = titulo;
       this.autor = autor;
       this.npagina = npagina;
   }
   public Livro(){ }
   public Livro(String titulo, String nome){
       this.titulo = titulo;
       this.autor = autor;
   }
   @Override
   public String toString(){
       return "Título: " + titulo
               + "\nAutor: " + autor
               + "\nNumero de páginas: " + npagina;
   }
}
