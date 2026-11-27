import java.util.ArrayList;

public class Library {

    private ArrayList<LibraryBranch> branches = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();

    public void addBranch(LibraryBranch branch){
        branches.add(branch);
    }

    public void registerMember(Member member) {
        if (member == null) {
            throw new IllegalArgumentException("Member cannot be null.");
        }

        members.add(member);
    }
}
