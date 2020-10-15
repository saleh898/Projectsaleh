
public class personTest {

	public static void main(String[] args) {
		
			Person p1 = new Person("Saleh",2600);
			Person p2 = new Person("Saud", "Mhamad", "055566696", 10000);
			Person p3 = new Person("Khaled", "Mhamad", "051111196", 20000);
			Person p4 = new Person("anwe", "Mhamad", "0511000196", 80000);
			Person food = new Person("sosan", "seid", "055555556", 1200);
			
			System.out.println("Person Count is : " + Person.getCount());
			Person.PrintInfoLineHeader();
			p1.PrintInfoLine();
			p2.PrintInfoLine();
			p3.PrintInfoLine();
			p4.PrintInfoLine();
			food.PrintInfoLine();
			p1.Salary=1000;
			
			p1.increaseSalary(0.5);
			        			
			p1.PrintPersonInfooooo();
			p2.PrintPersonInfooooo();			
			p3.increaseSalary(-0.3);
			
			p3.PrintPersonInfooooo();
		p4.PrintPersonInfooooo();
	food.PrintPersonInfooooo();
	}

}

