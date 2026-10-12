import java.util.*;
class Library{
    int bookNo;
    String bookName;
    String author;
    Library(int n,String name,String a){
        bookNo=n;
        bookName=name;
        author=a;
    }
    static int addBook(Library[] books,int n,Scanner sc){
        System.out.print("Book number : ");
        int no=sc.nextInt();
        System.out.print("Book name : ");
        String name=sc.next();
        System.out.print("Author : ");
        String author=sc.next();
        books[n]=new Library(no,name,author);
        System.out.println("Book added successfully.");
        return n+1;
    }
    static int removeBook(Library[] books,int n,Scanner sc){
        System.out.print("Enter book number to delete : ");
        int no=sc.nextInt();
        for(int i=0;i<n;i++){
            if(books[i].bookNo==no){
                for(int j=i;j<n-1;j++){
                    books[j]=books[j+1];
                }
                n--;
                System.out.println("Book deleted successfully.");
                return n;
            }
        }
        System.out.println("Book not found.");
        return n;
    }
    void display(){
        System.out.println("Book number : "+bookNo);
        System.out.println("Book name : "+bookName);
        System.out.println("Author : "+author);
    }
}
public class A7e{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Library[] books=new Library[10];
        int n=0;
        int choice;
        do{
            System.out.println("\n1. Add book");
            System.out.println("2. Delete book");
            System.out.println("3. Display books");
            System.out.println("4. Quit");
            System.out.print("Enter your choice : ");
            choice=sc.nextInt();
            if(choice==1){
                n=Library.addBook(books,n,sc);
            }
            else if(choice==2){
                n=Library.removeBook(books,n,sc);
            }
            else if(choice==3){
                for(int i=0;i<n;i++){
                    System.out.println("\nBook "+(i+1));
                    books[i].display();
                }
            }
            else if(choice==4) System.out.println("Exiting...");
            else System.out.println("Invalid choice");
        }while(choice!=4);
        sc.close();
    }
}