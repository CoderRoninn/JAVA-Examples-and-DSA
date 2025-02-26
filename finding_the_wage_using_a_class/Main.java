package finding_the_wage_using_a_class;

class Employee{
	int number;
	float wage;
	int age;
	
	Employee(int number, float wage, int age){
		this.number = number;
		this.wage = wage;
		this.age = age;}
	}

class Communication{
	String name;
	String surname;
	String city;
	Employee knowledge;
	
	Communication(String name, String surname, String city, Employee knowledge){
		this.name = name;
		this.surname = surname;
		this.city = city;
		this.knowledge = knowledge;}
	}

public class Main {
	
	public static void main(String[] args) {
		Communication communications[] = new Communication[3];
		communications[0] = new Communication("DOGUKAN","SUME","MERSIN",new Employee(100, 27.450f, 14));
		communications[1] = new Communication("EMIR","SUME","ANKARA",new Employee(101, 30.000f,17));
		communications[2] = new Communication("TOFAN", "SUME", "ISTANBUL", new Employee(102, 35.000f, 29));
		
	    int i;
	    
	    for(i=0; i<3; i++) {
	    	if(communications[i].knowledge.wage >= 29.000) {
	    		System.out.println("Name: " + communications[i].name + " Surname: " + communications[i].surname + " Wage: " + communications[i].knowledge.wage);
	    	}
	    }
			
	}

}
