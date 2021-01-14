package Data;

public class Manager {
    protected float money;
    private Team team;
    private Market market;

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public Player buyPlayer() {
        return null;
    }

    public void sellPlayer() {

    }

    public String[] watchTeam() {
        return null;
    }

    public String[] watchTransfer()
    {
        return null;
    }

    public void swapPlayers(Player player1, Player player)
    {

    }

    public float runMatch()
    {
        return 0;
    }

    protected Team generateTeam()
    {
        return null;
    }

    
}
