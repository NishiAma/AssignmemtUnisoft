import org.junit.platform.commons.util.StringUtils;

public class Chicken extends Bird{

    Chicken(){
        sound = "Cluck Cluck";
        setWingsClipped(true);
    }
    Chicken(String rooster){
        if("Rooster".equalsIgnoreCase(rooster)) sound = "Cock-a-doodle-doo";
        else sound = "Cluck Cluck";
        setWingsClipped(true);
    }

    @Override
    final boolean swim() {
        System.out.println("I can't swim");
        return false;
    }
}
