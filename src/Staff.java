public class Staff extends Member {

    private final int borrowingLimit = 20;

    public Staff(String name, String phoneNumber){
        super(name, phoneNumber);
    }

    @Override
    public int getBorrowingLimit(){
        return borrowingLimit;
    }

}
