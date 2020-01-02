/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bhfizzbuzz;

/**
 *
 * @author jennasteppe
 */
public class BHfizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//TODO logic goes here -> remember this STEPPE

        int i;
        int sum;

        for (i = 1; i < 21; i++) {

            if (i % 3 == 0) {
                System.out.println("fizz");
            }
            if (i % 5 == 0) {
                System.out.println("buzz");
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");

            }
        
            if (i % 3 != 0 && i % 5 != 0 && (i % 3 != 0 && i % 5 != 0)) {

                System.out.println(i);
            }
        }
    }
}


