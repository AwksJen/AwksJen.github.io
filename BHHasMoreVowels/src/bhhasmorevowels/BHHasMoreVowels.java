/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bhhasmorevowels;

/**
 *
 * @author jennasteppe
 */
public class BHHasMoreVowels {

    /**
     * @param args the command line arguments
     */
    // in an array, determine index value,
    //to then determine what group it goes in //why is the "to" highlighted?
    //while counting objects and adding to the sum
    //in each group
    //at end compare all individuals sums
    //determine highest sum
    int i;
    String string;
    String lowerString;
    char[] wordArray;
    char ch = wordArray[i];
    int nonv;
    int yesv;

    public boolean hasMoreVowels() {
        lowerString = string.toLowerCase();
        wordArray = lowerString.toCharArray();
        //have to use a loop to go through array outside this
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == '0' || ch == 'u') {
            nonv += 1;
        } else {
            yesv += 1;
        }

        if (nonv >= yesv) {

        }
        return false;
         
    }
}

