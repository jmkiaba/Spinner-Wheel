/**class: CreateWheel
 *
 * @author Jeancarlo Masciotti
 * @since August 10, 2021
 * @version 1.0
 * 	This class allows the user to create a wheel by giving it a name and adding slots
 * 	    to the wheel.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class CreateWheel {

    ArrayList<String> category;
    String wheelName;
    public CreateWheel() {

        Scanner input = new Scanner(System.in);
        category = new ArrayList<String>();
        System.out.println("Give a name for the wheel.");
        wheelName = input.nextLine();
        category.add(wheelName);
        String slot;
        System.out.println("Add a slot. \nType D when finished.");
        do {

            slot = input.nextLine();
            category.add(slot);
        } while (!slot.equalsIgnoreCase("D"));
        int lastIndex = category.size() - 1;
        category.remove(lastIndex);
        wheelName = category.get(0);
        System.out.println(wheelName);
        input.close();
    }
}
