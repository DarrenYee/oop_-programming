package game.system;

import java.util.Random;

/**
 * A class which handles rain
 */
public class Rain {
    /**
     * int game turn or round
     */
    private int turn;

    /**
     * Constructor
     */
    public Rain() {
        this.turn = 0;
    }

    /**
     * A method which define the rainy day
     * @return boolean true if it is raining else false
     */
    public Boolean isRaining(){
        if (turn<9){
            turn++;
        }
        else{
            turn=0;
            Random r = new Random();
            int randomInt = r.nextInt(100) + 1;
            if (randomInt > 80) {
                return true;
            }
        }
        return false;
    }
}
