package project4;

import java.util.Scanner;

public class q11 {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int i,j;
		int m[][]=new int[3][2];
		System.out.println("digite sua matricula");
		for(i=0;i<3;i++) {
			for(j=0;j<2;j++) {
				m[i][j]=ler.nextInt();
			}
		}
		

	        for ( i = 0; i < m.length ; i++) {
	            for ( j = 0; j < m[i].length ; j++) {
	                System.out.print(m[i][j] + " ");
	            }
	            System.out.println();
	        }
	        System.out.println();
	        transposta(m);
	    }  

		public static void transposta(int x[][]) {
			int i,j;
			int a[][]=new int[2][3];
			for(i=0;i<a.length;i++) {
				for(j=0;j<a[i].length;j++) {
					a[i][j]=x[j][i];
				}
			}
			 for ( i = 0; i < a.length ; i++) {
		            for ( j = 0; j < a[i].length ; j++) {
		                System.out.print(a[i][j] + " ");
		            }
		            System.out.println();
		        }
		}
	}

