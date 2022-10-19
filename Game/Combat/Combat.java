package Combat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Combat {
  static BufferedReader reader = new BufferedReader(
  new InputStreamReader(System.in));
    
    public static void combat () throws IOException {
        System.out.println("You have entered combat with a mysterious force.");
        boolean inCombat = true;
        while (inCombat) {
            System.out.println("Choose your action.");
            String choice = reader.readLine();

            if (choice.equalsIgnoreCase("attack")) {
                System.out.println("You are attacking.");
            }


        }
    }
}
