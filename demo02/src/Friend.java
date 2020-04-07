import java.util.Collection;
import java.util.ArrayList;

public class Friend {
    private Collection<Friend> friends;
    private String email;

    public Friend(String email) {
        this.email = email;
        this.friends = new ArrayList<Friend>();
    }

    public String getEmail() {
        return email;
    }

    public Collection<Friend> getFriends() {
        return friends;
    }

    public void addFriendship(Friend friend) {
        friends.add(friend);
        friend.getFriends().add(this);
    }

    public boolean canBeConnected(Friend friend) {
//       for (int i = 0; i < this.friends.size(); i++) {
//            if (this.friends.contains(friend)) {
//                System.out.println("yes");
//                return true;
//            } else {
//                Friend f = (Friend) this.friends.toArray()[i];
//                System.out.println(f.getEmail());
//                boolean a = f.canBeConnected(friend);
//                return a;
//            }
//        }
//        return false;

        if (friend == null) return false;
        for (Friend f :
                this.getFriends()) {
            if (f.email == friend.email)
                return true;
            for (Friend ff : f.getFriends()) {
                if (ff.email == friend.email)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Friend a = new Friend("A");
        Friend b = new Friend("B");
        Friend c = new Friend("C");

        a.addFriendship(b);
        b.addFriendship(c);

        System.out.println(a.canBeConnected(c));
    }
}
