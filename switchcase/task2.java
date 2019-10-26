package casehomework;

import javax.swing.JOptionPane;

public class task2 {

	public static void main(String[] args) {
		
			
				String b;
				b = JOptionPane.showInputDialog(null,"введіть чісло ");
				int c = Integer.parseInt(b);
				String a;
				
				switch(c) {
				case 1:  
					
					a  = "міг би краще";
					break;
			case 2:  

				a  = "плохо";
				break;
			case 3:  

				a  = "золота серединка";
				break;
			case 4:
				a  = "харош";
				break;
			case 5:  

				

				a = "Відмінно";
				break;
			default: a = "не існує";
			break;
			

					
					
					
					
					
					
					
}JOptionPane.showMessageDialog(null, a);;
					

	}

}
