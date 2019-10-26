package casehomework;

import javax.swing.JOptionPane;

public class probna {

	public static void main(String[] args) {
	
		String b;
		b = JOptionPane.showInputDialog(null,"введіть чісло ");
		int c = Integer.parseInt(b);
		String a;
		
		switch(c) {
		case 1:  
			
			a  = "Понедельник";
			break;
	case 2:  

		a  = "Вторник";
		break;
	case 3:  

		a  = "Среда";
		break;
	case 4:
		a  = "Среда";
		break;
	case 5:  

		a = "Пятница";
		break;
	case 6:  
		
		a  = "Суббота";
		break;
	
	case 7:  

		a = "Воскресенье";
		break;
	default: a = "gg";
	break;
	

			
			
			
			
			
			
			
		}JOptionPane.showMessageDialog(null, a);;
			
		

	}

}
