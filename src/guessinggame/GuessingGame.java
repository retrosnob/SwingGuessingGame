/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

/**
 *
 * @author justin
 */
public class GuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // This is where my code starts...
        
        Model model = new Model();
        ViewController viewController = new ViewController(model);
        viewController.setVisible(true);
        
    }
    
}
