public class Person {
	
	//when make new person its now what number of them
    public static int Count = 0;

    private int id;
    String first_name;
    String last_name;
    String mobile;
    double Salary ;
    String salem;
    public Person(String first_name,double Salary) {
    	//always we set the id from the count of persons
        this.id = Count + 1;
        this.first_name = first_name;
        last_name = "";
        this.Salary =Salary;
        mobile = "";
        //we incement the count of persons every time we make new object
       
        Count++;
    }

    public Person(String first_name, String last_name, String mobile, double Salary) {
        this.id = Count + 1;
        this.first_name = first_name;
        this.last_name = last_name;
        this.mobile = mobile;
        this.Salary = Salary;
        Count++;
    }

    public int getId() {
        return id;
    }

    public String GetFullName() {
        return first_name + " " + last_name;
    }

    public void SetFullName(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public static int getCount() {
        return Count;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }


    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }
    
    // increase or decrease the salary 
    public void increaseSalary(double percent) {
        double inc = Salary * percent;
        Salary = Salary + inc;
    }
//if we want to pritn we print the header of table info
    public static void PrintInfoLineHeader() {
        System.out.println("ID\tfirst_name\tlast_name\tmobile\t\tSalary");
        
    }
    
    
    
//if we make table this method print the line of person 
    public void PrintInfoLine() {
        System.out.println(id + "\t" + first_name + "\t"+"\t" + last_name + "\t" +"\t"+ mobile + "\t" + Salary);
    }
    
    
    //this print person info formed well
    public void PrintPersonInfooooo() {
        System.out.println("*****************************");
        System.out.println("ID :" + id);
        System.out.println("Name :" + first_name + " " + last_name);
        System.out.println("Mobile :" + mobile);
        System.out.println("Salary :" + Salary +" SR.");
        System.out.println("------------------------------");
    }

	
	

}
