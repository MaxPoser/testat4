/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harvestManagement;

import java.util.ArrayList;

/**
 *
 * @author Sina Stumpp
 */
public class BerryManager {

    ArrayList<Berry> myBerries;

    /**
     * Creates new ArrayList Berry and includes demo content
     */
    public BerryManager() {

        myBerries = new ArrayList<Berry>();

        //Demo data
        Berry berry01 = new Berry("Strawberry", 2.0, "Red", "sweet");
        Berry berry02 = new Berry("Blackberry", 1.0, "Dark Blue", "sour");
        Berry berry03 = new Berry("Rass", 2.0, "Male", "GER");
        myBerries.add(berry01);
        myBerries.add(berry02);
        myBerries.add(berry03);
    }

    /**
     * Controls if Id in Array List equals to Id to prevent data problems. If
     * condition is met, removes Berry entry from ArrayList.
     */
    public void deleteBerry(int id) {
        for (int i = 0; i < myBerries.size(); i++) {
            if (myBerries.get(i).getBerryId() == id);
            {
                myBerries.remove(i);
            }
        }
    }

    /**
     * Controls if Id in Array List equals to Id to prevent data problems.
     * Replace berry element at index i to new berry element.
     */
    public void updateBerry(int id, Berry berry) {
        for (int i = 0; i < myBerries.size(); i++) {
            if (myBerries.get(i).getBerryId() == id) {
                myBerries.set(i, berry);
            }
        }
    }

    /**
     * Adds created berry to ArrayList myBerries
     */
    public void addBerry(Berry berry) {
        myBerries.add(berry);
    }

    /**
     * Returns all Berries from ArrayList
     *
     * @return
     */
    public ArrayList<Berry> getAllBerries() {
        return this.myBerries;
    }

    /**
     * reads user input and controls it if input equals null or is no letter,
     * user is asked to correct input
     *
     * @return
     */
    /*private String readUpdateInput() {
        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.next();
        input.trim();
        if (input.contains("exit")) {
            em.backLastMenu();
        } else {
            while (input == null || input.matches("[^a-zA-Z0-9]*") || input.matches(".*\\d.*")) {
                em.correctInput();
                input = inputScanner.next();
                input = input.trim();
            }
        }
        return input;
    }
    /**
     * reads user input and controls it if input cannot be converted into a
     * double or input is smaller than zero or greater than 200, user is asked
     * to correct input
     *
     * @return
     */
    /*private double readDoubleUpdateInput() {
        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.next();
        input.trim();

        try {
            double updateInput = Double.parseDouble(input);
            while (updateInput < 0 || updateInput > 200) {
                em.correctInput();
                updateInput = Double.parseDouble(inputScanner.next());
            }
        } catch (Exception e) {
            em.correctInput();
            readDoubleUpdateInput();
        }

        double updateInput = Double.parseDouble(input);
        return updateInput;
    }*/
    /**
     * reads user input and controls it if input equals null or is no letter,
     * user is asked to correct input
     *
     * @return
     */
    /*private String readAddInput() {
        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.next();
        input.trim();

        while (input == null || input.matches("[^a-zA-Z0-9]*") || input.matches(".*\\d.*")) {
            em.correctInput();
            input = inputScanner.next();
            input = input.trim();
        }

        return input;
    }*/
}
