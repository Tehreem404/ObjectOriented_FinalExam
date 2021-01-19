public interface Challenged {

    /**
     * setting number of challenges completed.
     * @param numChallenges
     */
    void setNumChallengesComplete(int numChallenges);

    /**
     * getter.
     * @return number of challenges complete
     */
    int getNumChallengesComplete();

    /**
     * getter.
     * @return bonus score
     */
    double getBonusScore();
}
