public class Butterfly extends Animal{

    Type currentType;

    Butterfly(){
        sound = null;
        currentType = Type.BUTTERFLY;
    }

    void fly(){
        System.out.println("I am flying");
    }

    @Override
    final void walk() {
        System.out.println("I can't walk");
    }
}
