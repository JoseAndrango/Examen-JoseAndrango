
package Dominio;

public class PlanoCartesiano {
    private int x;
    private int y;

    public PlanoCartesiano(int x, int y) {
        this.x = x;
        this.y = y;
    }
public void setArriba(){
    int valor = 0;
    y+=valor;
}   
public void setAbajo(){
    int valor = 0;
    y-=valor;
}
public void setDerecha(){
    int valor = 0;
    x+=valor;
}
public void setIzquierda(){
    int valor = 0;
    x-=valor;
}
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
