/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;
import java.util.Random;
/**
 *
 * @author justin
 */
public class Model {
    
    // This is the area where I declare my global variables, remember?
    // I guess I'll definitely need one for the number I'm thinking
    // of...
    private int theNumber;
    
    // This will be my status message...
    private String status;

    // What do I want my model to be able to do??
    
    
    void newGame() {
        // This is where I will think up my random number...
        Random r = new Random();
        
        // I want a number from 1 to 100, but r.nextInt(100) gives
        // me a number from 0 to 99. So I just add 1 to whatever
        // it gives me and I'm good.
        theNumber = r.nextInt(100) + 1;
        
        // Now I guess I'll set my status message so the GUI can
        // display it. 
        status = "Welcome! Please enter your first guess!";
    }
    
    void processUserGuess(int guess) {
        // This is where I will see what the user's guess is 
        // and decide on what message to give them.
        // Notice that this method accepts an int.
        
        if (guess > theNumber) {
            status = "Your guess was too high!";
        }
        else if (guess < theNumber) {
            status = "Your guess was too low!";            
        }
        else {
            status = "You guessed correctly!";
        }
        
        
    }
    
    String getStatus() {
        // This method will be called by the ViewController.
        // It will return a string with a current status
        // message in it, like "That guess is too high!"
        // or something like that.
        return status;
    }
    
    
    
}
