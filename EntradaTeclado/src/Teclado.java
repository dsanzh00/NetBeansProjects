import java.util.Scanner;

public class Teclado {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Escribe cuantos años tienes: ");
        int edad = teclado.nextInt();
        System.out.println("Tus años son: "+edad+" Gracias por la info");
        
    }
}
