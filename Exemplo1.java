//importacao da biblioteca
import java.io.*;
//declaracao da classe
public class Exemplo1
{	//declaracao do metodo principal
	public static void main(String[] args) throws IOException
	{
		int a, b, s;
		
		a = validarValor(); //chamada com retorno
		b = validarValor(); //chamada com retorno
		
		s = calcularSoma(a,b); //chamada com retorno e passagem de parametros
		visualizarSoma(s); //chamada void com passagem de parametros
	}
	
	//metodo para validar o valor do teclado
	public static int validarValor() throws IOException
	{
		int z;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			System.out.println("Introduza o valor (>0):");
			z = Integer.parseInt(br.readLine());
	
			if(z<=0)
				System.out.println("Valor invalido!");
		}while(z<=0);
		
		return z;
	}
	
	//método para calcular a soma de dois valores
	public static int calcularSoma(int a, int b)
	{
		int soma;
		soma = a+b;
		return soma;
	}
	
	//metodo para visualizar o resultado da soma
	public static void visualizarSoma(int s)
	{
		System.out.println("Soma: "+s);
	}
}