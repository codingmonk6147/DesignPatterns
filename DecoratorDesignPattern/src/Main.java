import BaseBeverage.Coffee;
import BaseBeverage.Decaf;
import BaseBeverage.Expresso;
import DecoratorBeverage.Caramel;
import DecoratorBeverage.Cream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Coffee ExpressoWithCream = new Cream(new Expresso());
        Coffee DecafWithCreamWithCaramel = new Caramel(new Cream(new Decaf()));
        System.out.println("Price of expresso with cream : "+ ExpressoWithCream.price());
        System.out.println("Price of decaf  with caramel + cream : "+ DecafWithCreamWithCaramel.price());

    }
}