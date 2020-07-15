public class Chicken extends Bird{
    @Override
    public void sing() {
        System.out.println("I Sing Cluck Cluck");
    }

    Chicken(){
        setWingsClipped(true);
    }
}
