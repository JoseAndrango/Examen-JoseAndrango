
package Test;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Prueba ob1=null;
        int x=0,y=0, op=0, valor=0,x1=0,y1=0;
        Scanner datos = new Scanner(System.in);
        boolean Pocision1 ,Pocision2;
        do{
            Pocision1 = false;
            try{
                System.out.println("Ingrese las coodenadas iniciales X ^ Y");
                ob1 = new Prueba(0,0);
            }catch (NumberFormatException e){
                System.out.println("la opcion no existe");
                Pocision2 = true;
            }
            if(op!=5){
                try{
                    System.out.println("Ingrese el valor ");
                } catch(NumberFormatException e){
                    System.out.println("dostos ingresados no validos");
                }
            }
        }
    }



    private Prueba(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
