package project4;

import java.util.Random;

public class q3 {

	public static void main(String[] args) {
		int vet[]=new int[100];
		Random r=new Random();
		for(int i = 0;i<100;i++) {
			vet[i]=(r.nextInt(20));
		}
		RespA(vet);
		System.out.println("\n");
		RespB(vet);
		System.out.println("\n");
		RespC(vet);
		System.out.println("\n");
		RespD(vet);
	}
   public static void RespA(int v[]) {
	   int contador=0;
	   int j=0;
	   int contador2=0;
	   for(int x=0;x<v.length;x++) {
		   if(v[x]>0 && v[x]%3==0) {
			   contador++;
		   }
	   }
	   int a[]=new int[contador];
	   if(v[0]>0 && v[0]%3==0) {
		   a[0]=v[0];
	   }
	   int x=0;
	   int l=0;
	   for(x=0;x<a.length;x++) {
		   if(v[x]>0 && v[x]%3==0) {
			   for(j=l;j<a.length;j++) {
				   a[l]=v[x];
				   
			   }
			   l++;
		   }
	   }
	   for(int y=0;y<a.length;y++) {
		   if(a[y]!=0) {
			   contador2++;
		   }
	   }
	   int Resp[]=new int[contador2];
	   for(int y=0;y<Resp.length;y++) {
		   if(a[y]!=0) {
			   Resp[y]=a[y];
		   }
	   }
	   for(x=0;x<contador2;x++) {
		   System.out.println(Resp[x]);
	   }}
  
   public static void RespB(int v[]) {
	   int contador=0;
	   int contador2=0;
	   int j=0;
	   int l=0;
	   for(int x=0;x<v.length;x++) {
		   if(v[x]>0 && v[x]%3!=0) {
			   contador++;
		   }
	   }
	   int a[]=new int[contador];
	   if(v[0]>0 && v[0]%3!=0) {
		   a[0]=v[0];
	   }
	   for(int x=0;x<a.length;x++) {
		   if(v[x]>0 && v[x]%3!=0) {
			   for(j=l;j<a.length;j++) {
				   a[l]=v[x];
			   }
			   l++;
		   }
	   }
	   for(int y=0;y<a.length;y++) {
		   if(a[y]!=0) {
		   contador2++;
		   }
	   }
	   int Resp[]=new int[contador2];
	   for(int y=0;y<Resp.length;y++) {
		   if(a[y]!=0) {
			   Resp[y]=a[y];
		   }
	   }
	   for(int x=0;x<contador2;x++) {
		   System.out.println(Resp[x]);
	   }
   }
   public static void RespC(int v[]) {
	   int contador=0;
	   int j=0;
	   int l=0;
	   for(int x=0;x<v.length;x++) {
		   if(v[x]<0 && v[x]%3==0) {
			  contador++;
		   }
		  
	   }
	   int a[]=new int[contador];
	   if(v[0]<0 && v[0]%3==0) {
		   a[0]=v[0];
	   }
	   for(int x=1;x<a.length;x++) {
		   if(v[x]<0 && v[x]%3==0) {
			   for(j=1;j<a.length;j++) {
				   a[l]=v[x];
			   }
			   l++;
		   }
	   }
	   for(int x=0;x<contador;x++) {
		   System.out.println(a[x]);
	   }
   }
   public static void RespD(int v[]) {
	   int contador=0;
	   int j=0;
	   int l=0;
	   for(int x=0;x<v.length;x++) {
		   if(v[x]<0 && v[x]%3!=0) {
			   contador++;
		   }
	   }
	   int a[]=new int[contador];
	   if(v[0]<0 && v[0]%3!=0) {
		   a[0]=v[0];
	   }
	   for(int x=0;x<a.length;x++) {
		   if(v[x]<0 && v[x]%3!=0) {
			   for(j=l;j<a.length;j++) {
				   a[l]=v[x];
			   }
			   l++;
		   }
	   }
	   for(int x=0;x<contador;x++) {
		   System.out.println(a[x]);
	   }
   }
}
