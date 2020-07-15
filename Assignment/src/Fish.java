public class Fish extends Animal{
    String size = "";
    String color = "";

    @Override
    final boolean walk() {
        System.out.println("I can't walk");
        return false;
    }

    @Override
    final boolean fly() {
        System.out.println("I can't fly");
        return false;
    }

    @Override
    final boolean sing() {
        System.out.println("I can't sing");
        return false;
    }
}
