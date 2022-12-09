package p2labexamen2_rigobertobarahona;

import java.util.ArrayList;

public class Comidos extends Banana {
    protected char caracter;

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    public Comidos(char caracter) {
        this.caracter = caracter;
    }
    @Override
    public String toString() {
        return "X";
    }
}
