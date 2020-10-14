import com.pa.Group;
import com.pa.Person;

public class Main {
    public static void main(String[] args){
        Person p1 = new Person(1, "Zé");
        Person p2 = new Person(2, "Manel");
        Person p3 = new Person(3, "Antonio");

        Group g1 = new Group(p1);

        g1.addMember(p1);
        g1.addMember(p2);
        g1.addMember(p3);
        System.out.println(g1.toString());

        g1.deleteMember(p3);

        System.out.println("\n" + g1.toString());

    }

}