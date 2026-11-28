import java.util.ArrayList;

public class StudyRoom implements Reservable {

    private static int nextRoomNumber = 1;

    private final int roomNumber;
    private int seatingCapacity;
    private ArrayList<Reservation> reservations = new ArrayList<>();

    public StudyRoom(int seatingCapacity){
        setSeatingCapacity(seatingCapacity);
        roomNumber = nextRoomNumber++;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public ArrayList<Reservation> getReservations() {
        return new ArrayList<>(reservations);
    }

    public void setSeatingCapacity(int seatingCapacity) {
        if(seatingCapacity <= 0){
            throw new IllegalArgumentException("Seating Capacity must be a positive number!");
        }
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public void reserve(Reservation reservation){

        if(reservation == null){
            throw new IllegalArgumentException("The reservation can not be null!");
        }
        else if(reservations.contains(reservation)){
            throw new IllegalStateException("The reservation already exists!");
        }

        reservations.add(reservation);
    }

    @Override
    public void cancelReservation(Reservation reservation){

        if(reservation == null || !reservations.remove(reservation)){
            throw new IllegalArgumentException("The reservation doesn't exist!");
        }
    }

    @Override
    public String toString(){
        return "Study room Number: " + roomNumber +
               ", Seating Capacity: " + seatingCapacity +
               ", Active Reservations: " + reservations.size();
    }

}
