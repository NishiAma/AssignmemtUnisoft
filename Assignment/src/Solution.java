public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
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

        System.out.println("******* B *********");

        Animal fish = new Fish();
        fish.walk();

        Fish shark1 = new Shark();
        shark1.swim();
        shark1.walk();


        Clawnfish clawnfish = new Clawnfish();
        clawnfish.walk();
        clawnfish.swim();
        clawnfish.makeJokes();

        Shark shark2 = new Shark();
        shark2.swim();
        shark2.eat(shark1);
        shark2.eat(clawnfish);

        System.out.println("***** D *****");

        Caterpillar calterpiller = new Caterpillar();
        calterpiller.walk();

        Butterfly butterfly = solution.metamorphosis(calterpiller);
        butterfly.walk();
        butterfly.fly();

        System.out.println("***** E *****");
        solution.count();

        System.out.println("*** BONUS ***");
        Chicken sinhalaRooster = new Chicken("Rooster", "Sinhalese");
        sinhalaRooster.sing();

    }

    Butterfly metamorphosis(Caterpillar caterpillar){
        if (Type.CATERPILLAR.equals(caterpillar.currentType)){
            caterpillar = null;
            return new Butterfly();
        }
        return null;
    }

    public void count(){
        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new Clawnfish(),
                new Dolphin(),
                new Dog(),
                new Butterfly(),
                new Cat()
        };

        int countFly = 0;
        int countWalk = 0;
        int countSwim = 0;
        int countSing = 0;

        for(Animal a : animals){
            if(a.walk()) countWalk++;
            if(a.fly()) countFly++;
            if(a.swim()) countSwim++;
            if(a.sing()) countSing++;
        }

        System.out.println("Number of Animals Walking : " + countWalk);
        System.out.println("Number of Animals Swimming : " + countSwim);
        System.out.println("Number of Animals Singing : " + countSing );
        System.out.println("Number of Animals Flying : " + countFly);
    }
}
