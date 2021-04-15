package SimpleDotComGame;

/**
 * SimpleDotCom
 */
public class SimpleDotCom {

    int[] locationsCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs) {
        locationsCells = locs;
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for (int cell : locationsCells) {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        } // out of the loop

        if (numOfHits == locationsCells.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    } // close method
} // close class

class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();

        int[] locations = { 2, 3, 4 };
        dot.setLocationCells(locations);

        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
        String testResult = "failed";
        if (result.equals("hit")) {
            testResult = "passed";
        }

        System.out.println(testResult);
    }
}