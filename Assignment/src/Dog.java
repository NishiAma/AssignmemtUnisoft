public class Dog extends Animal{
    String sound = "Woof woof";

    @Override
    final boolean fly() {
        System.out.println("I can't fly");
        return false;
    }
}
