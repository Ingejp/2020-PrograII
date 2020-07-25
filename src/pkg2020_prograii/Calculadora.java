package pkg2020_prograii;

public class Calculadora {  //NOMBRE DE LA CLASE  
    //los atributos de clase, no son publicos.
    private int resultadoEntero; //ATRIBUTO DE CLASE
    private double resultadoDecimal; //ATRIBUTO DE CLASE
    private String tipoCalculadora;//Atributo de clase
    //private int cantidadMaximaParametros; 
   
    //Contructor: implicito y explicito
    //Sobrecarga de constructores
    public Calculadora(){
        //this.cantidadMaximaParametros=5;
    }
    public Calculadora(String tipo){
        this.tipoCalculadora=tipo;  
        //this.cantidadMaximaParametros=5;
    }
      
    // ALCANCE DE UNA VARIABLE
    //SOBRECARGA DE METODOS: parametros, tipo de dato
    //REFACTORIZACION
    // VARIABLE
    public int sumar(int primerNumero, int segundoNumero){ //Metodo int
       return primerNumero + segundoNumero;
    }
    
    public int sumar(int arrayParametros[]){
        return 0;
    }
    
    //getter y setter
    //public int getIntResult()
    public int obtenerResultadoEntero(){
        return this.resultadoEntero;
    }
    
    public String obtenerTipo(){
        return this.tipoCalculadora;
    }
    
    //setType
    public void establecerTipo(String tipo){
        this.tipoCalculadora=tipo;
    }
    
    //Sobrecarga por cantidad de parametros
    public int sumar(int primerNumero, int segundoNumero, int tercerNumero){
        return 0;
    }
    
    //Sobgrecarga por tipo de dato
    public double sumar(double primerNumero, double segundoNumero){
        this.resultadoDecimal = primerNumero + segundoNumero;
        return this.resultadoDecimal;
    }
  
    public String mensajeHolaMundo(){ // Metodo String
        return "Hola mundo";
    }  
}
