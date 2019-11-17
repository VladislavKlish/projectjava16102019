package Hometaask;

public class Tiger {
	String name;
	int age;
	double weight;
	
	
	public Tiger(String name,double weight, int age) {
		this.name=name;
		this.age=age;
		this.weight=weight;
		
		
	}
	public void eat(double food) {
		this.weight +=food;
	}
	public void eat(Dog dog) {
		this.weight+=dog.weight;
		dog.weight=0;
		dog.killer=this;
		
	}
	public void print() {
		System.out.println(this.toString());
		
	}
	@Override
	public String toString() {
		
		return "»м€ "+this.name+" "+" —к≥льки рок≥в:"+this.age +"  ¬ага "+this.weight;
	}
	
}

