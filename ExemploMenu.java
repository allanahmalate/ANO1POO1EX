/*Faca um programa com menu, com divisao e metodos e passagem de parametros, para N clientes, receber o sabor da Pizza(M-Margarita, H-Hawaiana, R-Regina), calcular as quantidades totais de cada pizza que foram vendidas e o valor total obtido em cada sabor sabendo que os precos sao 400,500 e 600 respectivamente.*/

import java.io.*;
import java.text.DecimalFormat;
public class ExemploMenu
{
  public static void main (String [] args) throws IOException
  {
	menu();    
  }
  
  //menu do programa
  public static void menu() throws IOException
  {
	byte op;
	int n=0, vp, contM = 0, contH = 0, contR = 0, acumM = 0, acumH = 0, acumR = 0, total;
	final int PRECOM = 400, PRECOH = 500, PRECOR = 600;
	char sabor;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	DecimalFormat mt = new DecimalFormat("###,###.00Mts");
	boolean passou = false;
	
	do
	{
	  System.out.println("   *** MENU ***  ");
	  System.out.println("1. Receber o N ");
	  System.out.println("2. Receber os dados das vendas");
	  System.out.println("3. Quantidades de cada pizza");
	  System.out.println("4. Valores totais por cada pizza");
	  System.out.println("5. Valor total recebido");
	  System.out.println("6. Sair do programa");
	  
	  System.out.println("Introduza a opcao(1-6):");
	  op = Byte.parseByte(br.readLine());
	  
	  switch(op)
	  {
		case 1:
				n = validarN();
				passou = true;
				break;
		case 2:
		     if(passou==false)
			   System.out.println("Executa a opcao 1 primeiro!");
		     else
			 {
				 //ciclo de repeticao
				for(int i=0;i<n;i++)
				{
				  System.out.println("Dados do:"+(i+1)+"-o cliente:");
				  sabor = validarSabor();
				  
				  switch(sabor)
				  {
					case 'M': contM++; //NOTA: operacoes de contagem/acumuladores NAO se fazem dentro de metodos!
							  vp = PRECOM;
							  acumM+=vp;
							  break;
					case 'H': contH++;
							  vp=PRECOH;
							  acumH+=vp;
							  break;
					case 'R': contR++;
							  vp=PRECOR;
							  acumR+=vp;
							  break;
				  }
				  System.out.println("Valor a pagar: "+mt.format(vp));
				  //total += vp; ou pode calcular como soma dos acumuladores (veja case 5);
				}
			 }
			break;
		case 3:
			visualizarQuantidades(contM,contH,contR);
			break;
		case 4:
		    visualizarValoresTotais(acumM,acumH,acumR);
			break;
		case 5:
			total = calcularTotal(acumM,acumH,acumR);
			visualizarTotal(total);
			break;
		case 6: System.out.println("Adeus!");
		default: System.out.println("Opcao Invalida!");
	  }
	} while(op!=6);
  }
  
  //metodo para visualizar o valor total
  public static void visualizarTotal(int t)
  {
	DecimalFormat mt = new DecimalFormat("###,###.00 MTS");
	System.out.println("Valor total recebido:"+mt.format(t));
  }
  
  //metodo para calcular o valor total
  public static int calcularTotal(int a, int b, int c)
  {
	return (a+b+c);  
  }
  
  //metodo para visualizar os acumuladores
  public static void visualizarValoresTotais(int a, int b, int c)
  {
	DecimalFormat mt = new DecimalFormat("###,###.00MTS");
	System.out.println("Valores totais:");
	System.out.println("Margarita:"+mt.format(a)+" Hawaiana:"+mt.format(b)+" Regina:"+mt.format(c));
  }
  
  //metodo para visualizar as quantidades
  public static void visualizarQuantidades(int a, int b, int c)
  {
	System.out.println("Margarita:"+a);
	System.out.println("Hawaiana:"+b);
	System.out.println("Regina:"+c);
  }
  
  //metodo para validar a quantidade de clientes  
  public static int validarN() throws IOException
  {
	int n;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	do
	{
	  System.out.print("Introduza a quantidade de clientes(>0):");
	  n = Integer.parseInt(br.readLine());
	  
	  if(n<=0)
		System.out.println("Erro!");
	} while(n<=0);
	return n;
  }
  
  //metodo para validar o sabor da pizza
  public static char validarSabor() throws IOException
  {
	char s;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	do
	{
      System.out.println("Introduza o sabor da pizza(M-Margarita, H-Hawaiana ou R-Regina:");
	  s = br.readLine().charAt(0);
	  
	  if(s!='M' && s!='H' && s!='R')
		System.out.println("Erro!");
	} while(s!='M' && s!='H' && s!='R');
	return s;
  }
}