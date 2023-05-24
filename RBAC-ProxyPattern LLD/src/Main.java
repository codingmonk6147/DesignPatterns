import Model.ResourceImpl;
import Model.ResourceImpleProxy;
import Model.ResourceInterface;
import Model.ResourceObj;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

       try{
           ResourceInterface r1 = new ResourceImpleProxy();
           r1.get("ADMIN", new ResourceObj("Bibhu",1234));
           System.out.println("Successfull");

       }
       catch (Exception e){
           System.out.println(e.getMessage());

       }
    }
}