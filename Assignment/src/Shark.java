public class Shark extends Fish{
    Shark(){
        size = "Large";
        color = "Gray";
    }
    void eat(Fish fish){
        if (null == fish){
            System.out.println("There's no fish");
            return;
        }
        if(!this.size.equalsIgnoreCase(fish.size)
           && !this.color.equalsIgnoreCase(fish.color)){
            System.out.println("I eat this fish");
        } else{
            System.out.println("I don't eat sharks");
        }
    }
}
