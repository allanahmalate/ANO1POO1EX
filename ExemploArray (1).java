//Num array de 10 elementos, armazenar valores aleatorios inteiros de 0 a 100, calcular a sua soma e visualizar os valores no ecra.

public class ExemploArray 
{
  public static void main (String [] args) 
  {
	int soma;
    int [] ar = gerarArray();	  
	visualizar(ar);
	soma = calcularSoma(ar);
	visualizarSoma(soma);
  }
  
  public static void visualizarSoma(int s)
  {
	System.out.println("A soma e igual a:"+s);
  }
  
  public static int calcularSoma(int [] a)
  {
	int soma = 0;
	for(int i=0;i<a.length;i++)
		soma += a[i];
	
	return soma;
  }
  
  //metodo para visualizar array
  public static void visualizar(int [] b)
  {
    for(int i = 0;i<b.length;i++)
      System.out.print(b[i]+" ");
  }
  
  //Criar e devolver o array
  public static int [] gerarArray()
  {
    int [] a = new int [10];
    
    for(int i=0;i<10;i++)
    	a[i] = (int)(Math.random()*101);
    
    return a;
  }
}
