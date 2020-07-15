import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name="person")
public class Animal {
    String sound = "";
    boolean walk(){
        System.out.println("I am walking");
        return true;
    }

    boolean swim(){
        System.out.println("I am swimming");
        return true;
    }

    boolean sing(){
        System.out.println("I am singing " + sound);
        return  true;
    }

    boolean fly(){
        System.out.println("I am flying");
        return true;
    }
}


