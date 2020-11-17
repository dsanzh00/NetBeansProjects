
public class OperacionesStrings {
    public static void main (String [] args){
        
        String cadena1 = "Hola";
        String cadena2 = "Mundo";
        
        int enteroAUnir = 20;
        double decimal = 15.32;
        
        //CONCATENAR
        String concatenacion = cadena1 + cadena2;
        String concatenacion2 = cadena1 + enteroAUnir;
        String concatenacion3 = cadena1.concat(cadena2);
        
        System.out.println("La concatenacion es :" + concatenacion);
        System.out.println("La concatenacion es :" + concatenacion2);
        System.out.println("La concatenacion es :" + concatenacion3);
        
        
        //EXTRAER UNA PORCION DE LA CADENA
        String cadena3 = "Mi lenguaje favorito es Java";
        String extraer = cadena3.substring(24, 28);
        System.out.println(extraer);
        
        //CONTAR CARACTERES
        int contarCadena = cadena3.length();
        System.out.println("La dimension es : "+contarCadena);
        
        //COMPARAR CADENAS
        boolean comparacion1 = "Hola".equals("Hola Mundo");
        String cadena4 = "Hello";
        boolean comparacion2 = cadena4.equals("Hello");
        boolean comparacion3 = "Hello".equals(cadena4);
        System.out.println("La comparacion1 es : " + comparacion1);
        System.out.println("La comparacion2 es : " + comparacion2);
        System.out.println("La comparacion3 es : " + comparacion3);
        
        //QUITAR ESPACIOS EN BLANCO
        String cadena5 = "     Estoy aprendiendo a programar    ";
        System.out.println("Eliminando los espacios : " + cadena5.trim());
        
        //CAMBIAR A MAYUSCULAS
        String cadena6 = "SeguIMOS proBANDo ";
        System.out.println(cadena6.toUpperCase());
        
        //CAMBIAR A MINUSCULAS
        String cadena7 = "SeguIMOS proBANDo ";
        System.out.println(cadena6.toLowerCase());
        
        //REEMPLAZAR CARACTERES
        String cadenaReemplazar = "Cambiaremos la A por *";
        System.out.println(cadenaReemplazar.replace("a", "*"));
        

    }
}
