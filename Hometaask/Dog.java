package Hometaask;



public class Dog {
	String name;
	int age;
	double weight;
	Tiger killer;
	public Dog(String name,int age,double weight ) {
		this.name=name;
		this.age=age;
		this.weight=weight;
		
	}
	public void walk(double walkkilo) {
		
		if (walkkilo>1000) { this.weight-=0.5; System.out.println(name+"  "+"Вага після прогулянки"+weight);}
		
	}
	public void print() {
		System.out.println(this.toString());
		
	}
	public void printkiller() {
		if(weight>0)
		System.out.println(name+","+weight);
		else System.out.println("DEAD Dog "+  killer.name);
	}
	@Override
	public String toString() {
		
		return "Имя "+this.name+" "+" Скільки років:"+this.age +"  Вага "+this.weight;
	}
	
	

}
