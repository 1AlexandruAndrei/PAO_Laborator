package animal;

public class Animal {
    private String name;
    private int noOflegs;

    public Animal() {
    }

    public Animal(String name, int noOflegs)
    {
        this.name=name;
        this.noOflegs=noOflegs;
    }

    public int getNoOflegs() {
        return noOflegs;
    }

    public void setNoOflegs(int noOflegs) {
        this.noOflegs = noOflegs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void eat()
    {
        System.out.println("eat");
    }

    public void move()
    {
        System.out.print("move");
    }

    public void eat(String food)
    {
        System.out.print("eat" + food);
    }
}
