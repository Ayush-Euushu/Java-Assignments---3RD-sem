class Grandfather{
    void showGrandfatherDetails(){
        System.out.println("Grandfather property: Traditional ancestral house.");
    }
}
class Father extends Grandfather{
    void showFatherDetails(){
        System.out.println("Father property: Urban apartment and car.");
    }
}
class Son extends Father{
    void showSonDetails(){
        System.out.println("Son property: Modern tech gadgets and laptop.");
    }
}
class Uncle extends Grandfather{
    void showUncleDetails(){
        System.out.println("Uncle property: Agricultural farmland.");
    }
}
public class A10e{
    public static void main(String[] args){
        System.out.println("--- Testing Multilevel Branch (Son Object) ---");
        Son s = new Son();
        s.showGrandfatherDetails(); 
        s.showFatherDetails();      
        s.showSonDetails();
        System.out.println("\n--- Testing Single/Hierarchical Branch (Uncle Object) ---");
        Uncle u=new Uncle();
        u.showGrandfatherDetails(); 
        u.showUncleDetails();        
    }
}