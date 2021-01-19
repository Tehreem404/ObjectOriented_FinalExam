import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ScoreCalc {
    private final int idScore = 3;
    private ArrayList<Difficulty> players = new ArrayList<>();
    private double[] constants = new double[this.idScore];

    /**
     * Default constructor.
     */
    public ScoreCalc() {
        this.players = new ArrayList<>();
    }

    /**
     * Constructor.
     * @param filename
     * @throws FileNotFoundException
     */
    public ScoreCalc(String filename) {
        System.out.println(filename);
        //use file try catch open file exception
        ArrayList<String> lines = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File(filename));

            sc.useDelimiter("\n");
            while (sc.hasNext()) {
                lines.add(sc.next());
            }
            sc.close();
        } catch (Exception e) {
            System.out.print(e.getMessage());
            System.exit(0);
        }

        parser(lines);
    }

    /**
     * Parses lines.
     * @param lines
     */
    private void parser(ArrayList<String> lines) {
        String[] spl = lines.get(0).split(",");
        for (int i = 0; i < this.idScore; i++) {
            this.constants[i] = Double.valueOf(spl[i]);
        }

        for (int i = 1; i < lines.size(); i++) {
            String[] spl2 = lines.get(i).split(",");
            setInputs(spl2);
        }
    }

    /**
     * Setting all the parsed inputs.
     * @param inputs
     */
    private void setInputs(String[] inputs) {
        if (inputs[1].contains("E")) {
            Easy tmp = new Easy();
            tmp.setEverything(inputs, this.constants);
            players.add(tmp);
        } else if (inputs[1].contains("H")) {
            Heroic tmp = new Heroic();
            tmp.setEverything(inputs, this.constants);
            players.add(tmp);
        } else if (inputs[1].contains("C")) {
            HardCore tmp = new HardCore();
            tmp.setEverything(inputs, this.constants);
            players.add(tmp);
        }
    }

    /**
     * Getter.
     * @param playerID
     * @return the score based on player ID
     */
    public double getScore(String playerID) {
        return 0.0;
    }

    /**
     * Class to string.
     * @return the class as a string
     */
    @Override
    public String toString() {
        //prints every player Id and score
        String allPlayers = "";
        for (Difficulty player : players) {
            allPlayers = allPlayers + player.getId() + "," + player.getLeaderboardScore() + "\n";
        }
        return allPlayers;
    }
}
