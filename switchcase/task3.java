package casehomework;

import javax.swing.JOptionPane;

public class task3 {

	public static void main(String[] args) {


		String b;
		b = JOptionPane.showInputDialog(null,"введіть чісло ");
		int c = Integer.parseInt(b);
		String a;
		
		switch(c) {
		   case 12:
		   case 1:
		   case 2:
			   a = "зима";
			   break;
		   case 3:
		   case 4:
		   case 5:
		   a = "весна";
		   break;
		   case 6:
		   case 7:
		   case 8:
		   a ="літо";
		   break;
		   case 9:
		   case 10:
		   case 11:
		   a = "осінь";
		   break;
		   default: a = "виберіть в діапазоні 1-12";
		   
			
			
			
		}System.out.println(a);
		

	}

}
