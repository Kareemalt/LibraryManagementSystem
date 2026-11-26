import java.util.ArrayList;

public class StudyRoom implements Reservable {

    private static int nextRoomNumber = 1;

    private final int roomNumber;
    private int seatingCapacity;
    ArrayList<Reservation> reservations = new ArrayList<>();

    public StudyRoom(int seatingCapacity){

        if(seatingCapacity <= 0){
            throw new IllegalArgumentException("Seating Capacity must be a positive number!");
        }

        roomNumber = nextRoomNumber++;
        this.seatingCapacity = seatingCapacity;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    @Override
    public void reserve(Reservation reservation){
        reservations.add(reservation);
    }

    @Override
    public void cancelReservation(Reservation reservation){
        reservations.remove(reservation);
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }
}
