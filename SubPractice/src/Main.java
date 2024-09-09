public class Main{
    static void eligibility(int age)
    {
        if(age<18)
        {
            System.out.println("Eligible to vote");
        }
        else
        {
            System.out.println("Not Eligible to vote");
        }
    }
    static int sum(int r1,int r2)
    {
        if (r2>r1)
        {
            return r2+sum(r1,r2-1);
        }
        else
        {
            return r1;
        }
    }
    public static void main(String[] args)
    {
        System.out.println(sum(5,10));

    };
}