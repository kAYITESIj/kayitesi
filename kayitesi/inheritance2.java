 class inheritance2 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.breathe();
        myDog.bark();    
    }
}
class Animal {
    void breathe() {
        System.out.println("Animal is breathing.");
    }
}


class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}



