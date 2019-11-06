package FORtask;

import java.util.Scanner;



public class Lib {
	
		public static int kilkicst() {
			Scanner in = new Scanner(System.in);
			int k=in.nextInt();
			for (int n=1;k>=n;n++) {
				System.out.println(k);
				
			}return 0;
			
		}
		public static int kilk() {
			Scanner in = new Scanner(System.in);
			
			int b =in.nextInt() ;
			int a=in.nextInt() ;
			for (int i=a ; i<=b ;i++ ) {
				
				System.out.println(i);
				
			}
			int n =b - a+1; 
			return n ;

}
		public static int kilkspad() {
			Scanner in = new Scanner(System.in);
			int b= in.nextInt(), a = in.nextInt();
			 for (int i=b-1;i>a;i--) {
				 System.out.println(i);
				 
			 }
			 int n = b-a-1;
			 return n;
			
		}
		public static int pricekg() {
			Scanner in = new Scanner(System.in);
			int c =in.nextInt() ;//цена за кг 
			for(int i = 0; i<=10;i++) {
				int price = i*c;
				System.out.println("kg= "+i+" цена = "+price);
			}return 0;
		}
		public static 	float kgcandy() {
			Scanner in = new Scanner(System.in);
			int c =in.nextInt();
			
			for(float a = 0.1f;a<1.1;a+=0.1f) {
			
				float buy = a*c;
				
//				
				System.out.println( "kg ="+a+" стоимость = " +buy);
				
				
			}
			return 0; 
			
		}
}

//System.out.println(Lib.kilkicst());