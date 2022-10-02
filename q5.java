package project4;

import java.util.Random;

public class q5 {

	public static void main(String[] args) {
		Random r=new Random();
		int vetA[]=new int[5];
		int vetB[]=new int[5];
		int vetC[]=new int[5];
		for(int i=0;i<5;i++) {
			vetA[i]=r.nextInt(10);
			vetB[i]=r.nextInt(10);
			vetC[i]=r.nextInt(10);
		}
		System.out.println("Os elementos do 1 vetor");
		for(int i=0;i<5;i++) {	
			System.out.println(vetA[i]);
		}
		System.out.println("Os elementos do 2 vetor");
		for(int i=0;i<5;i++) {	
			System.out.println(vetB[i]);
		}
		System.out.println("Os elementos do 3 vetor");
		for(int i=0;i<5;i++) {	
			System.out.println(vetC[i]);
		}
		System.out.println("\n");
		System.out.println("as somas");
		for(int num:S(vetA,vetB,vetC)) {
			System.out.println(num);
		}
		System.out.println("os produtos");
		for(int num:P(vetA,vetB,vetC)) {
			System.out.println(num);
		}
		System.out.println("as medias");
		for(float num:M(vetA,vetB,vetC)) {
			System.out.println(num);
		}
		System.out.println("a soma das somas="+Somas(vetA,vetB,vetC));
		System.out.println("o produto dos produtos="+Produtos(vetA,vetB,vetC));
		System.out.println("a media das medias="+Medias(vetA,vetB,vetC));
		/*for(int numero:S(vetA,vetB,vetC)) {
			System.out.println(numero);
		}*/
	
	
	
	
	
	

}
	public static int[] S(int a[],int b[],int c[]) {
		int soma1=0;
		int soma2=0;
		int soma3=0;
		float media1=0;
		float media2=0;
		float media3=0;
		int vet[]=new int[3];
		int i;
		for(i=0;i<a.length;i++) {
			soma1=soma1+a[i];
		}
		for(i=0;i<b.length;i++) {
			soma2=soma2+b[i];
		}
		for(i=0;i<c.length;i++) {
			soma3=soma3+c[i];
		}
		vet[0]=soma1;
		vet[1]=soma2;
		vet[2]=soma3;
		return vet;
		}
		public static int[] P(int a[],int b[],int c[]) {
			int produto1=1;
			int produto2=1;
			int produto3=1;
			int i;
			for(i=0;i<a.length;i++) {
				produto1=produto1*a[i];
			}
			for(i=0;i<b.length;i++) {
				produto2=produto2*b[i];
			}
			for(i=0;i<b.length;i++) {
				produto3=produto3*c[i];
			}
			int vet[]=new int[3];
			vet[0]=produto1;
			vet[1]=produto2;
			vet[2]=produto3;

			return vet;
		}
		public static float[] M(int a[],int b[],int c[]) {
			int i;
			int somas[]=new int[3];
			somas=S(a,b,c);
			float media[]=new float[3];
			media[0]=(float)somas[0]/3;
			media[1]=(float)somas[1]/3;
			media[2]=(float)somas[2]/3;
			return media;
		}
		public static int Somas(int a[],int b[],int c[]) {
			int soma=0;
			int i;
			int v[]=new int[3];
			v=S(a,b,c);
			for(i=0;i<3;i++) {
				soma=soma+v[i];
			}
			return soma;
		}
		public static int Produtos(int a[],int b[],int c[]) {
			int produtos=1;
			int i;
			int v[]=new int[3];
			v=P(a,b,c);
			for(i=0;i<3;i++) {
				produtos=produtos*v[i];
			}
			return produtos;
		}
		public static float Medias(int a[],int b[],int c[]) {
			float media;
			float m[]=new float[3];
			m=M(a,b,c);
			int i;
			media=(float)(m[0]+m[1]+m[2])/3;
			return media;
		}
	}
	
