package Data;

public class BookMaker implements Bookie{
    Matchinfo matchinfo;
    Bet bets[];

    @Override
    public String[] getMatchInfo() {
        return new String[0];
    }

    @Override
    public void makeBet(String Team, float bet) {

    }

    @Override
    public float checkBet(String team) {
        return 0;
    }

    @Override
    public float createCofficient() {
        return 0;
    }
}
