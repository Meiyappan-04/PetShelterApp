package jp3;

class Cat extends Animal {
    private String breed;
    private String temperament;

    public Cat(int animalId, String name, int age, String healthStatus, String breed, String temperament) {
        super(animalId, name, "Cat", age, healthStatus);
        this.breed = breed;
        this.temperament = temperament;
    }

    @Override
    public void displayProfile() {
        System.out.println("Cat [ID: " + animalId + ", Name: " + name + ", Breed: " + breed +
                ", Age: " + age + ", Temperament: " + temperament + ", Health: " + healthStatus +
                ", Adopted: " + adopted + "]");
    }
}
