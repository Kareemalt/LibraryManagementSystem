import java.util.ArrayList;

//delegates everything to catalog

public class LibraryBranch {

    private String branchName;
    private Catalog<LibraryItem> catalog;

    LibraryBranch(String branchName){
        this.branchName = branchName;
        this.catalog = new Catalog<>();
    }

    public void addItem(LibraryItem item) {
        catalog.addItem(item);
    }

    public void removeItem(LibraryItem item) {
        catalog.removeItem(item);
    }

    public ArrayList<LibraryItem> getItems() {
        return catalog.getItems();
    }
}
