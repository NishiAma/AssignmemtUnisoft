import org.junit.platform.commons.util.StringUtils;

public class Chicken extends Bird{
    public String sound = "Cluck Cluck";


    Chicken(){
        sound = "Cluck Cluck";
        setWingsClipped(true);
    }
    Chicken(String rooster){
        if("Rooster".equalsIgnoreCase(rooster)) sound = "Cock-a-doodle-doo";
        else sound = "Cluck Cluck";
        setWingsClipped(true);
    }

}
