import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class ShowtSeats {

    private Seats seats;
    private Customer customer;

    public ShowtSeats(@NotNull Seats seats){
        for (Map.Entry<String, Boolean> entry : seats.getSeats().entrySet()) {

            if (entry.getValue()) {
                System.out.println("Boş koltuk: " + entry.getKey());
            }
        }

    }


}

