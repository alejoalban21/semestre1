public class Libro {
    //Atributos de la clase
    private int isbn;
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private String disponible;


    //constructor 

    public Libro (int isbn, String titulo, String autor, int anioPublicacion, String disponible){   
    this.isbn = isbn;
    this.titulo = titulo;
    this.autor = autor;
    this.anioPublicacion = anioPublicacion;
    this.disponible = disponible;
}

//Metodos get and set

public int getIsbn(){
    return isbn;
}

public void SetIsbn (int isbn){
    this.isbn = isbn;

}
public String getTitulo(){
        return titulo;

    }
public void setTitulo(String titulo){
    this.titulo = titulo;
}

public String getAutor(){
        return autor;

    }
public void setAutor(String autor){
    this.autor = autor;

}

public int getAniopublicacion(){
    return anioPublicacion;
}

public String getDisponible(){
        return disponible;

    }
public void setDisponible(String disponible){
    this.disponible = disponible;
}


//Metodos toString(sirve para mostrar la informacion del objeto)

public String toString(){
    return "libro [isbn: " + isbn + " titulo: " + titulo + " aniopublicacion: " + anioPublicacion + " disponible: " + disponible + "]";
}

}
