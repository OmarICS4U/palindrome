/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package palindrome;

import javax.swing.*;
import java.lang.Math;

/**
 *
 * @author omsay9559
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String myInput, backwards = "";
        int numChar;
        myInput = JOptionPane.showInputDialog("Please enter a word to see if it is a pallindrome");
        myInput=myInput.toUpperCase();
        //System.out.println(myInput);
        numChar= myInput.length();
  
      for (int i = numChar - 1; i >=0; i--){
          
          backwards = backwards + myInput.charAt(i);
      //System.out.println(backwards);
      }
        System.out.println(myInput + " backwards is " + backwards);
        if(myInput.equals(backwards)){
            System.out.println("Congrats! "+ myInput + " is a palindrome!");
    }else{
            System.out.println(myInput + " is not a pallindrome");
        }
    }
    
}
