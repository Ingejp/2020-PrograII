/*
 primera forma de comentarios
 */

//segunda forma de comentarios


package pkg2020_prograii;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();  // crea objeto sin inicializar nada
        calculadora.establecerTipo("Calculadora Básica");// se inicializan los atributos atraves de metodos set
        
        Calculadora calculadora2= new Calculadora("Calculadora Básica"); // crea objeto inicializando recursos
        
        
        System.out.println("el resultado es: " + calculadora.sumar(10, 25));
        
        System.out.println("el atributo publico es: " + calculadora.obtenerResultadoEntero() );
        
        System.out.println("el tipo de calculadora es: " + calculadora.obtenerTipo());
        System.out.println("el tipo de calculadora es: " + calculadora2.obtenerTipo());
        
    }
    
}
