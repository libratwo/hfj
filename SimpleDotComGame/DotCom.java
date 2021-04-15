package SimpleDotComGame;

import java.util.ArrayList;

/**
 * SimpleDotCom
 */
public class DotCom {

    private ArrayList<String> locationsCells;
    // private int numOfHits = 0;

    public void setLocationCells(ArrayList<String> locs) {
        locationsCells = locs;
    }

    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationsCells.indexOf(userInput);
        if (index >= 0) {
            locationsCells.remove(index);
            if (locationsCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            } // close if
        } // colse outer if
        System.out.println(result);

        return result;
    } // close method
} // close class

class SimpleDotComTestDrive2 {
    public static void main(String[] args) {
        DotCom dot = new DotCom();

        ArrayList<String> locations = new ArrayList<String>();
        locations.add(new String("1"));
        locations.add(new String("2"));
        locations.add(new String("3"));

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