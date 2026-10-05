public class MainLibro {
    public static void main(String[]args){
Libro libro1 = new Libro (12345, "motocicletas", "valentino rossi", 2000, true);
System.out.println(libro1);
    
    libro1.prestar();
    System.out.println(libro1);

    libro1.devolver();
    System.out.println(libro1.estaDisponible());
    
Libro libro2 = new Libro (123456, "la aventura", "romeo santos", 1928, true);
System.out.println (libro2);

libro2.prestar();
System.out.println(libro2);

libro2.devolver();
System.out.println(libro2.estaDisponible());

Libro libro3 = new Libro (1234567,"El viaje", "Ana Garcia", 1998,false);
System.out.println(libro3);

libro3.devolver();
System.out.println(libro3.estaDisponible());

Libro libro4 = new Libro (12345678, "Don Quijote de la Mancha", "Miguel Cervantes",1989,false);
System.out.println(libro4);

libro4.devolver();
System.out.println(libro4.estaDisponible());

libro4.prestar();
System.out.println(libro4);

Libro libro5 = new Libro (123456789, "POO", "Jhon Cano", 2001,true);
System.out.println(libro5);

libro5.prestar();
System.out.println(libro5);

libro5.devolver();
System.out.println(libro5.estaDisponible());
}
}

