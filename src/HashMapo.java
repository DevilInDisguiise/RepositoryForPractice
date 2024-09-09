import java.util.*;
public class HashMapo{
    public static void main(String[] args) {
        HashMap<String,String> hasho=new HashMap<String,String>();
        hasho.put("SUV","Toyota");
        hasho.put("Truck","Cybertruck");
        hasho.put("Sedan","ford");
        System.out.println(hasho.get("SUV"));
        System.out.println(hasho);
        //To get Keys
        for(String i:hasho.keySet())
        {
            System.out.println(i);
        }
        //To get values
        for (String i:hasho.values())
        {
            System.out.println(i);
        }
        //Print both keys and values
        System.out.println("\n");
        System.out.println("Printing both key and value");
        for(String i:hasho.keySet())
        {
            System.out.println("Keys : "+i+" , value : "+hasho.get(i));
        }
    }

}
