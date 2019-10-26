package ifelsehome;

import javax.swing.JOptionPane;

public class firsttwothreetask {
		public static int Chislo(int a) {
			if (a>0) 
			return a+1;
			else 
				return a;
		}
		public static int Task2(int a) {
			if (a>0)
				return a+1;
			else
				return a-2;
		}
		public static int  Task (int a,int v) {
			if (a==0)
				return 10;
			else 
				return v;
			
			
		}
		
		
	
	
	public static void main(String[] args) {
		
		
		String b;
		b = JOptionPane.showInputDialog(null,"введіть чісло ");
		int a = Integer.parseInt(b);
		int c  = Chislo(a);
		int v = Task2(a);
		int x = Task(a,v);
//		if (a >0) 
//			a++;
//		else if (a<0);
//		 
//	
		System.out.println("перше завдання= "+c);
		System.out.println("друге  завдання= "+v);
		System.out.println("третє  завдання= "+x);
//		
		
	}
}
