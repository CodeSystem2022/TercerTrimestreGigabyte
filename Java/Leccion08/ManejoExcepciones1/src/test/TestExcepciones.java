package test;

import static aritmetica.Aritmetica.division;
import excepciones.OperacionExcepcion;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try{
            resultado = division(10, 2);
        }catch(OperacionExcepcion e){
            System.out.println("Ocurrio un error de tipo OperacionExcepcion");
            System.out.println(e.getMessage());
        }
        try{
           resultado = division(10, 0);     
        }catch(Exception e){
            System.out.println("Ocurrio un error");
           e.printStackTrace(System.out);//Se conoce como la pila de excepciones
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Se reviso la divicion entre cero");
        }
        System.out.println("La variable de resultado tiene como valor: "+resultado);
    }
   
}
