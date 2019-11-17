package Hometaask;



public class Cat {
	String name;
	int age;
	double weight;
	
	public Cat(String name,double weight, int age) {
		this.name=name;
		this.age=age;
		this.weight=weight;
		
		
	}
	public void eat(double food) {
		this.weight +=food;
	}
	public void eat(Mouse mouse) {
		this.weight+=mouse.weight;
		mouse.weight=0;
		mouse.killer=this;
		
	}
	public void print() {
		System.out.println(this.toString());
		
	}
	@Override
	public String toString() {
		
		return "»м€ "+this.name+" "+" —к≥льки рок≥в:"+this.age +"  ¬ага "+this.weight;
	}
}