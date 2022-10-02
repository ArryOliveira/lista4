package project4;

import java.util.Scanner;

public class q9 {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		System.out.println("digite a altura do triangulo");
		int h=ler.nextInt();
		int i;
		int j;
		for(i=1;i<=h;i++) {
			for(j=h-i;j>=1;j--) 
				System.out.print(" ");
			
			for(j=1;j<=2*i-1;j++) 
				System.out.print("*");
			System.out.println();
		}
	}

}
