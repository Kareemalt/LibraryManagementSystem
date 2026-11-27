public class DVD extends LibraryItem {

    private final int loanPeriod = 14;

    public DVD(String title, int id, String shelfLocation){
        super(title, id, shelfLocation);
    }

    @Override
    public int getLoanPeriod(){
        return loanPeriod;
    }

    @Override
    public double getLateFee(long daysLate){
        return daysLate * 8;
    }

}
