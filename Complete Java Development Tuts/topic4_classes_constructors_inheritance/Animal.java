/**
 * Created by amuzanenhamo on 15/03/2017.
 *
 * In terms of Inheritance, this Class would be the Parent Class with field and values that would be
 * used by Subclasses as a default.
 */
public class Animal {

    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void eat(){

        System.out.println("Animal.eat() Called");

    }

    public void move(){

    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
