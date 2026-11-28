import java.util.ArrayList;

public class BorrowingHistory {

    private ArrayList<Loan> loans = new ArrayList<>();

    public void addLoan(Loan loan){
        if(loan == null){
            throw new IllegalArgumentException("A loan can not be empty!");
        }
        loans.add(loan);
    }

    public ArrayList<Loan> getActiveLoans() {
        ArrayList<Loan> activeLoans = new ArrayList<>();

        for (Loan loan : loans) {
            if (!loan.isReturned()) {
                activeLoans.add(loan);
            }
        }

        return activeLoans;
    }

    public int getActiveLoanCount() {
        return getActiveLoans().size();
    }

    public ArrayList<Loan> getLoans(){
        return new ArrayList<>(loans);
    }
}
