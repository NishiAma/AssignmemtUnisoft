public class Solution {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

        Bird duck = new Duck();
        duck.sing();
        duck.fly();
        duck.walk();

        Bird chicken = new Chicken();
        chicken.sing();
        chicken.fly();
        chicken.walk();

        Bird rooster = new Chicken("rooster");
        rooster.sing();
        rooster.fly();
        rooster.walk();

        Bird parrot1 = new Parrot(new Dog().sound);
        parrot1.walk();
        parrot1.fly();
        parrot1.sing();

        Bird parrot2 = new Parrot(new Cat().sound);
        parrot2.walk();
        parrot2.fly();
        parrot2.sing();

        Bird parrot3 = new Parrot(new Chicken("rooster").sound);
        parrot3.walk();
        parrot3.fly();
        parrot3.sing();
    }
}
