import java.util.HashMap;
import java.util.Map;

public class Seats {
  private   HashMap<String, Boolean> seats ;// koltuklar için  abcd 12345 - ve
   private HashMap<String, String> seatsCategory ;                                                  // true veya false doluluk durumu
// hasmapi dolduralım ----------
    //hasmapi oluşturduktan sonra A ve B koltukları Busines kalanları C ve D yide ekonomik olarak atadım.
    public Seats() {
        for (char i = 'A'; i < 'E'; i++) {

            for (int j = 1; j <= 5; j++) {

                seats.put(i + "" + j, true);
                if(i=='A' || i=='B'){
                    seatsCategory.put(i+""+j,"business");
                } else {
                    seatsCategory.put(i+""+j,"economy");

                }
            }

        }
    }
    //rezervasyon metotu
    public void bookingSeat(String seatNo) {
        seats.put(seatNo, false);
    }
    // koltuk no kontrol metodu
    public boolean checkSeat(String seatNo) {
        return seats.get(seatNo);
    }
//--------- getr setrlar
    public HashMap<String, Boolean> getSeats() {
        return seats;
    }

    public void setSeats(HashMap<String, Boolean> seats) {
        this.seats = seats;
    }

    public HashMap<String, String> getSeatsCategory() {
        return seatsCategory;
    }

    public void setSeatsCategory(HashMap<String, String> seatsCategory) {
        this.seatsCategory = seatsCategory;
    }
}