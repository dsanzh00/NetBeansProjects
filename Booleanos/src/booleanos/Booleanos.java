package booleanos;

public class Booleanos {

    public static void main(String[] args) {
        int a = 3;
        int b = 10;
        
        //operadores relacionales
        boolean b1 = a > b;
        boolean b2 = a < b;
        
        
        //operadores booleanos o logicos
        boolean b3 = b1 && b2;
        boolean b4 = b1 || b2;
        boolean b5 = !b1;
        boolean b6 = b1 ^ b2;
        
        System.out.println("El valor de b1 es : "+b1);
        System.out.println("El valor de b2 es : "+b2);
        System.out.println("El valor de b3 es : "+b3);
        System.out.println("El valor de b4 es : "+b4);
        System.out.println("El valor de b5 es : "+b5);
        System.out.println("El valor de b6 es : "+b6);
        
        
        int x = 0;
        int y = 2;
        
        boolean b7 = (x != 0) && ((y/x) != 0);
        System.out.println(b7);

           
    }
    
}
