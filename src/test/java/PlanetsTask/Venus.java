package PlanetsTask;

public class Venus extends Planet {

    private final boolean isBig;

    public Venus(String name, String mass, double radius, double surfaceGravity, long volume, long population, boolean isBig) {
        super(name, mass, radius, surfaceGravity, volume, population);
        this.isBig = isBig;
    }

    @Override
    public String toString() {
        return "Venus{" +
                super.toString() +
                "isBig=" + isBig +
                '}';
    }
}
