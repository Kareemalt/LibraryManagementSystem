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
        reservations.add(reservation);
    }

    @Override
    public void cancelReservation(Reservation reservation){
        reservations.remove(reservation);
    }


}
