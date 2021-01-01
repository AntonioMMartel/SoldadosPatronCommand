/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soldadospatroncommand;


import PatronCommand.*;

/**
 * @author Antonio Miguel Martel
 */
public class Main {


    public static void main(String[] args) {
        //Preparamos acciones uqe vamos a usar
        Command moveLeftCommand = new MoveLeftCommand();
        Command moveRightCommand = new MoveRightCommand();
        Command moveUpCommand = new MoveUpCommand();
        Command moveDownCommand = new MoveDownCommand();
        
        
        //Activamos controlador
        KeyboardHandler keyboardHandler = new KeyboardHandler(
                moveUpCommand,       //W --> move up
                moveLeftCommand,     //A --> move left
                moveDownCommand,     //S --> move down
                moveRightCommand);   //D --> move right
        
        //Nos metemos en el bucle del juego.
        while(true) {
            keyboardHandler.getInput();
            
        }
        
    }

}
