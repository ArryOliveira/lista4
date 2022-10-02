package project4;

import java.util.Scanner;

public class q7 {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		String frase;
		frase=ler.nextLine();
		inverte(frase);
	}
	public static void inverte(String x) {
		   char reversa[]=x.toCharArray();
		  int tam=reversa.length;
		  int i;
		   int fim=tam-1;
		   char aux;
		   for(i=0;i<tam;i++) {
			   System.out.println(reversa[i]);
		   }
		   for(i=0;i<tam/2;i++) {
			   aux=reversa[fim];
			   reversa[fim]=reversa[i];
			   reversa[i]=aux;
			   fim--;
		   }
		   /*for(i=0;i<tam/2;i++) {
			   aux=reversa[fim];
			   reversa[fim]=reversa[i];
			   reversa[i]=aux;}*/
			  
		   x=new String(reversa);
		   System.out.println(reversa);
	}
		  
}
