package p2labexamen2_rigobertobarahona;

import java.util.ArrayList;

public class Characters {
    ArrayList<Banana> banana;

    public Characters() {
    }
   
    public Characters(ArrayList<Banana> banana) {
        this.banana = banana;
    }

    public ArrayList<Banana> getBanana() {
        return banana;
    }

    public void setBanana(ArrayList<Banana> banana) {
        this.banana = banana;
    }

    @Override
    public String toString() {
        return banana;
    }
    
}
