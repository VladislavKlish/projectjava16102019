package whilehome;

import java.io.IOException;
import java.util.Scanner;



public class whiletask {
	
	
	
	
	
	private static Scanner sc;

	public static void main(String[] args) throws IOException {
		
		char answer=' ';
		sc = new Scanner(System.in);
		do {
			System.out.println("Завдання 1");
			System.out.println("Завдання 2");	
			System.out.println("Завдання 3");
			System.out.println("Завдання 4");
			System.out.println("Завдання 5");
			System.out.println("0.Exit");
			String str = sc.nextLine().trim();
			answer=str.charAt(0);
			switch (answer) {
			case '1':
				Mylib.length();
				
				break;
			case '2':
				Mylib.howmanylength();
				
				break;
			case '3':
				Mylib.fraction();
				
				break ;
			case '4':
				Mylib.stepen();
				break;
			case '5':
				Mylib.whatextent();
				
				break;

			default:
				break;
			}
		
		}while(answer!='0');		
		
		

		
		}
		
		
		
		
	
	}
	


