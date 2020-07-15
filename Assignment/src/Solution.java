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
    }
}
