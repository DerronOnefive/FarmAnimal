/**
 * ClassName:FarmAnimal
 * @Author:Derron
 * @Version:1.0
 * Course:ITEC 2140
 * Date: 3/18/2024
 */
import java.util.ArrayList;

// Superclass representing a farm animal
abstract class FarmAnimal {
    // Attributes common to all farm animals
    protected String name;
    protected String gender;
    protected double weight;
    protected int age;

    // Constructor
    public FarmAnimal(String name, String gender, double weight, int age) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.age = age;
    }

    // Getters and setters for attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Abstract method for feeding schedule
    public abstract String feedLoadingSchedule();

    // Abstract method for sound
    public abstract String sound();

    // toString method to provide a string representation of the object
    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + sound() + " [name=" + name + ", gender=" + gender + ", weight=" + weight + ", age=" + age + "]";
    }
}

// Subclass representing a Chicken
class Chicken extends FarmAnimal {
    private String sound = "Cluck Cluck";

    // Constructor
    public Chicken(String name, String gender, double weight, int age) {
        super(name, gender, weight, age);
    }

    // Override feedLoadingSchedule method
    @Override
    public String feedLoadingSchedule() {
        return "8am-4pm";
    }

    // Override sound method
    @Override
    public String sound() {
        return sound;
    }
}

// Subclass representing a Cow
class Cow extends FarmAnimal {
    private String sound = "Moo Moo";

    // Constructor
    public Cow(String name, String gender, double weight, int age) {
        super(name, gender, weight, age);
    }

    // Override feedLoadingSchedule method
    @Override
    public String feedLoadingSchedule() {
        return "6am-4pm";
    }

    // Override sound method
    @Override
    public String sound() {
        return sound;
    }
}

// Subclass representing a Duck
class Duck extends FarmAnimal {
    private String sound = "Quack Quack";

    // Constructor
    public Duck(String name, String gender, double weight, int age) {
        super(name, gender, weight, age);
    }

    // Override feedLoadingSchedule method
    @Override
    public String feedLoadingSchedule() {
        return "8am-12pm-6pm";
    }

    // Override sound method
    @Override
    public String sound() {
        return sound;
    }
}

