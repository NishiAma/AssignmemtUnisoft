public class Butterfly extends Animal{

    Type currentType;

    Butterfly(){
        sound = null;
        currentType = Type.BUTTERFLY;
    }



    @Override
    final boolean walk() {
        System.out.println("I can't walk");
        return false;
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
}
