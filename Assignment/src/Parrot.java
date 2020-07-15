public class Parrot extends Bird{

    Parrot(String sound){
        this.sound = sound;
    }
    Parrot(){sound = "Creek Creek";}

    @Override
    final boolean swim() {
        System.out.println("I can't swim");
        return false;
    }
}
