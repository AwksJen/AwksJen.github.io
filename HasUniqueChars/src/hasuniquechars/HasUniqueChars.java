/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hasuniquechars;


/**
 * https://github.com/linwdav/Java-Exercises/blob/master/src/arraysAndStrings/HasUniqueChars.java
 * @author jennasteppe
 */
public class HasUniqueChars {
   

    public boolean hasUniqueChars(String string) {
        for (int i = 0; i < string.length() - 1; i++) {
      for (int j = i + 1; j < string.length(); j++) {
        if (string.charAt(i) == string.charAt(j)) {
          return false;
        }
      }
    }
    return true;
}
}


