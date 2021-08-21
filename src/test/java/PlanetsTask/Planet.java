package PlanetsTask;

public class Planet {

    private final String name;
    private final String mass;
    private final double radius;
    private final double surfaceGravity;
    private final long volume;
    private final long population;

    public Planet(String name, String mass, double radius, double surfaceGravity, long volume, long population) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
        this.surfaceGravity = surfaceGravity;
        this.volume = volume;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public String getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public double getSurfaceGravity() {
        return surfaceGravity;
    }

    public long getVolume() {
        return volume;
    }

    public long getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", mass='" + mass + '\'' +
                ", radius=" + radius +
                ", surfaceGravity=" + surfaceGravity +
                ", volume=" + volume +
                ", population=" + population +
                '}';
    }
}
