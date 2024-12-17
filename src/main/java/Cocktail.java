public class Cocktail {

    // Μεταβλητές στιγμιότυπου
    private String base;      // Βάση (π.χ. whiskey, gin, etc.)
    private String flavor;    // Γεύση (π.χ. sweet, sour, bitter)
    private String intensity; // Ένταση (π.χ. light, medium, strong)

    // Κατασκευαστής
    public Cocktail(String base, String flavor, String intensity) {
        this.base = base;
        this.flavor = flavor;
        this.intensity = intensity;
    }

    // Getters
    public String getBase() {
        return base;
    }

    public String getFlavor() {
        return flavor;
    }

    public String getIntensity() {
        return intensity;
    }

    // Setters
    public void setBase(String base) {
        this.base = base;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setIntensity(String intensity) {
        this.intensity = intensity;
    }

    // Μέθοδος toString για ευκολία στην εκτύπωση του cocktail
    @Override
    public String toString() {
        return "Cocktail: " + base + ", " + intensity + ", " + flavor;
    };
}
