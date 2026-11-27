import java.util.ArrayList;

public abstract class Member {

    private static int nextId = 1;

    private final int id;
    private String name;
    private String phoneNumber;
    private final BorrowingHistory borrowingHistory;

    public Member(String name, String phoneNumber){

        id = nextId++;
        setName(name);
        setPhoneNumber(phoneNumber);
        borrowingHistory = new BorrowingHistory();
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public BorrowingHistory getBorrowingHistory() {
        return borrowingHistory;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            throw new IllegalArgumentException("Name can not be empty");
        }

        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber){

        for(int i = 0; i < phoneNumber.length(); i++){

            if(phoneNumber.charAt(i) > '9' || phoneNumber.charAt(i) < '0'){
                throw new IllegalArgumentException("A phone number contains only numbers in it!");
            }
        }

        this.phoneNumber = phoneNumber;
    }

    public abstract int getBorrowingLimit();
}
