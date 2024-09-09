

class Test{
    String subject1="Math";
    String subject2="English";

    int mathscore,engscore;
//    public TestFinals()
//    {};
    public Test(int msc, int esc)
    {
        mathscore=msc;
        engscore=esc;
    }
}
class Subject extends Test{
    public Subject()
    {
        super(10,30);
    }
    public static void main(String[] args) {
//        TestFinals ob1=new TestFinals();
        Subject ob=new Subject();
        System.out.println(ob.subject1+"="+ob.mathscore+" AND "+ob.subject2+"="+ob.engscore);
    }
}


