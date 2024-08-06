package javapackage;

public class DiceRoller {
    public static void main(String[] args) {
        // program rolls a 20 sided dice 1000 times and records the number
        // of occurrences of each result.
        int[] diceRolls = new int[20];
        
        // sample the rolls
        for (int count = 0; count < 1000; count++) {
            int roll = (int) (Math.random() * 20) + 1;
            diceRolls[roll - 1]++; // increment the count for the rolled number
        }

        // run a report
        for (int index = 0; index < diceRolls.length; index++) {
            System.out.printf("Count of %d is: %d%n", (index + 1), diceRolls[index]);
        }
        System.out.println("Total rolls were: 1000");
        System.out.println("Program by Akshoon");
   }
}
