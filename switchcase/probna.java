package casehomework;

import javax.swing.JOptionPane;

public class probna {

	public static void main(String[] args) {
	
		String b;
		b = JOptionPane.showInputDialog(null,"������ ����� ");
		int c = Integer.parseInt(b);
		String a;
		
		switch(c) {
		case 1:  
			
			a  = "�����������";
			break;
	case 2:  

		a  = "�������";
		break;
	case 3:  

		a  = "�����";
		break;
	case 4:
		a  = "�����";
		break;
	case 5:  

		a = "�������";
		break;
	case 6:  
		
		a  = "�������";
		break;
	
	case 7:  

		a = "�����������";
		break;
	default: a = "gg";
	break;
	

			
			
			
			
			
			
			
		}JOptionPane.showMessageDialog(null, a);;
			
		

	}

}
