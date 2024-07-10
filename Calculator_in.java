package calculator;

import java.util.Scanner;

public class Calculator_in {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter taken year");
		int a = scan.nextInt();
	
		System.out.println("enter taken month");
		int b = scan.nextInt();
	
		System.out.println("enter taken day");
		int c = scan.nextInt();
	
		System.out.println("enter given year");
		int A = scan.nextInt();
		
		System.out.println("enter given month");
		int B = scan.nextInt();
		
		System.out.println("enter given day");
		int C = scan.nextInt();
	
		System.out.println(a+" "+b+" "+c);
		System.out.println(A+" "+B+" "+C);
		int count=0;
		if(c>C) {
			C=C+30;
			count=C-c;
			B=B-1;
		}
		else {
			count = C-c;
		}
		int m=0;
		if(b>B) {
			B=B+12;
			 m=B-b;
			count=count+(m*30);
			A=A-1;
		}
		else {
			m=B-b;
			count=count+(m*30);
		}
		int year=A-a;
		count=count+((year*12)*30);
		count=count+5;
		
		System.out.println(count);
		int p=100000;
		int monthly=p/100;
		int vaddi=monthly*2;
		int baru=(vaddi/30)*count;
		System.out.println(baru);
		
		
		
		
		
//		System.out.println("enter taken amount");
//		int p = scan.nextInt();
//		System.out.println("enter rate");
//		float r = scan.nextFloat();
//		float d=(float)(A-a)*12;
//		float e=(float)(B-b);
//		float D=(float)(C-c);
//		float t=d+e;
//		float month=(p/100)*2;
//		float months=month*(t);
//		
//		float day=month/30;
//		float x=day*D;
//		System.out.println("intrest ->"+x+months);
//		System.out.println("total ->"+x+months+p);
//		float k=(z*t*r)/100;
//		System.out.println("intrest is->"+k);
//		System.out.println("total amount is->"+k+z);
		
		
		
		
		
	}

}
