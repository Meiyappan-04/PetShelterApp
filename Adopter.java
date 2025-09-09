package jp3;

class Adopter {
    private int adopterId;
    private String name;
    private String phone;
    private String preference;
    private boolean approved;

    public Adopter(int adopterId, String name, String phone, String preference, boolean approved) {
        this.adopterId = adopterId;
        this.name = name;
        this.phone = phone;
        this.preference = preference;
        this.approved = approved;
    }

    public int getAdopterId() { return adopterId; }
    public String getName() { return name; }
    public String getPreference() { return preference; }
    public boolean isApproved() { return approved; }

    public void displayProfile() {
        System.out.println("Adopter [ID: " + adopterId + ", Name: " + name + ", Phone: " + phone +
                ", Preference: " + preference + ", Approved: " + approved + "]");
    }
}
