public class MainInv {
    public static void main(String[] args) throws Exception {
        
        //Creación del arreglo
        int[] a = {6, 5, 9, 1, 8, 3, 2};
        
        //Recorrer y mostrar el arreglo
        for(int i = 0; i < a.length; i++){
            System.out.println("a[" + i + "]=" + a[i]);
        }
        
        //sumar los elementos del arreglo
        int sumaArreglo = 0;
        for(int i = 0; i < a.length; i++){
            sumaArreglo += a[i];
        }
        System.out.println("La suma del arreglo es: " + sumaArreglo);
    }
}

