import java.util.ArrayList;
// Main application class
public class MyFarm {
    public static void main(String[] args) {
        // Create an ArrayList to store farm animals
        ArrayList<FarmAnimal> animals = new ArrayList<>();

        // Create instances of different farm animals and add them to the ArrayList
        animals.add(new Duck("Donald", "male", 3.2, 5));
        animals.add(new Duck("Cheese", "female", 3.6, 5));
        animals.add(new Cow("Molly", "female", 1600.0, 3));
        animals.add(new Chicken("Albert", "male", 1.6, 2));
        animals.add(new Chicken("Amelia", "female", 1.8, 4));
        animals.add(new Chicken("Dixie", "female", 1.7, 4));

        // Print out information for each animal in the ArrayList
        for (FarmAnimal animal : animals) {
            System.out.println(animal.toString());
        }

        // Print out the feeding schedule for each animal
        for (FarmAnimal animal : animals) {
            System.out.println(animal.getName() + ": " + animal.feedLoadingSchedule());
        }
    }
}
