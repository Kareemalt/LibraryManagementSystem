public class Public extends Member {

    private final int borrowingLimit = 2;

    public Public(String name, String phoneNumber){
        super(name, phoneNumber);
    }

    @Override
    public int getBorrowingLimit(){
        return borrowingLimit;
    }

}
