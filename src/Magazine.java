public class Magazine extends LibraryItem {

    private final int loanPeriod = 7;

    public Magazine(String title, int id, String shelfLocation){
        super(title, id, shelfLocation);
    }

    @Override
    public int getLoanPeriod(){
        return loanPeriod;
    }

    @Override
    public double getLateFee(long daysLate){
        return daysLate * 1.5;
    }

}
