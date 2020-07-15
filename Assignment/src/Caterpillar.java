public class Caterpillar extends Animal{
    Type currentType;

    Caterpillar(){
        sound = null;
        currentType = Type.CATERPILLAR;
    }

    @Override
    boolean walk() {
        System.out.println("I am crawling");
        return true;
    }

    @Override
    final boolean swim() {
        System.out.println("I can't swim");
        return false;
    }

    @Override
    final boolean sing() {
        System.out.println("I can't sing");
        return false;
    }

    @Override
    final boolean fly() {
        System.out.println("I can't fly");
        return false;
    }
}
