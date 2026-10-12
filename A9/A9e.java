class Vehicle {
    String make,model,fuelType;
    int year;
    double distanceTraveled;
    Vehicle(String make, String model,int year,double distanceTraveled,String fuelType){
        this.make=make;
        this.model=model;
        this.year=year;
        this.distanceTraveled=distanceTraveled;
        this.fuelType=fuelType;
    }
    double getFuelEfficiency(){
        return 0;
    }
    double getDistanceTraveled(){
        return distanceTraveled;
    }
    double getMaxSpeed(){
        return 0;
    }
    void display(){
        System.out.println("Make: "+make);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
        System.out.println("Distance Traveled: "+distanceTraveled +" km");
        System.out.println("Fuel Type: "+fuelType);
        System.out.println("Fuel Efficiency: "+getFuelEfficiency()+" km/l");
        System.out.println("Maximum Speed: "+getMaxSpeed()+" km/h");
    }
}
class Truck extends Vehicle{
    Truck(String make,String model,int year,double distanceTraveled,String fuelType){
        super(make,model,year,distanceTraveled,fuelType);
    }
    double getFuelEfficiency(){
        return 8.0;
    }
    double getMaxSpeed(){
        return 100.0;
    }
}
class Car extends Vehicle{
    Car(String make,String model,int year,double distanceTraveled,String fuelType){
        super(make,model,year,distanceTraveled,fuelType);
    }
    double getFuelEfficiency(){
        return 15.0;
    }
    double getMaxSpeed(){
        return 180.0;
    }
}
class Motorcycle extends Vehicle{
    Motorcycle(String make,String model,int year,double distanceTraveled,String fuelType){
        super(make,model,year,distanceTraveled,fuelType);
    }
    double getFuelEfficiency(){
        return 40.0;
    }
    double getMaxSpeed(){
        return 150.0;
    }
}
class Main{
    public static void main(String[] args){
        Truck t=new Truck("Tata","Prima",2022,50000,"Diesel");
        Car c=new Car("Toyota","Camry",2023,20000,"Petrol");
        Motorcycle m=new Motorcycle("Honda","Shine",2024,10000,"Petrol");
        System.out.println("----- TRUCK -----");
        t.display();
        System.out.println("\n----- CAR -----");
        c.display();
        System.out.println("\n----- MOTORCYCLE -----");
        m.display();
    }
}