package whilehome;

import java.util.Scanner;

public class Mylib {

	public static int length() {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt(), b = in.nextInt();
		int c=a;
		while (c>=0) {
			c-=b;
			
			
			
			
		}System.out.println(c+b);
		return c;
			
	}
	public static int howmanylength() {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt(), b = in.nextInt();
		int c=a;
		int count =0;
		while (c-b>=0) {
			c-=b;
			 count++;
			
			
			
			
		}System.out.println("найти количество отрезков B, размещенных на отрезке A = "+count);
		return c;
	}
	public static int  stepen() {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt(); //b = in.nextInt();
		
		while ( a>0) {
			a-=3;
			boolean c = a==0;
			
		}System.out.println(a==0);
		return 0;
	}
	public static int whatextent() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = 0;
		while (n>=2) {
			n/=2;
			k++;
		}System.out.println("показник степені =  "+k);
		return 0;
		
					
		}
	public static int fraction() {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt(), b = in.nextInt();	
		int c =a;
		int k = 0;
		
		while (c>=b) {
			c-=b;
			
			k++;
			
		}System.out.println("частка = "+k);
		System.out.println("остача відділення = "+c);
		return 0;
	}
	}
	

	
	 
	


