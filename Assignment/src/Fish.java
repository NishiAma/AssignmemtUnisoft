public class Fish extends Animal{
    void swim(){
        System.out.println("I can swim");
    }

    @Override
    final void walk() {
        System.out.println("I can't walk");
    }
}
