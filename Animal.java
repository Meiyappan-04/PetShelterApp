 package jp3;
abstract class Animal {
    protected int animalId;
    protected String name;
    protected String species;
    protected int age;
    protected String healthStatus;
    protected boolean adopted;

    public Animal(int animalId, String name, String species, int age, String healthStatus) {
        this.animalId = animalId;
        this.name = name;
        this.species = species;
        this.age = age;
        this.healthStatus = healthStatus;
        this.adopted = false;
    }

    public int getAnimalId() { return animalId; }
    public String getName() { return name; }
    public String getSpecies() { return species; }
    public int getAge() { return age; }
    public String getHealthStatus() { return healthStatus; }
    public boolean isAdopted() { return adopted; }
    public void setAdopted(boolean adopted) { this.adopted = adopted; }
    public void setHealthStatus(String status) { this.healthStatus = status; }

    public abstract void displayProfile();
}
