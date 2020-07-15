import org.junit.platform.commons.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class Chicken extends Bird{

    Map<String,String> roosterSounds = new HashMap<>(){
        {put("English","Cock-a-doodle-doo");
         put("Danish", "kykyliky");
         put("Dutch", "kukeleku");
         put("Finnish", "kukko kiekuu");
         put("French", "cocorico");
         put("German", "kikeriki");
         put("Greek", "kikiriki");
         put("Hebrew", "coo-koo-ri-koo");
         put("Hungarian", "kukuriku");
         put("Italian", "chicchirichi");
         put("Japanese", "ko-ke-kok-ko-o");
         put("Portuguese", "cucurucu");
         put("Russian", "kukareku");
         put("Swedish", "kuckeliku");
         put("Turkish", "kuk-kurri-kuuu");
         put("Urdu", "kuklooku");
         put("Sinhalese", "Kukku Ku Koooo");
        }
    };
    Chicken(){
        sound = "Cluck Cluck";
        setWingsClipped(true);
    }
    Chicken(String rooster){
        if("Rooster".equalsIgnoreCase(rooster)) sound = "Cock-a-doodle-doo";
        else sound = "Cluck Cluck";
        setWingsClipped(true);
    }

    Chicken(String rooster, String language){
        if("Rooster".equalsIgnoreCase(rooster)){
            if (StringUtils.isNotBlank(language)
                && roosterSounds.containsKey(language)){
                sound = roosterSounds.get(language);
            } else{
                sound = "Cock-a-doodle-doo";
            }
        } else{
            sound = "Cluck Cluck";
        }
        setWingsClipped(true);
    }

    @Override
    final boolean swim() {
        System.out.println("I can't swim");
        return false;
    }
}
