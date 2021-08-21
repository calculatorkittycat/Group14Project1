package PlanetsTask;

public class Earth extends Planet{

    private final boolean hasLife;

    public Earth(String name, String mass, double radius, double surfaceGravity, long volume, long population, boolean hasLife) {
        super(name, mass, radius, surfaceGravity, volume, population);
        this.hasLife = hasLife;
    }

    @Override
    public String toString() {
        return "Earth{" +
                super.toString() +
                "hasLife=" + hasLife +
                '}';
    }
}
