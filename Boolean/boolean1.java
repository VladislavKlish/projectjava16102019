import javax.swing.JOptionPane;

public class boolean1 {

	public static void main(String[] args) {
			String a;
			// TODO Auto-generated method stub
		 a = JOptionPane.showInputDialog(null,"введіть число ");
		 int b =Integer.parseInt(a);
		boolean c = b>0;
		System.out.println(c);
	}

}
