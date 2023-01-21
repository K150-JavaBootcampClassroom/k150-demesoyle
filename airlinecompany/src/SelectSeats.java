import java.util.Scanner;
public class SelectSeats {
Scanner sc = new Scanner(System.in);

    private Seats seats;

    public SelectSeats(Seats seats) {

       String selectedSeat=sc.nextLine();

        seats.bookingSeat(selectedSeat);
        this.seats=seats;


    }
}
