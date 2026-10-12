//Write a java program to create a class called Vehicle with a method called drive(). 
//Create a subclass called Car that overrides the drive() method to print "Repairing a car".

class Vehicle{
	void drive(){
		System.out.println("Repairing A Vehicle");
	}
}
class Car1 extends Vehicle{
	void drive(){
		System.out.println("Repairing A Car");
	}
	public static void main(String[] args){
		Car1 c=new Car1();
		c.drive();
	}
	
}
