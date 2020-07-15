public class Caterpillar extends Animal{
    Type currentType;

    Caterpillar(){
        sound = null;
        currentType = Type.CATERPILLAR;
    }

    @Override
    void walk() {
        System.out.println("I am crawling");
    }

}
