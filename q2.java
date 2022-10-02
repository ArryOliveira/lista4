package project4;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		System.out.println("diga o dia da semana");
		String dia=ler.next();
		System.out.println("informe o preço do aluguel:");
		float p=ler.nextFloat();
		System.out.println("deseja ferramenta nova?");
		String op=ler.next();
		if(dia.equals("segunda")||dia.equals("terça")||dia.equals("quinta")) {
			System.out.println("preço:"+verificaFerramenta(op,desconto(p)));
		}
		
		if(dia.equals("quarta")||dia.equals("sexta")||dia.equals("sabado")||dia.equals("domingo")) {
			System.out.println("preço:"+verificaFerramenta(op,p));
		}
	}
	
	
	public static float desconto(float preço) {
		preço=(float) (preço-(0.4*preço));
		return preço;
	}
	public static float verificaFerramenta(String x,float y) {
		if(x.equals("sim")) {
			y=(float) ((0.15)*y+y);
		}
		if(x.equals("não")) {
		
		}
		return y;
	}
}
