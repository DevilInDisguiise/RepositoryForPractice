import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;

//class Vehicle {
//    protected String brand="Ford";
//####################################################
//        Abstract class/method
//####################################################

//abstract class J{
//    public abstract void p();
//    public void p2()
//    {
//        System.out.println("This is non-abstract method of J");
//    }
//    public void p3()
//    {
//        System.out.println("This is Second non abstract method of J");
//    }
//}
//class K extends J{
//    public void p()
//    {
//        System.out.println("this is abstract method for class K");
//    }
//    public void p2()
//    {
//        System.out.println("This is non abstract method of class K");
//    }
//    public void p3()
//    {
//        System.out.println("This is Second non abstract method of class K");
//    }
//}
//class L extends J{
//    public void p()
//    {
//        System.out.println("this is abstract method for class L");
//    }
//    public void p2()
//    {
//        System.out.println("This is non abstract method of class L");
//    }
//}
//public class P{
//    public staticw void main(String[] args) {
//        System.out.println("-------------");
//        K oK=new K();
//        oK.p();
//        oK.p2();
//        oK.p3();
//        System.out.println("-------------");
//        J oJ=new K();
//        oJ.p();
//        oJ.p2();
//        oJ.p3();
//        System.out.println("-------------");
//        L oL=new L();
//        oL.p();
//        oL.p2();
//        System.out.println("-------------");
//    }
//}



//####################################################
//        Interface class/method
//####################################################

//public interface P {
//    int jaco=12;//interface attributes by default are static
//    public void pm1();
//    public void pm2();
//}
//class M implements P{
//    public void pm1() {
//        System.out.println("First Interface method");
//    }
//    public void pm2() {
//        System.out.println("Second Interface method");
//    }
//}
//class J{
//    public static void main(String[] args) {
//        M ob=new M();ob.pm1();ob.pm2();
//        System.out.println(P.jaco);
//    }
//}




//####################################################
//        CONSTRUCTOR
//####################################################

public class P{
    int x;
    int y;
     public P(int z, int w)
    {
        x=z;
        y=w;
    }

    public static void main(String[] args) {

         P ob=new P(20,30);
        System.out.println(ob.x);
        System.out.println(ob.y);
    }
}