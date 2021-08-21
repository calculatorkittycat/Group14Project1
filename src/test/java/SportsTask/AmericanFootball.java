package SportsTask;

public class AmericanFootball extends Sport{

    public AmericanFootball(int numberOfPlayers, int numberOfRefs, String rules) {
        super(numberOfPlayers, numberOfRefs, rules);
    }

    @Override
    public void play() {
        System.out.println("American Football");;
    }



}
