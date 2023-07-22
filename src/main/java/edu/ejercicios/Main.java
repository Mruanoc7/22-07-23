package edu.ejercicios;

import edu.ejercicios.EjerciciosEnClase.Ejercicios;
import edu.ejercicios.ejemplos.clsEjemplo1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String varA = "";
        String varB = "";
        try {
            BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingresa A:");
            varA = lector.readLine();
            System.out.println("Ingresa B:");
            varB = lector.readLine();

            int a = Integer.parseInt(varA);
            int b = Integer.parseInt(varB);

            clsEjemplo1 ej = new clsEjemplo1();
            ej.calculo(a, b);
            System.out.println("Valor A: " + a + " Valor B: " + b );

            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingresa el radio del círculo: ");
            double radio = scanner.nextDouble();


            Ejercicios circle = new Ejercicios(radio);
            double area = circle.calculateArea();
            double circunferencia=circle.calcularCircunferencia();


            System.out.println("El área del círculo con radio " + radio + " es: " + area);
            System.out.println("La circunferencia del círculo con radio " + radio + " es: " + circunferencia);
        } catch (Exception ex) {
            System.out.println("Ingreso mal el dato!");
        }
    }
}
