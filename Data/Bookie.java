package Data;

public interface Bookie
{
    public String[] getMatchInfo();
    public void makeBet(String Team, float bet);
    public float checkBet(String team);
    public float createCofficient();
}
