import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Loan {

    private final Member member;
    private final LibraryItem item;

    private final LocalDate borrowDate;
    private final LocalDate dueDate;
    private LocalDate returnDate = null;

    public Loan(Member member, LibraryItem item){
        this.member = member;
        this.item = item;
        borrowDate = LocalDate.now();
        dueDate = borrowDate.plusDays(item.getLoanPeriod());
    }

    public LocalDate getBorrowDate(){
        return borrowDate;
    }

    public LocalDate getDueDate(){
        return dueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void returnItem(){
        if(returnDate == null){
            returnDate = LocalDate.now();
        }
        else{
            throw new IllegalStateException("The item has already been returned.");
        }
    }

    public boolean isOverdue(){
        return returnDate == null && LocalDate.now().isAfter(dueDate);
    }

    public long getLateDays(){
        LocalDate temp = (returnDate == null) ? LocalDate.now() : returnDate;

        return Math.max(0, ChronoUnit.DAYS.between(dueDate, temp));
    }

}
