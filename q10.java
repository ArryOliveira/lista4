package project4;

import java.util.Scanner;

public class q10 {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int n;
		String x;
		System.out.println("digite um numero");
		x=ler.nextLine();
		int tam=x.length();
		int numero[]=new int[tam];
		for(int i=0;i<tam;i++) {
			numero[i]=Character.getNumericValue(x.charAt(i));
			
		}
		VerificaArmstrong(numero);
		}
		
	public static void VerificaArmstrong(int n[]) {
		int somaArmstrong=0;
		int somaOriginal=0;
		int tam=n.length-1;
		for(int x=0;x<n.length;x++) {
			somaOriginal=(int) (somaOriginal+(n[x]*Math.pow(10,tam)));
			tam--;
		}
		System.out.println(somaOriginal);
		for(int x=0;x<n.length;x++) {
			somaArmstrong=(int) (somaArmstrong+Math.pow(n[x],3));
		}
		System.out.println(somaArmstrong);
		if(somaArmstrong==somaOriginal) {
			System.out.println("Eh um numero de armstrong");
		}
		else {
			System.out.println("nao eh um numero de armstrong");
		}
		
	}}
