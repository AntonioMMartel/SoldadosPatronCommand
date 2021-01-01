/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soldadospatroncommand;

import PatronCommand.Command;

/**
 * @author Antonio Miguel Martel
 */
public class KeyboardHandler {
    private final Button buttonW = new ButtonHandler("W");
    private final Button buttonA = new ButtonHandler("A");
    private final Button buttonS = new ButtonHandler("S");
    private final Button buttonD = new ButtonHandler("D");
    Command buttonWCommand, buttonACommand, buttonSCommand, buttonDCommand;
    
    //Le entran los Commandos que se asocian a cada boton
    public KeyboardHandler(Command buttonWCommand, Command buttonACommand, Command buttonSCommand, Command buttonDCommand) {
        this.buttonWCommand = buttonWCommand;
        this.buttonACommand = buttonACommand;
        this.buttonSCommand = buttonSCommand;
        this.buttonDCommand = buttonDCommand;
    }
    
    
    //Se separo ya la logica de los botones
    void getInput() {
        if (this.buttonW.isPressed()) this.buttonWCommand.execute();
        else if (this.buttonA.isPressed()) this.buttonWCommand.execute();
        else if (this.buttonS.isPressed()) this.buttonWCommand.execute();
        else if (this.buttonD.isPressed()) this.buttonWCommand.execute();
    }
    
}
