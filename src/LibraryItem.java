import java.util.ArrayList;

public abstract class LibraryItem implements Reservable {

    private static int nextId = 1;

    private String title;
    private final int id;
    private String shelfLocation;
    private boolean isAvailable = true;
    private ArrayList<Reservation> reservations = new ArrayList<>();

    LibraryItem(String title, String shelfLocation){
        setTitle(title);
        this.id = nextId++;
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

    public boolean isAvailable() {
        return isAvailable;
    }

    public ArrayList<Reservation> getReservations(){
        return new ArrayList<>(reservations);
    }

    public void setTitle(String title){
        if(title == null || title.isBlank()){
             throw new IllegalArgumentException("The title can not be empty!");
        }
        else{
            this.title = title;
        }
    }

    public void setShelfLocation(String shelfLocation){
        if(shelfLocation == null || shelfLocation.isBlank()){
            throw new IllegalArgumentException("Shelf Location can not be empty!");
        }
        else{
            this.shelfLocation = shelfLocation;
        }
    }

    @Override
    public void reserve(Reservation reservation){

        if(reservation == null){
            throw new IllegalArgumentException("A reservation can not be null!");
        }
        else if(reservations.contains(reservation)){
            throw new IllegalStateException("There is an existing reservation!");
        }
        else if(!isAvailable){
            throw new IllegalStateException("The item is unavailable!");
        }

        reservations.add(reservation);
    }

    @Override
    public void cancelReservation(Reservation reservation){
        if(reservation == null || !reservations.remove(reservation)){
            throw new IllegalArgumentException("The reservation doesn't exist");
        }
    }

    void markBorrowed(){
        if(!isAvailable){
            throw new IllegalStateException("The item is already unavailable!");
        }

        isAvailable = false;
    }

    void markReturned(){
        if(isAvailable){
            throw new IllegalStateException("The item is already available!");
        }

        isAvailable = true;
    }

    @Override
    public String toString() {
        return String.format("%-10s | ID: %-4d | %-25s | Shelf: %-4s",
                getClass().getSimpleName(),
                id,
                title,
                shelfLocation);
    }

    public abstract int getLoanPeriod();
    public abstract double getLateFee(long daysLate);
}


