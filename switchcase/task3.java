package casehomework;

import javax.swing.JOptionPane;

public class task3 {

	public static void main(String[] args) {


		String b;
		b = JOptionPane.showInputDialog(null,"������ ����� ");
		int c = Integer.parseInt(b);
		String a;
		
		switch(c) {
		   case 12:
		   case 1:
		   case 2:
			   a = "����";
			   break;
		   case 3:
		   case 4:
		   case 5:
		   a = "�����";
		   break;
		   case 6:
		   case 7:
		   case 8:
		   a ="���";
		   break;
		   case 9:
		   case 10:
		   case 11:
		   a = "����";
		   break;
		   default: a = "������� � ������� 1-12";
		   
			
			
			
		}System.out.println(a);
		

	}

}
