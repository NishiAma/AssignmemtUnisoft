import com.sun.source.tree.BreakTree;

public class Dolphin extends Animal{

    boolean swim(){
       return new Fish().swim();
    }

    @Override
    final boolean walk() {
        System.out.println("I can't walk");
        return false;
    }

    @Override
    final boolean fly() {
        System.out.println("I can't fly");
        return false;
    }
}
