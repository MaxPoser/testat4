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
public class HelperManager {

    ArrayList<Helper> myHelpers;

    /**
     * Creates new ArrayList Helper and includes demo content
     */
    public HelperManager() {

        myHelpers = new ArrayList<Helper>();

        //Demo Data
        Helper helper01 = new Helper("Max", "Mustermann", "Male", "GER");
        Helper helper02 = new Helper("Hans", "Werner", "Female", "AUS");
        Helper helper03 = new Helper("Maria", "Mülller", "Divers", "SWE");
        myHelpers.add(helper01);
        myHelpers.add(helper02);
        myHelpers.add(helper03);
    }

    /**
     * Controls if Id in Array List equals to Id to prevent data problems. If
     * condition is met, removes Helper entry from ArrayList.
     */
    public void deleteHelper(int id) {
        for (int i = 0; i < myHelpers.size(); i++) {
            if (myHelpers.get(i).getId() == id) {
                myHelpers.remove(i);
            }
        }
    }

    /**
     * Controls if Id in Array List equals to Id to prevent data problems.
     * Replace helper element at index i to new helper element.
     */
    public void updateHelper(int id, Helper helper) {
        for (int i = 0; i < myHelpers.size(); i++) {
            if (myHelpers.get(i).getId() == id) {
                myHelpers.set(i, helper);
            }
        }
    }

    /**
     * Adds created helper to ArrayList myHelpers
     */
    public void addHelper(Helper helper) {
        myHelpers.add(helper);
    }

    /**
     * Returns all Helpers from ArrayList
     *
     * @return
     */
    public ArrayList<Helper> getAllHelpers() {
        return this.myHelpers;
    }

    /**
     * reads user input and controls it if input equals null or is no letter,
     * user is asked to correct input
     *
     * @return
     */
    /*public String readUpdateInput() {
        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.next();
        input.trim();
        if (input.contains("exit")) {
            em.backLastMenu();
            myHarvestManager.handleHelpers();
        } else {
            while (input == null || input.matches("[^a-zA-Z0-9]*") || input.matches(".*\\d.*")) {
                em.correctInput();
                input = inputScanner.next();
                input = input.trim();
            }
        }
        return input;
        return "";
    }*/
    /**
     * reads user input and controls it if input equals null or is no letter,
     * user is asked to correct input
     *
     * @return
     */
    /*public String readAddInput() {
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
    /**
     * reads user input and controls it if input does not equal
     * [Mm]ale,[Ff]emale, [Dd]iverse, user is asked to correct input
     *
     * @return
     */
    /*public String readGenderInput() {
        System.out.println("Please choose a gender: male, female, diverse: ");
        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.next();
        boolean val = false;
        while (val == false) {
            Pattern pattern = Pattern.compile("[mM]ale|[fF]emale|[dD]iverse");
            Matcher match = pattern.matcher(input);
            val = match.find();
            if (val == true) {
                break;
            }
            em.correctInput();
            input = inputScanner.next();
            input.trim();
        }

        return input;
    }
     */
}
