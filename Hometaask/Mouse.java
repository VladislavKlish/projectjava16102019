package Hometaask;
 
public class Mouse {
	String name;
	Cat killer;
	
	double weight;
	public Mouse(String name,double weight) {
		this.name=name;
		this.weight=weight;
		
	}
	public void eat(double food) {
		this.weight+=food;
	}
	public void print() {
		if(weight>0)
		System.out.println(name+","+weight);
		else System.out.println("DEAD MOUSE "+  killer.name);
	}
	

}
