/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merchantsrevenge;

/**
 *
 * @author Lleaf
 */
public class Artifact extends Item{
    
    private String usedFor;
    
    public Artifact(String ID, String name, String description, int buyPrice, int sellPrice, String usedFor) {
        super(ID, name, description, buyPrice, sellPrice);
        this.usedFor = usedFor;
    }

    public String getUsedFor() {
        return usedFor;
    }
    
    
}
