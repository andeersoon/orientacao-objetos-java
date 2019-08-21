package aula01;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// três variaveis que representam os lados dos triangulos: X e Y
		double xA, xB, xC, yA, yB, yC;
		
		// leitura dos dados do triangulo X
		System.out.println("Digite as medidas do triângulo X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		// leitura dos dados do triangulo Y
		System.out.println("Digite as medidas do triângulo Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		// calcula a area do triangulo X
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		// calcula a area do triangulo Y
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		// imprime na tela as areas
		System.out.printf("Área do triângulo X: %.4f%n", areaX);
		System.out.printf("Área do triângulo Y: %.4f%n", areaY);
		
		// compara qual das areas é a maior em seguida imprime na tela
		if (areaX > areaY) {
			System.out.println("Área maior: X");
		} else {
			System.out.println("Área maior: Y");
		}
		sc.close();
	}
}