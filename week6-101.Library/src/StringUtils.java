/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pernille
 */
public class StringUtils {

    public StringUtils() {
        
    }
    
    public static boolean included(String word, String searched) {
        if (word.isEmpty() || searched.isEmpty()) {
            return false;
        } else if (word.toUpperCase().contains(searched.trim().toUpperCase())) {
            return true;
        }
        return false;
    }
    
}
