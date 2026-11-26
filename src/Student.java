public class Student extends Member {

    private final int borrowingLimit = 8;

    public Student(String name, String phoneNumber){
        super(name, phoneNumber);
    }

    @Override
    public int getBorrowingLimit(){
        return borrowingLimit;
    }

}
