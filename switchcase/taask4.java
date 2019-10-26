package casehomework;

import javax.swing.JOptionPane;

public class taask4 {

	public static void main(String[] args) {
		String b;
		b = JOptionPane.showInputDialog(null,"введ≥ть ч≥сло ");
		int c = Integer.parseInt(b);
		String a;
		switch (c) {
		   case 1:
		   case 3:
		   case 5:
		   case 7:
		   case 8:
		   case 10:
		   case 12:
		      a = "31 день";
		       break;
		   case 4:
		   case 6:
		   case 9:
		   case 11:
		      a= "30 дн≥в";
		       break;
		   case 2:
		       a = "28 дн≥в";
		       break;
		       default: a = "¬вед≥ть ч≥сло в рад≥ус≥ 1-12";

	}System.out.println(a);
	}

}
