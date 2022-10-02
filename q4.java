package project4;

import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
	Scanner ler=new Scanner(System.in);
	String[] nome=new String[3];
	for(int i=0;i<3;i++) {
		nome[i]=ler.nextLine();	
		}
		Vogal(nome);
		Consoante(nome);
	}
	public static void Vogal(String a[]) {
		for(int x=0;x<a.length;x++) {
			System.out.println("As vogais do nome  "+a[x]);
			for(int j=0;j<a[x].length();j++) {
			if(a[x].charAt(j)=='a') {
				System.out.println("a");
			}
			if(a[x].charAt(j)=='e') {
				System.out.println("e");
			}
			if(a[x].charAt(j)=='i') {
				System.out.println("i");
			}
			if(a[x].charAt(j)=='o') {
				System.out.println("o");
			}
			if(a[x].charAt(j)=='u') {
				System.out.println("u");
			}
			
		}
	}
}
 public static void Consoante(String a[]) {
	 for(int x=0;x<a.length;x++) {
		 System.out.println("As consoantes do nome "+a[x]);
		 for(int j=0;j<a[x].length();j++) {
				if(a[x].charAt(j)=='c') {
					System.out.println("c");
				}
				if(a[x].charAt(j)=='d') {
					System.out.println("d");
				}
				if(a[x].charAt(j)=='f') {
					System.out.println("f");
				}
				if(a[x].charAt(j)=='g') {
					System.out.println("g");
				}if(a[x].charAt(j)=='h') {
					System.out.println("h");
				}
				if(a[x].charAt(j)=='j') {
					System.out.println("j");
				}
				if(a[x].charAt(j)=='k') {
					System.out.println("k");
				}if(a[x].charAt(j)=='l') {
					System.out.println("l");
				}
				if(a[x].charAt(j)=='z') {
					System.out.println("z");
				}if(a[x].charAt(j)=='x') {
					System.out.println("x");
				}if(a[x].charAt(j)=='v') {
					System.out.println("v");
				}
				if(a[x].charAt(j)=='b') {
					System.out.println("b");
				}if(a[x].charAt(j)=='n') {
					System.out.println("n");
				}
				if(a[x].charAt(j)=='m') {
					System.out.println("m");
				}
				if(a[x].charAt(j)=='s') {
					System.out.println("s");
				}if(a[x].charAt(j)=='q') {
					System.out.println("q");
				}
				if(a[x].charAt(j)=='w') {
					System.out.println("w");
				}
				if(a[x].charAt(j)=='r') {
					System.out.println("r");
				}
				if(a[x].charAt(j)=='t') {
					System.out.println("t");
				}
				if(a[x].charAt(j)=='y') {
					System.out.println("y");
				}
				if(a[x].charAt(j)=='p') {
					System.out.println("p");
				}
			}
		 }
	 }
 }

