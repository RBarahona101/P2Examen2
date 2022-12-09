package p2labexamen2_rigobertobarahona;

public class Banana {
    protected char caracter;

    public Banana() {
    }

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    public Banana(char caracter) {
         this.caracter = caracter;
    }

    @Override
    public String toString() {
        return "@";
    }
    
}
