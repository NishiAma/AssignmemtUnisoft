public class Parrot extends Bird{
    String sound = "";

    Parrot(String sound){
        this.sound = sound;
    }

    @Override
    public void sing() {
        System.out.println("I Sing " + sound);
    }
}
