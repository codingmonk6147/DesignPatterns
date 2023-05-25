import enums.City;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        BookMyShow bookMyShow = new BookMyShow();

        bookMyShow.initialize();

        //user1
        bookMyShow.createBooking(City.Bangalore, "BAAHUBALI");
        //user2
        bookMyShow.createBooking(City.Bangalore, "BAAHUBALI");

    }



}