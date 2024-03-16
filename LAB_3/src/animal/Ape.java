package animal;

public class Ape extends Animal{

    private String size;
    public Ape(int noOfLegs, String name, String size)
    {
        super(name, noOfLegs);///call parent class constructor
        this.size=size;
    }

    @Override
    public void move()
    {
        System.out.println("I can jump");

    }


}
