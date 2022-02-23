/**
 * Java 1, HomeWork 5
 *
 * @author Dovgalskiy Yaroslav
 * @version 14.02.2022
 */
class HomeWork5 {
	
	public static void main(String[] args) {
	Person[] persArray = new Person[5];
		persArray[0] = new Person("Ivan Ivanov", "Worker1", "mail1@mail.ru", "9253232", 30000, 50);
		persArray[1] = new Person("Sergey Sergeev", "Engener", "mail2@mail.ru", "9253233", 60000, 45);
		persArray[2] = new Person("Petr Petrov", "Meneger", "mail3@mail.ru", "9253234", 80000, 35);
		persArray[3] = new Person("Kirill Kirilov", "Worker2", "mail4@mail.ru", "9253235", 30000, 20);
		persArray[4] = new Person("Stepan Stepanov", "Worker3", "mail5@mail.ru", "9253236", 30000, 41);

		for (int i = 0; i < persArray.length; i++){
        	if (persArray[i].getAge()>40) {
    		System.out.println(persArray[i]);
			}
		}
	}
}

class Person {
	private String name;
	private String position;
	private String email;
	private String phone;
	private int salary;
	private int age;
	
	Person(String name, String position, String email, String phone, int salary, int age){
		this.name = name;
		this.position = position;
		this.email = email;
		this.phone = phone;
		this.salary = salary;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

	@Override
	public String toString () {
		return name + ", " + position + ", " + email +", " + phone + ", " + salary + ", " + age;
	}

}	

