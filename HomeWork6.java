class HomeWork6 {
	public static void main(String[] args) {
		Animal cat = new Cat(200,0);
		System.out.println("Barsic_cat");
		cat.run(150);
		cat.swim(6);
		
		System.out.println("Bobik_dog");
		Animal	dog = new Dog(500,10);
		dog.run(400);
		dog.swim(9);

		
	}   
}

abstract class Animal {
    protected int runLength;
    protected int swimLength;

    abstract void run(int length);

    abstract void swim(int length);

    Animal(int runLength, int swimLength) {
           this.runLength = runLength;
           this.swimLength = swimLength;
	}
	
}

 class Cat extends Animal {
	 
	 Cat(int runLength, int swimLength) {
        super(runLength, swimLength);
    }

    @Override
    void run(int length) {
        if ((length >= 0) && (length <= runLength)) System.out.println("Run: " + length);
        else System.out.println("run: false");
    }

    @Override
    void swim(int length) {
        System.out.println("Swim: Cat not swim");
    }
}

class Dog extends Animal {

    public Dog(int runLength, int swimLength) {
        super(runLength, swimLength);
    }
    @Override
    void run(int length) {
        if ((length >= 0) && (length <= runLength)) System.out.println("Run: " + length);
		else System.out.println("run: false");

	}
	 @Override
    void swim(int length) {
        if ((length >= 0) && (length <= swimLength)) System.out.println("Swim: " + length);
        else System.out.println("swim: false");
		}
	
	
	
}