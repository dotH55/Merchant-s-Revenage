
package merchantsrevenge;
import java.util.*;

public class Room {
    
     private String ID;
     private String desciption;
     private String floor;
     private ArrayList<Item> itemList;
     private ArrayList<Door> doorList;
     private ArrayList<Monster> monsterList;
     
     public Room(String ID, String description ,String floor){
         this.ID = ID;
         this.desciption = desciption;
         this.floor = floor;
         itemList = new ArrayList<>();
         doorList = new ArrayList<>();
         monsterList = new ArrayList<>();
         
         //Create all rooms
         Room R01 = new Room("R01", "This room is starting point in of your "
                 + "adventure. It is 4x4 dark damp holding-cell with no windows. "
                 + "The door is made of solid oak and has been broken off its hinge",
         "Dungeon");
         R01.addDoor(new Door("R02", "South"));
         R01.addMonster(M1);
     }

     //Getters
    public String getID() {return ID;}

    public String getFloor() {return floor;}

    public ArrayList<Item> getItemList() {return itemList;}

    public ArrayList<Door> getDoorList() {return doorList;}
    
    public ArrayList<Monster> getMonsterList() {return monsterList;}


    //Setters
    public void setID(String ID) {this.ID = ID;}

    public void setFloor(String floor) {this.floor = floor;}

    public void setItemList(ArrayList<Item> itemList) {this.itemList = itemList;}

    public void setDoorList(ArrayList<Door> doorList) {this.doorList = doorList;}
    
    
    //Methods
    public void addItem(Item i){
        itemList.add(i);
    }
    public void removeItem(Item i){
        itemList.remove(i);
    }
    public void addDoor(Door d){
        doorList.add(d);
    }
    public void addMonster(Monster m){
        monsterList.add(m);
    }
    public void removeMonster(Monster m){
        itemList.remove(m);
    }
    public String search(){
        return "\nItems: " + itemList.toString();
    }
    
    
    
     
}
