//
//public class Threads extends Thread{
//    public void run()
//    {
//        System.out.println("Code is running in the thread");
//    }
//
//    public static void main(String[] args) {
//        Threads ob=new Threads();
//        ob.start();
//    }
//}
//
//
//
////Or implement thread using Runnable interface
//class ThreadsImple implements Runnable
//{
//    @Override
//    public void run() {
//        System.out.println("Thread implement code is running");
//    }
//
//    public static void main(String[] args) {
//        ThreadsImple i=new ThreadsImple();
//        Thread th=new Thread(i);
//        th.start();
//    }
//}


class Main3 extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        Main3 thread = new Main3();
        thread.start();
        while(thread.isAlive())
        {
            System.out.println("waiting");
        }
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }

    public void run() {
        amount++;
    }
}
