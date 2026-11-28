public class Reservation {

    private static int nextReservationId = 1;

    private final int reservationId;
    private final Member member;
    private final Reservable thingToReserve;

    public Reservation(Member member, Reservable thingToReserve){

        if(member == null || thingToReserve == null){
            throw new IllegalArgumentException("Member or the thing you want to reserve can not be null");
        }
        reservationId = nextReservationId++;
        this.member = member;
        this.thingToReserve = thingToReserve;
    }

    public int getReservationId() {
        return reservationId;
    }

    public Member getMember() {
        return member;
    }

    public Reservable getThingToReserve() {
        return thingToReserve;
    }
}
