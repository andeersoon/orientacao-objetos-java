package aula02.application;

import java.util.Scanner;
import aula02.entities.Triangle;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// criando variaveis X e Y do tipo Triangle
		Triangle x, y;
		
		// instanciando objetos
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Digite as medidas do triângulo X: ");
		x.a = sc.nextDouble();// faz a leitura dos dados e armazena em cada atributo especificado
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite as medidas do triângulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		// calcula a area do triangulo X
		double p = (x.a + x.b + x.b) / 2.0;
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

		// calcula a area do triangulo Y
		p = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

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