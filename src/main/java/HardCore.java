public class HardCore extends Difficulty {
    private final int idScore = 3;
    private final int idCoins = 4;
    private final int idTime = 5;
    private final int idLives = 6;
    /**
     * Default constructor.
     */
    public HardCore() {

    }

    /**
     * Sets all needed values.
     * @param inputs
     * @param constants
     */
    public void setEverything(String[] inputs, double[] constants) {
        setId(inputs[0]);
        setDifficulty(inputs[1]);
        setDifficultyConstant(constants[2]);
        setBaseScore(Double.valueOf(inputs[this.idScore]));
        setCoinsFound(Integer.valueOf(inputs[this.idCoins]));
        setTimeBeforeDeath(Double.valueOf(inputs[this.idTime]));
        setLivesLost(Integer.valueOf(inputs[this.idLives]));
        double score = calculateLeaderboardScore();
        setLeaderboardScore(score);
    }

    /**
     * Calculates all leaderboard.
     * @return final score
     */
    public double calculateLeaderboardScore() {
        double score = (getBaseScore() + getCoinsFound())
            - (getTimeTaken() * getDifficultyConstant());

        return score;
    }

    /**
     * Setter.
     * @param gameMinutes
     */
    public void setTimeBeforeDeath(double gameMinutes) {
        setTimeTaken(gameMinutes);
    }
}
