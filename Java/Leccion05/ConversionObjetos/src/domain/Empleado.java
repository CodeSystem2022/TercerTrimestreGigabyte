package domain;

public class Empleado {
    protected String nombre;
    protected double sueldo;
    
    public Empleado(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    //Método para la sobreescritura
    public String obtenerDetalles(){
        return "Nombre: "+this.nombre+", Sueldo: "+this.sueldo;
        
    }
}
