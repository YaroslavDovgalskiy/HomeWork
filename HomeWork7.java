/**
 * Java 1, HomeWork 7
 *
 * @author Dovgalskiy Yaroslav
 * @version 06.03.2022
 */

class HomeWork7 {
	public static void main(String[] args) {
		Cat[] cats = {
			new Cat("Barsik", 20), new Cat("Mursic", 10), new Cat("Vaska", 15)
		};
		Plate plate = new Plate(50, 35);
		System.out.println(plate);
		
		for (Cat cat : cats) {
			cat.eat(plate);
			System.out.println(cat);
		}
		
		System.out.println(plate);
		plate.add(45);
		System.out.println(plate);
		
		for (Cat cat : cats) {
			cat.setFullness(false);
			cat.eat(plate);
			System.out.println(cat);
		}
		System.out.println(plate);
		
	}

}

class Cat {
	private String name;
	private int appetite;
	private boolean fullness;
	
	Cat (String name, int appetite) {
		this.name = name;
		this.appetite = appetite;
		fullness = false;
	}
	
	void setFullness(boolean status) {
		fullness = status;
	}
	
	void eat(Plate plate) {
		if (!fullness) {
			fullness = plate.decreaseFood(appetite);
		}
	}
	
	@Override
	public String toString() {
		return "{name=" + name + ", appetite=" + appetite + ", fullness=" + fullness + "}";
		
		}
}

class Plate {
	private int volume;
	private int food;
	
	Plate(int volume, int food) {
		this.volume = volume;
		this.food = food;
	}
	
	boolean decreaseFood(int portion) {
		if (food < portion) {
			return false;
		}
		food -= portion;
		return true;
	}
	
	void add(int food) {
		if (this.food + food <= volume) {
			this.food += food;
		}
	}
	
	@Override
	public String toString() {
		return "plate: " + food;
	}
}
 

