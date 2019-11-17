package Hometaask;


public class Main {

	public static void main(String[] args) {
		
		Mouse mouse1 =new Mouse("Vlad",15); 
		mouse1.print();
		Cat cat1 = new Cat("Anya",7,15);
		cat1.print();
		Dog dog1 = new Dog("Ladislav",2,17);
		dog1.print();
		
		
		
		
		dog1.walk(10000);
		cat1.eat(mouse1);
		cat1.print();
		Tiger tiger1 = new Tiger("NIkolay", 34,10 );
		tiger1.print();
		tiger1.eat(dog1);
		tiger1.print();
		
	}

}
