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
public class Potion extends Item{

    private int health;
    private int strength;
    private int agility;
    private int magic;
    private int stamina;
    private int luck;
    
    public Potion(String ID, String name, String description, int buyPrice,int sellPrice,
    int health, int strength, int agility, int magic, int stamina, int luck) {
        super(ID, name, description, buyPrice, sellPrice);
        this.health = health;
        this.strength = strength;
        this.agility = agility;
        this.magic = magic;
        this.stamina = stamina;
        this.luck = luck;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getMagic() {
        return magic;
    }

    public int getStamina() {
        return stamina;
    }

    public int getLuck() {
        return luck;
    }
    
    


    

    
}
