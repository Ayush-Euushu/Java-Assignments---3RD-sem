class Employee{
	String name;
	double salary;
	int hireDate;
	int YearOfService(int date){
		int CurrentYear=2026;
		hireDate=CurrentYear-date;
		return hireDate;
	}
	void display(){
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
		System.out.println("Years of Service : "+hireDate);
	}
	public static void main(String[] args){
		Employee e=new Employee();
		e.name="Ayush";
		e.salary=85000;
		e.YearOfService(2021);
		System.out.println("Employee Details :");
		e.display();
	}
}