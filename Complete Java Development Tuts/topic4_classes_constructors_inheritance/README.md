# Reference vs Object vs Instance vs Class

*Using the House analogy we can look at the following Java terms to understand what they mean*

- A `Class` is basically a blueprint for a house, using the blueprint (plans) we can build
as many houses as we like based on those plans.
- Each how you build (in other words `instantiate` using the `new` operator) is an object
known as an `instance`.
- Each house you build has an address (a physical location). In other words if you want to
tell someone where you live, you give them your address (perhaps written on a piece of paper).
This is known as a `reference`.
- You can copy that `reference` as many times as you like but there is still just one house.
In other words we are copying the paper that has address on it not the house itself.
- We can pass `references` as parameters to `constructors` and `methods`.

### Let's look into this a little deeper!

```java
class House {
    private String color;
    
    public House(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
}

/**
* Suppose you have a simple Class called House.....
*/
public class main {
    public static void main(String[] args){
      House blueHouse = new House("blue"); // Creates a new instance 
      House anotherHouse = blueHouse; // anotherHouse is another reference to the same object in memory
      
      System.out.println(blueHouse.getColor()); // prints blue
      System.out.println(anotherHouse.getColor()); // blue
      
      anotherHouse.setColor("red");
      System.out.println(blueHouse.getColor()); // red
      System.out.println(anotherHouse.getColor()); // red
      
      House greenHouse = new House("green");
      anotherHouse = greenHouse;
      
      System.out.println(blueHouse.getColor()); // red
      System.out.println(greenHouse.getColor()); // green
      System.out.println(anotherHouse.getColor()); // green
    }
}
```