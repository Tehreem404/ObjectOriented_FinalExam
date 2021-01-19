public class Difficulty {
    private double leaderboardScore;
    private double difficultyConstant;
    private String id;
    private String difficulty;
    private double baseScore;
    private int coinsFound;
    private double timeTaken;
    private int livesLost;


    /**
     * Default constructor.
     */
    public Difficulty() {
        this.leaderboardScore = 0.0;
        this.difficultyConstant = 0.0;
        this.id = "";
        this.difficulty = "";
        this.baseScore = 0.0;
        this.coinsFound = 0;
        this.timeTaken = 0.0;
        this.livesLost = 0;
    }

    /**
     * Setter.
     * @param newLeaderboardScore
     */
    public void setLeaderboardScore(double newLeaderboardScore) {
        this.leaderboardScore = newLeaderboardScore;
    }

    /**
     * calculates the score.
     * @return calculated score
     */
    public double getLeaderboardScore() {
        return this.leaderboardScore;
    }

    /**
     * sets the difficulty constants.
     * @param val
     */
    public void setDifficultyConstant(double val) {
        this.difficultyConstant = val;
    }

    /**
     * Getter.
     * @return Difficulty constant.
     */
    public double getDifficultyConstant() {
        return this.difficultyConstant;
    }

    /**
     * Setter.
     * @param newId
     */
    public void setId(String newId) {
        this.id = newId;
    }

    /**
     * Getter.
     * @return ID
     */
    public String getId() {
        return this.id;
    }

    /**
     * Setter.
     * @param newDifficulty
     */
    public void setDifficulty(String newDifficulty) {
        this.difficulty = newDifficulty;
    }

    /**
     * Getter.
     * @return difficulty
     */
    public String getDifficulty() {
        return this.difficulty;
    }

    /**
     * Setter.
     * @param newBaseScore
     */
    public void setBaseScore(double newBaseScore) {
        this.baseScore = newBaseScore;
    }

    /**
     * Getter.
     * @return baseScore
     */
    public double getBaseScore() {
        return this.baseScore;
    }

    /**
     * Setter.
     * @param newCoinsFound
     */
    public void setCoinsFound(int newCoinsFound) {
        this.coinsFound = newCoinsFound;
    }

    /**
     * Getter.
     * @return coinsFound
     */
    public int getCoinsFound() {
        return this.coinsFound;
    }

    /**
     * Setter.
     * @param newTimeTaken
     */
    public void setTimeTaken(double newTimeTaken) {
        this.timeTaken = newTimeTaken;
    }

    /**
     * Getter.
     * @return timeTaken
     */
    public double getTimeTaken() {
        return this.timeTaken;
    }

    /**
     * Setter.
     * @param newLivesLost
     */
    public void setLivesLost(int newLivesLost) {
        this.livesLost = newLivesLost;
    }

    /**
     * Getter.
     * @return livesLost
     */
    public int getLivesLost() {
        return this.livesLost;
    }

    /**
     * class to string.
     * @return the class as a string
     */
    @Override
    public String toString() {
        //prints player ID + score
        return this.id + ',' + this.leaderboardScore;
    }
}
