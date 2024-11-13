public class CatTestDrive {
    public static void main (String[] args){

        /* initialising of the Cat */

        Cat cat1 = new Cat();

        cat1.name = "Carlson";
        cat1.coatColor = "black";
        cat1.remainingLives = 15;

        System.out.println(cat1.name + ", the cat");
        System.out.println("with " + cat1.coatColor + " coat");
        System.out.println("and " + cat1.remainingLives + " lives left, says: ");
        cat1.meow();

        System.out.println("--------------------------------");
        Cat cat2 = new Cat();

        cat2.name = "Garfield";
        cat2.coatColor = "Yellow";
        cat2.remainingLives = 6;

        System.out.println(cat2.name + ", the cat");
        System.out.println("with " + cat2.coatColor + " coat");
        System.out.println("and " + cat2.remainingLives + " lives left, says: ");
        cat2.meow();

        System.out.println("--------------------------------");





    }

}
