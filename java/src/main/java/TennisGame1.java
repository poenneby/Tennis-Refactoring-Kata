
public class TennisGame1 implements TennisGame {

    private Player player1;
    private Player player2;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1 = new Player(player1Name);
        this.player2 = new Player(player2Name);
    }

    public void wonPoint(String playerName) {
        if (playerName.equals("player1")) {
            player1.wonPoint();
        } else {
            player2.wonPoint();
        }
    }

    public String getScore() {
        if (scoreIsEqual()) {
            return equalScoreText(player1.score());
        } else if (scoreIsAtLeast4()) {
            return advantageScoreText();
        } else {
            return scoreToText(player1.score()) + "-" + scoreToText(player2.score());
        }
    }

    private boolean scoreIsEqual() {
        return player1.score() == player2.score();
    }

    private boolean scoreIsAtLeast4() {
        return player1.score() >= 4 || player2.score() >= 4;
    }

    private String equalScoreText(int score) {
        if (score == 0) {
            return "Love-All";
        } else if (score == 1) {
            return "Fifteen-All";
        } else if (score == 2) {
            return "Thirty-All";
        } else {
            return "Deuce";
        }
    }

    private String advantageScoreText() {
        int difference = player1.score() - player2.score();
        if (difference == 1) {
            return "Advantage player1";
        } else if (difference == -1) {
            return "Advantage player2";
        } else if (difference >= 2) {
            return "Win for player1";
        } else {
            return "Win for player2";
        }
    }

    private String scoreToText(int currentScore) {
        if (currentScore == 0) {
            return "Love";
        } else if (currentScore == 1) {
            return "Fifteen";
        } else if (currentScore == 2) {
            return "Thirty";
        } else if (currentScore == 3) {
            return "Forty";
        }
        return "";
    }
}
