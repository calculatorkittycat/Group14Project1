package PlanetsTask;

public class Mercury extends Planet{

    private final boolean smallestPlanet;

    public Mercury(String name, String mass, double radius, double surfaceGravity, long volume, long population, boolean smallestPlanet) {
        super(name, mass, radius, surfaceGravity, volume, population);
        this.smallestPlanet = smallestPlanet;
    }

    @Override
    public String toString() {
        return "Mercury{" +
                super.toString()+
                "smallestPlanet=" + smallestPlanet +
                '}';
    }
}
