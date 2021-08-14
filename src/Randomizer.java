/**class: Randomizer
 *
 * @author Jeancarlo Masciotti
 * @since August 10, 2021
 * @version 1.0
 * 	This class gets a wheel that has been selected and created by the user and randomly
 * 	    chooses one of the slots that are contained in the wheel.
 */

import java.util.ArrayList;
import java.util.Random;

public class Randomizer {

    public Randomizer(ArrayList<String> category) {

        Random random = new Random();
        category.remove(0);
        int catSize = category.size();
        int randCat = random.nextInt(catSize);
        System.out.println(category.get(randCat));
    }
}
