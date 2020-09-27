public class Player {
    private int points;

    public Player(String playerName) {
    }

    public void wonPoint() {
        points += 1;
    }

    public int score() {
        return points;
    }
}
