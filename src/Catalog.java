import java.util.ArrayList;

//This is delegation :D :3 :P

public class Catalog <T extends LibraryItem>{

    private ArrayList<T> items = new ArrayList<>();

    public void addItem(T item){
        items.add(item);
    }

    public void removeItem(T item){
        items.remove(item);
    }

    public ArrayList<T> getItems(){
        return new ArrayList<>(items); //something was done here
    }
}
