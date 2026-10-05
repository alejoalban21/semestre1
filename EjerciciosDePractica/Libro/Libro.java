public class Libro {
    //Atributos de la clase
    private int isbn;
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean disponible;



    //constructor 

    public Libro (int isbn, String titulo, String autor, int anioPublicacion, boolean disponible){   
    this.isbn = isbn;
    this.titulo = titulo;
    this.autor = autor;
    this.anioPublicacion = anioPublicacion;
    this.disponible = disponible;
}

public boolean estaDisponible(){
    return disponible;
}
public void prestar(){
    disponible = false;
}    

public void devolver (){
    disponible = true;
}

//Metodos get and set

public int getIsbn (){
    return isbn;
}

public void setIsbn(int isbn){
    this.isbn = isbn;
}

public String getAutor (){
    return autor;
}

public void setAutor (String autor){
    this.autor = autor;
}

public String getTitulo(){
    return titulo;
}

public void setTitulo (String titulo){
    this.titulo = titulo;
}

public int getAnioPublicacion (){
    return anioPublicacion;
}
public void setAnioPublicacion (int anioPublicacion){
    this.anioPublicacion = anioPublicacion;
}

public boolean getDisponible (){
    return disponible;
}
public void setDisponible (boolean disponible){
    this.disponible = disponible;
}

//Metodos toString(sirve para mostrar la informacion del objeto)

public String toString(){
    return "libro [isbn: " + isbn + "autor: " + autor + "titulo: " + titulo + " aniopublicacion: " + anioPublicacion + " disponible: " + disponible + "]";
}

}
