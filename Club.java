import java.util.List;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    // Define any necessary fields here ...
    List<Membership> clubMembers;
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        clubMembers = new ArrayList<>();// Initialise any fields here ...
        
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        clubMembers.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return clubMembers.size();
    }

    public ArrayList<Membership> remove(int month, int year) {
        
        ArrayList<Membership> removedMembers = new ArrayList<>();
        
        if (month < 1 || month > 12) {
            System.out.println("The month is out of range.");
            return removedMembers;
        }
        
        Iterator<Membership> it = clubMembers.iterator();
        while(it.hasNext()) {
            Membership member = it.next();
            if(member.getMonth() == month && member.getYear() == year) {
                removedMembers.add(member);
                it.remove();
            }
        }
        System.out.println(clubMembers);
        System.out.println(removedMembers);
        return removedMembers;
    }
}
