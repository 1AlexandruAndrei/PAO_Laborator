package animal;

import java.util.Objects;

public class Duck extends Bird{
    private int length;
    public Duck(int noOfLegs, String name,String color,  int length)
    {
        super(noOfLegs, name, color);
        this.length=length;
    }
    @Override
    public void move()
    {
        System.out.println("I CAN SWIM!");
    }

    @Override
    public void sing()
    {
        System.out.println("I CAN SING!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Duck duck = (Duck) o;
        return (length == duck.length &&
                this.getName().equals(duck.getName()) &&
                this.getNoOflegs() == (duck.getNoOflegs()) &&
                this.length==duck.length);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getNoOflegs(), length);
    }
}
