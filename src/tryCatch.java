public class tryCatch {
    void checkAge(int age)
    {
        if (age<18)
        {
            throw new ArithmeticException("Access to Club denied");
        }
        else
        {
            System.out.println("Access granted");
        }
    }
    public static void main(String[] args) {


    String[] a={"India","Pakistan","America"};
    try{
        System.out.println(a[1]);
        System.out.println(a[10]);

    }catch(Exception e)
    {
        System.out.println("out of bound");
    }
    finally {
        System.out.println("try-catch ended");
    }

        System.out.println("\n\n");
    tryCatch ob=new tryCatch();
    ob.checkAge(15);
}}
