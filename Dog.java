package jp3;
class Dog extends Animal {
    private String breed;
    private String behavior;

    public Dog(int animalId, String name, int age, String healthStatus, String breed, String behavior) {
        super(animalId, name, "Dog", age, healthStatus);
        this.breed = breed;
        this.behavior = behavior;
    }

    @Override
    public void displayProfile() {
        System.out.println("Dog [ID: " + animalId + ", Name: " + name + ", Breed: " + breed +
                ", Age: " + age + ", Behavior: " + behavior + ", Health: " + healthStatus +
                ", Adopted: " + adopted + "]");
    }
}
