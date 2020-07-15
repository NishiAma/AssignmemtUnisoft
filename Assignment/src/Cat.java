public class Cat extends  Animal{
    String sound = "Meow";

    @Override
    final boolean fly() {
        System.out.println("I can't fly");
        return false;
    }
}
