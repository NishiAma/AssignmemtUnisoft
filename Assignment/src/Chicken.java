import org.junit.platform.commons.util.StringUtils;

public class Chicken extends Bird{
    public String sound = "Cluck Cluck";
    @Override
    public void sing() {
        System.out.println("I Sing " + sound);
    }

    Chicken(){
        setWingsClipped(true);
    }
    Chicken(String rooster){
        if("Rooster".equalsIgnoreCase(rooster)) sound = "Cock-a-doodle-doo";
        setWingsClipped(true);
    }

}
