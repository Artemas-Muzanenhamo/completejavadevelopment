/**
 * Created by amuzanenhamo on 15/03/2017.
 *
 * Inherits from the Animal Class.
 *
 * In Java terms when we want to `Inherit` fields from another Class. We
 * Need to use the `extends` keyword.
 */
public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, brain, body, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    public Dog(String name, int i1, int i, int brain, int body, int size, int weight, String s) {
        super(name, 1, 1, size, weight);

    }

    public int getEyes() {
        return eyes;
    }

    public int getLegs() {
        return legs;
    }

    public int getTail() {
        return tail;
    }

    public int getTeeth() {
        return teeth;
    }

    public String getCoat() {
        return coat;
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }
}
