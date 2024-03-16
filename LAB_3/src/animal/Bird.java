package animal;

public class Bird extends Animal{
    private String color;

    public Bird(){}
    public Bird(int noOfLegs, String name, String color)
    {
        super(name, noOfLegs);
        this.color=color;
    }

    @Override
    public void move()
    {
        System.out.println("I CAN FLY");
    }
    public void sing()
    {
        System.out.println("I CAN CHIRP");
    }
}
