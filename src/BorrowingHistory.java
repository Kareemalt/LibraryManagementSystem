import java.util.ArrayList;

public class BorrowingHistory {

    ArrayList<Loan> loans = new ArrayList<>();

    public void addLoan(Loan loan){
        loans.add(loan);
    }

    public ArrayList<Loan> getLoans(){
        return new ArrayList<>(loans);
    }
}
