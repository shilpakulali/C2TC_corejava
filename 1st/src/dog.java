
public class dog { 
	void eat()
	{
		System.out.println("eating...");
		}  
	}  
	class animal extends dog
	{  
	void bark()
	{
		System.out.println("barking...");
		}  
	}  
	class TestInheritance{  
	public static void main(String args[]){  
	animal a=new animal();  
	a.bark();  
	a.eat();  
	}}


