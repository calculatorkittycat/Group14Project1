package SportsTask;

public class Football extends Sport{

    public Football(int numberOfPlayers, int numberOfRefs, String rules) {
        super(numberOfPlayers, numberOfRefs, rules);
    }

    @Override
    public void play() {
        System.out.println("Football");;
    }


}
