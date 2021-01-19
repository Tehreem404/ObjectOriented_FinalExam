public class Easy extends Difficulty implements Challenged {
    private final int idScore = 3;
    private final int idCoins = 4;
    private final int idTime = 5;
    private final int idLives = 6;

    private int challenge;
    /**
     * Default constructor.
     */
    public Easy() {
        this.challenge = 0;
    }

    /**
     * Sets all needed values.
     * @param inputs
     * @param constants
     */
    public void setEverything(String[] inputs, double[] constants) {
        setId(inputs[0]);
        setDifficultyConstant(constants[0]);
        setDifficulty(inputs[1]);
        setNumChallengesComplete(Integer.valueOf(inputs[2]));
        setBaseScore(Double.valueOf(inputs[this.idScore]));
        setCoinsFound(Integer.valueOf(inputs[this.idCoins]));
        setTimeTaken(Double.valueOf(inputs[this.idTime]));
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
            - (getTimeTaken() * getDifficultyConstant())
            - (getLivesLost() * getDifficultyConstant());
        double bonus = getBonusScore();
        return score + bonus;
    }

    @Override
    public void setNumChallengesComplete(int numChallenges) {
        this.challenge = numChallenges;
    }

    @Override
    public int getNumChallengesComplete() {
        return this.challenge;
    }

    @Override
    public double getBonusScore() {
        return this.challenge * getDifficultyConstant();
    }

}
