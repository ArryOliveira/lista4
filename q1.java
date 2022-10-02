package project4;
import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		System.out.println("digite o valor do salario minimo");
		double Smin=ler.nextDouble();
		System.out.println("digite o numero de dependentes");
		int dependentes=ler.nextInt();
		System.out.println("digite o seu salario");
		double salario=ler.nextDouble();
		System.out.println("digite a taxa ja paga");
		double JaPago=ler.nextDouble();
		double total=Restituição(ImpostoBruto(salario,Smin),dependentes)+JaPago;
		System.out.println(total);
	}
	public static double ImpostoBruto(double salario,double SalarioMin) {
		double Imposto=0;
		if(salario>(12*SalarioMin)) {
			Imposto=0.2*(salario);
		}
		if(salario>(5*SalarioMin) && salario<(12*SalarioMin)) {
			Imposto=(0.08)*salario;
		}
		if(salario<=(5*SalarioMin)) {
			Imposto=0;
		}
		Imposto=Imposto*(0.04)+Imposto;
		return Imposto;
	}
	public static double Restituição(double imposto,int d) {
		if(d!=0) {
		for(int i=0;i<=d;i++) {
			imposto-=imposto*(0.02);
		}}
		else {
			imposto=imposto;
		}
		return imposto;
	}
}
