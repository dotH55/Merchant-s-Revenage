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
public class Shield extends Item{

    private int damageReduction;
    
    public Shield(String ID, String name, String description, int buyPrice, int sellPrice, int damageReduction) {
        super(ID, name, description, buyPrice, sellPrice);
        this.damageReduction = damageReduction;
    }

    public int getDamageReduction() {
        return damageReduction;
    }
    

    
    
}
