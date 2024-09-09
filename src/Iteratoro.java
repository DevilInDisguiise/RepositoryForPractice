import java.util.*;
public class Iteratoro {
    public static void main(String[] args) {
        ArrayList<String> ob=new ArrayList<String>();
        ob.add("Enee");
        ob.add("mineee");
        ob.add("bahato");
        ob.add("ipsy");

        System.out.println(ob);
        Iterator<String> i=ob.iterator();
        //Looping through the collection
//        while(i.hasNext())
//        {
//            System.out.println(i.next());
//        }


        //removing certain item
        while(i.hasNext())
        {
            String it=i.next();
            if(it=="mineee")
            {
                i.remove();
            }
        }
//        for (int a=0;a<ob.size();a++)
//        {
//            System.out.println(ob.get(a));
//        }
        System.out.println(ob);
    }
}
