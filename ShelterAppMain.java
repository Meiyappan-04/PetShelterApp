package jp3;

public class ShelterAppMain {
    public static void main(String[] args) {
        ShelterService shelter = new ShelterService();

        Animal dog1 = new Dog(1, "Buddy", 3, "Healthy", "Labrador", "Friendly");
        Animal cat1 = new Cat(2, "Whiskers", 2, "Healthy", "Persian", "Calm");
        shelter.intake(dog1);
        shelter.intake(cat1);

        Adopter adopter1 = new Adopter(101, "Alice", "1234567890", "Dog", true);
        Adopter adopter2 = new Adopter(102, "Bob", "9876543210", "Cat", true);
        shelter.registerAdopter(adopter1);
        shelter.registerAdopter(adopter2);

        Animal match1 = shelter.matchAdopter(adopter1);
        if (match1 != null) {
            shelter.vaccinate(match1);
            shelter.adopt(adopter1, match1);
        }

        Animal match2 = shelter.matchAdopter(adopter2);
        if (match2 != null) {
            shelter.vaccinate(match2);
            shelter.adopt(adopter2, match2);
        }

        shelter.report();
    }
}
