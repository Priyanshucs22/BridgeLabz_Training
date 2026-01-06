class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog sound");
    }
    void bark() {
        System.out.println("bark");
    }
}
public class inheritance {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();
        Dog d = new Dog();
        d.sound();
        d.bark();
    }
}
