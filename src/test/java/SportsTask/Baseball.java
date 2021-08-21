package SportsTask;

public final class Baseball extends Sport{

    public Baseball(int numberOfPlayers, int numberOfRefs, String rules) {
        super(numberOfPlayers, numberOfRefs, rules);
    }

    @Override
    public void play() {
        System.out.println("BaseBall");
    }


}
