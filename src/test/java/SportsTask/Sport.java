package SportsTask;

public class Sport {

    private int numberOfPlayers;
    private int numberOfRefs;
    private String rules;

    //____constructor____
    public Sport(int numberOfPlayers, int numberOfRefs, String rules) {
        setNumberOfPlayers(numberOfPlayers);
        setNumberOfRefs(numberOfRefs);
        setRules(rules);
    }

    //____getters_and_setters____
    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getNumberOfRefs() {
        return numberOfRefs;
    }

    public void setNumberOfRefs(int numberOfRefs) {
        this.numberOfRefs = numberOfRefs;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    //____methods_____

    public void play(){
        System.out.println(numberOfPlayers+" are playing" );
    }

    @Override
    public String toString() {
        return "Sport{" +
                "numberOfPlayers=" + numberOfPlayers +
                ", numberOfRefs=" + numberOfRefs +
                ", rules='" + rules + '\'' +
                '}';
    }
}
