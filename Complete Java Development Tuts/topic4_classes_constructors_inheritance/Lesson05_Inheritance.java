/**
 * Created by amuzanenhamo on 15/03/2017.
 *
 * What Is Inheritance?
 *
 * Different kinds of objects often have a certain amount in common with each other.
 * Mountain bikes, road bikes, and tandem bikes, for example, all share the
 * characteristics of bicycles (current speed, current pedal cadence, current gear).
 * Yet each also defines additional features that make them different: tandem bicycles
 * have two seats and two sets of handlebars; road bikes have drop handlebars; some
 * mountain bikes have an additional chain ring, giving them a lower gear ratio.
 *
 * Object-oriented programming allows classes to inherit commonly used state and behavior from other classes.
 *
 * Using inheritance, an object need only define those qualities that make it unique within its class.
 * It can inherit its general attributes from its parent. Thus, it is the inheritance mechanism that
 * makes it possible for one object to be a specific instance of a more general case.
 */
public class Lesson05_Inheritance {


    public static void main(String[] args) {
        Animal animal = new Animal("Shumba", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "lomh silky" );

        /**
         * The `.eat()` method is accessed from the Parent Class which is the Animal Class which has a public
         * method that is eat()
         */
        dog.eat();
    }

}
