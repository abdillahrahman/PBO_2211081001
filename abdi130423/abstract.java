public abstract class LivingThing
{
    public void breath(){
        System.out.println("Living Thing breathing...");
    }
    public void eat(){
        System.out.println("Living Thing eating...");
    }
    public abstract void walk();
}

public class Human extends LivingThing
{
    System.out.println("Human walks...");
    public void walk(){
    }
}