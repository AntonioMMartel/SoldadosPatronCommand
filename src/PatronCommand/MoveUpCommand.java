/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PatronCommand;

/**
 * @author Antonio Miguel Martel
 */
public class MoveUpCommand implements Command {
    
    @Override
    public void execute(){
        System.out.println("El soldado se mueve hacia arriba.");
    }
    
}
