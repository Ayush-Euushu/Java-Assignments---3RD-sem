class Bank{
    float roi;
    float getRateOfInterest(){
        return roi;
    }
}
class SBI extends Bank{
    public SBI(){
        this.roi=8.4f;
    }
    float getRateOfInterest(){
        return roi;
    }
}
class ICICI extends Bank{
    public ICICI(){
        this.roi=7.3f;
    }
    float getRateOfInterest(){
        return roi;
    }
}
class AXIS extends Bank{
    public AXIS(){
        this.roi=9.7f;
    }
    float getRateOfInterest(){
        return roi;
    }
}
public class A10a{
    public static void main(String[] args) {
        Bank b;
        b=new SBI();
        System.out.println("SBI Rate of Interest: "+b.getRateOfInterest()+"%");
        b=new ICICI();
        System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest()+"%");
        b=new AXIS();
        System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest()+"%");
    }
}