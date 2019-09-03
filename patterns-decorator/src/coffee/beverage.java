package coffee;

public abstract class Beverage {

    private String description;

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    public abstract float cost();
}