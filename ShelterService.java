package jp3;

import java.util.*;

class ShelterService {
    private List<Animal> animals = new ArrayList<>();
    private List<Adopter> adopters = new ArrayList<>();

    public void intake(Animal animal) {
        animals.add(animal);
        System.out.println(animal.getName() + " has been added to the shelter.");
    }

    public void registerAdopter(Adopter adopter) {
        adopters.add(adopter);
        System.out.println(adopter.getName() + " has been registered as adopter.");
    }

    public Animal matchAdopter(Adopter adopter) {
        for (Animal animal : animals) {
            if (!animal.isAdopted() && animal.getSpecies().equalsIgnoreCase(adopter.getPreference())) {
                return animal;
            }
        }
        return null;
    }

    public Animal matchAdopter(Adopter adopter, String breed) {
        for (Animal animal : animals) {
            if (!animal.isAdopted() && animal.getSpecies().equalsIgnoreCase(adopter.getPreference())) {
                return animal;
            }
        }
        return null;
    }

    public void vaccinate(Animal animal) {
        animal.setHealthStatus("Vaccinated");
        System.out.println(animal.getName() + " has been vaccinated.");
    }

    public void adopt(Adopter adopter, Animal animal) {
        if (adopter.isApproved() && !animal.isAdopted()) {
            animal.setAdopted(true);
            System.out.println(adopter.getName() + " adopted " + animal.getName() + ".");
        } else {
            System.out.println("Adoption could not be completed.");
        }
    }

    public void report() {
        System.out.println("\n=== Animals Awaiting Adoption ===");
        for (Animal animal : animals) {
            if (!animal.isAdopted()) {
                animal.displayProfile();
            }
        }
    }
}
