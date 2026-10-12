interface Printable{
    default void print(){
        System.out.println("Printing document details...");
    }
}
interface Scannable{
    default void scan(){
        System.out.println("Scanning document pages...");
    }
}
class MultiFunctionPrinter implements Printable, Scannable{
    public void displayStatus(){
        System.out.println("Printer is ready.");
    }
}
public class A10b{
    public static void main(String[] args){
        MultiFunctionPrinter mfp=new MultiFunctionPrinter();
        mfp.print();
        mfp.scan();
        mfp.displayStatus();
    }
}