import java.util.*;

public class Linkedlisto {
    public static void main(String[] args)
    {
        LinkedList<String> ob=new LinkedList<String>();
        ob.add("ele3");
        ob.add("ele2");
        ob.add("ele1");
        System.out.println(ob);
        Collections.sort(ob);
        System.out.println(ob);
    }
}
