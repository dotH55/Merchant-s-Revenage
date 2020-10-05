
package merchantsrevenge;

import java.util.logging.Logger;

public class Puzzle {
   private String name;
   private String Descption;

    public Puzzle(String name, String Descption) {
        this.name = name;
        this.Descption = Descption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescption() {
        return Descption;
    }

    public void setDescption(String Descption) {
        this.Descption = Descption;
    }
   
   
    
}
