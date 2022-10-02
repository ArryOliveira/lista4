package project4;

import java.util.Scanner;

public class q6 {

	public static void main(String[] args) {
		 
			float massa;
			Scanner ler=new Scanner(System.in);
			massa=ler.nextFloat();
	        tempo(massa);
		}
		public static void tempo(float m) {
			int n=0;
			int hora=0,minuto = 0,segundo = 0;
			int minuto1=0;
			while(m>0.5) {
				m=(float) (m*(0.5));
				n++;
			}
			float tempo=50*n;
			if(segundo<60) {
			 segundo=(int) tempo;
			}
			if(segundo>60 && segundo<3600) {
			if(tempo%60 != 0) {
				minuto=(int)tempo/60;
				segundo=(int)tempo%60;
			}
			}
			else if(segundo>3600) {
				hora=(int)tempo/3600;
				minuto=(int)tempo%3600;
				if(minuto>60) {
					minuto1=minuto;
					minuto=(int)minuto/60;
					segundo=minuto1%60;
				}
			}
			System.out.println("tempo para chegar na massa final");
			System.out.println("em segundos");
			System.out.println(tempo);
			/*System.out.println("em minutos");
			System.out.println(tempo/60);
			System.out.println("em horas");
			System.out.println(tempo/3600);*/
			/*System.out.println(hora);
			System.out.println(minuto);
			System.out.println(segundo);*/
			System.out.println("tempo:"+hora+":"+minuto+":"+segundo);
			System.out.println("a massa final");
			System.out.println(m);
		

	}

}
