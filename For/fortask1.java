package casehomework;

import java.io.IOException;
import java.util.Scanner;

import FORtask.Lib;

public class fortask1 {
	
	
	
	
	
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
				Lib.kilkicst();
				break;
			case '2':
				Lib.kilk();
				break;
			case '3':
				Lib.kilkspad();
				break ;
			case '4':
				Lib.pricekg();
				break;
			case '5':
				Lib.kgcandy();
				break;

			default:
				break;
			}
		
		}while(answer!='0');		
		
		

		
		}
		
		
		
		
	
	}
	


