import java.util.*;


class Arraylisto {

    public static void main(String[] args) {
       ArrayList<Integer> car= new ArrayList<Integer>();
       car.add(1);
       car.add(2);
       car.add(3);
        System.out.println(car);
        System.out.println(car.get(0));
        car.set(0,23);
        System.out.println(car);
        for(int i=0; i<car.size();i++)
        {
            if(car.get(i)==2)
            {
                car.set(i,8);
            }
        }
        System.out.println(car);
        Collections.sort(car);
        System.out.println(car);


    }
}