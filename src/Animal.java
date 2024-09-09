public class Animal {
    public void animalSound()
    {
        System.out.println("The animal makes some sound");
    }
}
class Pig extends Animal
        {
            public void taste()
            {
                System.out.println("yummy");
            }
            public void animalSound()
            {
                System.out.println("yoink yoink");
            }
        }

class Dog extends Animal
{
    public void animalSound()
    {
        System.out.println("bhow bhow");
    }
}
class Main2
{
    public static void main(String[] args) {
        Pig ob=new Pig();
        ob.animalSound();
        ob.taste();
    }
}