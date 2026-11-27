import java.util.ArrayList;

public abstract class LibraryItem implements Reservable {

    private String title;
    private final int id;
    private String shelfLocation;
    private boolean isAvailable;
    private ArrayList<Reservation> reservations = new ArrayList<>();

    LibraryItem(String title, int id, String shelfLocation){

        if(id <= 0){
            throw new IllegalArgumentException("ID must be a positive number!");
        }

        setTitle(title);
        this.id = id;
        setShelfLocation(shelfLocation);
    }

    public String getTitle(){
        return title;
    }

    public int getId(){
        return id;
    }

    public String getShelfLocation(){
        return shelfLocation;
    }

    public void setTitle(String title){
        if(title.isEmpty()){
             throw new IllegalArgumentException("The title can not be empty!");
        }
        else{
            this.title = title;
        }
    }

    public void setShelfLocation(String shelfLocation){
        if(shelfLocation.isEmpty()){
            throw new IllegalArgumentException("Shelf Location can not be empty!");
        }
        else{
            this.shelfLocation = shelfLocation;
        }
    }

    @Override
    public void reserve(Reservation reservation){
        reservations.add(reservation);
    }

    @Override
    public void cancelReservation(Reservation reservation){
        reservations.remove(reservation);
    }

    public abstract int getLoanPeriod();
    public abstract double getLateFee(long daysLate);
}


