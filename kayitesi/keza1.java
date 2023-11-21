
 class keza1 {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly(); // Accessing the method from the Flyable interface
    }
}
interface Flyable {
    void fly();
}

// Bird class implementing Flyable
class Bird implements Flyable {
    public void fly() {
        System.out.println("Bird is flying.");
    }
}

// Main class to demonstrate multiple inheritance using interfaces
public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly(); // Accessing the method from the Flyable interface
    }
}





