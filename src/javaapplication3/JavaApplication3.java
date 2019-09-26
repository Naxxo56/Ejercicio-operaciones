package javaapplication3;

import java.util.Scanner;

/**
 * @author Usuario DAM 1
 */
public class JavaApplication3{
    //cambios cucu bu tras 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int num1 = teclado.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2 = teclado.nextInt();

        //System.out.println("Suma=" + sumar(num1, num2));
        //System.out.println("Resta=" + restar(num1, num2));
        //System.out.println("Multiplicacion=" + multiplicar(num1, num2));
        System.out.println("Division=" + dividir(num1, num2));

    }

    //public static int sumar(int num1, int num2) {
    //int suma = num1 + num2;
    //return suma;
    //}
    //public static int restar(int num1, int num2) {
    //int resta = num1 - num2;
    //return resta;
    //}
    //public static int multiplicar(int num1, int num2) {
    //int multiplicacion = num1 * num2;
    //return multiplicacion;
    //}
    public static double dividir(int num1, int num2) {
        double resultado;

        try {
            resultado = (double)num1 / (double)num2;
        } catch (Exception fallo) {

            System.out.println("segundo operando invalido");
            resultado = 0;
        }

        return resultado;
    }

}

// Commit = garantizar cambios en local.
//Push = subir(al repositorio remoto) cambios garantizados.
//Pull = obtener cambios del repositorio remoto.
