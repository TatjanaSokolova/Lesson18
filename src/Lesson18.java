public class Lesson18 {
    public static void main(String[] args) {
        System.out.println("Welcome to the Lesson 18");

        Animal myAnimal = new Animal();
        myAnimal.sleep();

        Cat myCat = new Cat();
        myCat.setName("Muris");
        myCat.sayMeow();

        Bird myBird = new Bird();
        String flyAwayMessage = myBird.flyAway();
        System.out.println(flyAwayMessage);
        // this is identical to previous command
        System.out.println(myBird.flyAway());

        myBird.sleep();
    }
}
