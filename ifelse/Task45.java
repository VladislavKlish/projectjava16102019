package ifelsehome;



public class Task45 {

	
	public static void main(String[] args) {
		int a = -2, b=3,c=4;
		int negative = 0;
		int count = 0;
		if(a>0) count++;
		if (b>0)count++;
		if (c>0)count++;
		if(a<0)negative++;
		if(c<0)negative++;
		if(b<0)negative++;
		
		
		
		System.out.println("кількість позитивних чисел= "+count);
		System.out.println("кількість негативних чисел= "+negative);
		
		
	

}
}