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
public abstract class Item {
    
    private String ID;
    private String name;
    private String description;
    private int buyPrice;
     private int sellPrice;
    
    public Item(String ID, String name, String description, int buyPrice, int sellPrice){
        this.ID = ID;
        this.description = description;
        this.name = name;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getID() {
        return ID;
    }

    public String getDescription() {
        return description;
    }
    

    public String getName() {
        return name;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }
    
    
        
    
}
