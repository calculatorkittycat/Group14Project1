package SportsTask;

public class Basketball extends Sport {


    public Basketball(int numberOfPlayers, int numberOfRefs, String rules) {
        super(numberOfPlayers, numberOfRefs, rules);
    }

    @Override
    public void play() {
        System.out.println("basketball");
    }


}
