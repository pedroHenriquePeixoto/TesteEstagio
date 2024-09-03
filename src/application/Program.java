package application;
// Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores
//(exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número,
//ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int numero = sc.nextInt();
		Fibonacci(numero);
		if(Fibonacci(numero)) {
			System.out.println("O numero "+numero+" pertence a sequencia!");
		}
		else {
			System.out.println("O numero "+numero+" não pertence a sequencia!");
		}
		sc.close();
	}
	
	public static boolean Fibonacci(int numero) {
		int a=0;
		int b=1;
		while(b<=numero) {
			if(b==numero) {
				return true;
			}
			int temp = b;
			b = a+b;
			a = temp;
		}
		return false;
	}
}
