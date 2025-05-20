package ej3codigoDuplicado;

import java.util.Scanner;

public class Calculadora {

	public static void main(String args[]) {
		System.out.println("Elige una operación:");
		System.out.println("1 - Sumar");
		System.out.println("2 - Restar");
		System.out.println("3 - Multiplicar");
		System.out.println("4 - Dividir");
		
		Scanner sc = new Scanner(System.in);
		int operación = sc.nextInt();
		
		switch (operación) {
            case 1:
            	System.out.println("Indícame el primer operando");
            	int a = sc.nextInt();
        		System.out.println("Indícame el segundo operando");
        		int b = sc.nextInt();
            	int resultado = a + b;
                System.out.println("Resultado de la suma: " + resultado);
                break;
            case 2:
            	System.out.println("Indícame el primer operando");
            	a = sc.nextInt();
        		System.out.println("Indícame el segundo operando");
        		b = sc.nextInt();
            	resultado = a - b;
                System.out.println("Resultado de la resta: " + resultado);
                break;
            case 3:
            	System.out.println("Indícame el primer operando");
            	a = sc.nextInt();
        		System.out.println("Indícame el segundo operando");
        		b = sc.nextInt();
            	resultado = a * b;
                System.out.println("Resultado de la multiplicación: " + resultado);
                break;
            case 4:
            	System.out.println("Indícame el primer operando");
            	a = sc.nextInt();
        		System.out.println("Indícame el segundo operando");
        		b = sc.nextInt();
            	if (b != 0) {
                    resultado = a / b;
                    System.out.println("Resultado de la división: " + resultado);
                } else {
                    System.out.println("Error: división por cero.");
                }
                break;
            default:
                System.out.println("Operación no válida.");
        }
		sc.close();
    }
	
}
