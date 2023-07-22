package edu.ejercicios.EjerciciosEnClase;

public class Ejercicios {
    private double radio;
    private double circunferencia;

    // Constructor de la clase
    public Ejercicios(double radio) {
        this.radio = radio;

    }

    public double obtenerRadio() {
        return radio;
    }
    public double obtenerCircunferencia(){
        return circunferencia;
    }

    public void establecerRadio(double radio) {
        this.radio = radio;
    }

    public void establecerCircunferencia(double circunferencia){
        this.circunferencia= circunferencia;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularCircunferencia(){
        return 2*(Math.PI*radio);
    }
}
