package p2labexamen2_rigobertobarahona;
// Al menos el siguiente periodo de progra 2 lo paso por tener un laptop que funciona
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
