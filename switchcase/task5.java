package casehomework;

import javax.swing.JOptionPane;

public class task5 {

	public static void main(String[] args) {
		String b;
		b = JOptionPane.showInputDialog(null,"введіть чісло ");
		int c = Integer.parseInt(b);
		float q = 10, w =5;
		float d ;
		
		
		
		switch(c) {
		case 1:
			d=w+q;
			break;
		case 2:
			d=q-w;
			break;
		case 3:
			d=q*w;
			break;
		case 4:
			d = q/w;
			break;
			default: d= 0;
				
		
		
		}System.out.println(d);
		

	}

}
