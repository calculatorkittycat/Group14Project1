package PlanetsTask;

public class Moon extends Planet{

    private boolean isWhite;

    public Moon(String name, String mass, double radius, double surfaceGravity, long volume, long population, boolean isWhite) {
        super(name, mass, radius, surfaceGravity, volume, population);
        this.isWhite = isWhite;
    }

    @Override
    public String toString() {
        return "Moon{" +
                super.toString() +
                "isWhite=" + isWhite +
                '}';
    }
}
