/**class: RandomWheel
 *
 * @author Jeancarlo Masciotti
 * @since August 10, 2021
 * @version 1.0
 * 	This is the main class that uses the other classes that allows the user to create a
 * 	    spinner wheel and is able to get a random slot from the wheel.
 */

public class RandomWheel {

    public static void main(String[] args ) {

        CreateWheel wheel = new CreateWheel();
        Randomizer random = new Randomizer(wheel.category);
    }
}
