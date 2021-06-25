
package Test;

import Dominio.PlanoCartesiano;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Prueba {
    static Scanner datos = new Scanner(System.in);
    public static void main(String[] args) {
        int n=0;
        System.out.println("Ingrese las cordenadas: ");
        while (n<1){
            n= datos.nextInt();
        }
        PlanoCartesiano [] cordenadas = new PlanoCartesiano[n];
        movimientos(cordenadas);
    }
    public static void movimientos(PlanoCartesiano cord[]) {
        int x=0,y=0;
        int nmov=0;
        double dist;
        cord[0]= new PlanoCartesiano(x,y);
        System.out.println("Coordenan inicial");
        System.out.println(cord[0]);
        for (int i=0;i<cord.length;i++){
            datos.nextLine();
            System.out.println("");
            System.out.println("Ingrese la distacnia del movimiento "+(i+1));
            dist=datos.nextInt();
            int vaEntero=0;
            vaEntero = (int) Math.floor(Math.random()*(4 - 1 + 1) + 1);
            switch (vaEntero){
                case 1:
                    x = (x-nmov);
                    System.out.println("movimiento Izquierda");
                    break; 
                case 2:
                    x =  (x+nmov);
                    System.out.println("movimiento Derecha");
                    break;
                case 3:
                    y =  (y-nmov);
                    System.out.println("movimiento Abajo");
                    break;
                case 4:
                    y =  (y + nmov);
                    System.out.println("movimiento Arriba");
                    break;
                default:
                    break;    
            }
            System.out.println("Estas en la coordenada:");
            cord[i]=new PlanoCartesiano(x,y);
            System.out.println(cord[i]);
        }
        dist = sqrt(pow((x), 2) + pow((y), 2));
        System.out.printf("La distancia recorrida es de: %.2f\n"+dist);
    }
}

    