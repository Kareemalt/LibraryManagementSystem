public class Book extends LibraryItem {

    private final int loanPeriod = 21;

    public Book(String title, int id, String shelfLocation){
        super(title, id, shelfLocation);
    }

    @Override
    public int getLoanPeriod(){
        return loanPeriod;
    }

    @Override
    public double getLateFee(int daysLate){
        return daysLate * 5;
    }

}
