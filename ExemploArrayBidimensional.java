/*Exemplo a seguir preenche um array de 3 linhas e 2 colunas com valores aleatórios, na faixa de 0 a 100, gerados pelo método nextInt(100) da classe Random, e depois visualiza o conteúdo do array no ecrã na forma de tabela.*/

import java.util.Random;
public class ExemploArrayBidimensional
{ 
  public static byte maiorValor(byte [][] ar)
  {
    byte maior = ar[0][0];
    
    for(int i=0;i<ar.length;i++)
    {
      for(int j=0;j<ar[0].length;j++)
      {
        if(ar[i][j]>maior)
        	maior = ar[i][j];
      }
    }
	return maior;  
  }
	
  public static byte[][] criarArray() 
  { 
    byte[][] t = new byte[3][2];
    Random r = new Random();
    for (byte i=0; i < t.length; i++) //linhas
    {  
      for (byte j=0; j < t[0].length; j++)//colunas
      {    
        t[i][j]= (byte) r.nextInt(100); 
      }
	}
	return t;
  }

  public static void visualArray(byte[][] x) 
  { 
    for (byte i=0; i<x.length; i++)
    { 
      for (byte j=0; j<x[0].length; j++)
      {
 		System.out.print(x[i][j]+" ");
      }
	  System.out.println();
    }
  }
  
  public static int somarColuna(int col, byte [][] ar)
  {
	int soma = 0;
	
	for(int i=0;i<ar.length;i++)
	{
		soma += ar[i][col-1];
	}
	return soma;
  }
  
  public static void visualizarMaior(byte m)
  {
	System.out.println("Maior valor e:"+m);
  }
  
  public static void main (String[] args)
  { 
    byte[][] tabela = criarArray();
    visualArray(tabela);
    byte maior = maiorValor(tabela);
    visualizarMaior(maior);
    int soma = somarColuna(1,tabela);
    System.out.println("Soma da coluna 1:"+soma);
  }
} 