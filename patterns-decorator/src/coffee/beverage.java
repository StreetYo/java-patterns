package coffee;

public abstract class Beverage {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String newDescription) {
        description = newDescription;
    }

    public abstract float cost();
}