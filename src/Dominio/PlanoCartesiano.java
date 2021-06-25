
package Dominio;

public class PlanoCartesiano {
    private int x;
    private int y;

    public PlanoCartesiano(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getx() {
        return x;
    }

    public void setx(int x) {
        this.x = x;
    }

    public int gety() {
        return y;
    }

    public void sety(int y) {
        this.y = y;
    }

    @Override
    public String toString(){
        return "X = " + this.x + "   " + "Y = " + this.y;
    }

}
