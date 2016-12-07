package untar.fti;
class Person {
	private String name;
	private int age;
	
    Person() { //constructor (default)
    	this.name = "Riyan";
    	this.age = 17;
    }
    
    Person(String name, int age) {
    	this.name = name;
    	this.age = age;
    }
    
	public void setName (String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return this.name;	
	}

	public void setAge (int age)
	{
		this.age = age;
	}

	public int getAge()
	{
		return this.age;	
	}

}
class Student extends Person {
	Student ()
	{
		super ("Firbert",14); // overwrite
	}
	private double gpa;
	
	public void setGPA (double gpa)
	{
		if (gpa<= 0.0 && gpa >= 4.0)
		{
			this.gpa= gpa; 
		}
		else 
			System.out.println ("Error");
	} 
	public double getGPA (){
		return this.gpa;
	}
	
	public String getName () //overriding
	{
		return "*******";
	}
}
class Faculty extends Person {
	private double salary;
	
	public double getSalary()
	{
		return this.salary;
	}

	public double getSalary(double tax) //overloading
	{
		return (this.salary-tax);
	} 
}

class GraduatedStudent extends Student{
	String tanggalWisuda;
}

class OnGoingStudent extends Student{
	Double uangSemesteran;
}
	
public class Demo {
	public static void main (String[] args){
		//Student student[];
		//Faculty faculty[];
		//Person p = new Person ();
		//Person s = new Student ();
		//Person f = new Faculty ();
		
		//Person [] person = new Person [10000];
		//person [0]  = new Student ();
		//person [1]  = new Faculty ();
		
		//p.name = "Ryan";
		//p.age = 17;
		//System.out.println(p.name+ " " +p.age);	
		
		
		//System.out.println(p.getName()+" "+p.getAge());
		
		Person q = new Person ("Albert", 90);
		System.out.println(q.getName()+" "+q.getAge());
		
		Student s = new Student ();
		System.out.println (s.getName()+" "+s.getAge());
	}
}
