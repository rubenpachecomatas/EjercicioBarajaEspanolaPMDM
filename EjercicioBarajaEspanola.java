/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciobarajaespanola;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ODLana
 */
public class EjercicioBarajaEspanola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner (System.in);
        
        // Crea un ArrayList donde introduciremos la baraja
        // a base de objetos Carta.
        
        ArrayList<Carta> baraja = new ArrayList<Carta>();
        int i = 0;
        
        // Introduce la baraja en orden.
      
        for (int contP = 0; contP <= 3; contP++) {
            for (int contN = 1; contN <= 12; contN++) {
                baraja.add(new Carta (contP, contN));
                i++;
            }
        }
        
        // Creamos el objeto baraja con las 48 cartas.
        
        Baraja barajaB = new Baraja (baraja);
        
        int option = 0;
        
        do {
            System.out.println("-_-_-_-_-_-_-_-_-_-_-"
                    + "\nBaraja Española\n"
                    + "¿Qúe desea hacer ahora?"
                    + "\n1. Mostrar Baraja."
                    + "\n2. Barajar."
                    + "\n3. Mostrar la siguiente carta."
                    + "\n4. Dar cartas."
                    + "\n5. Cartas Disponibles."
                    + "\n6. Cartas Montón."
                    + "\n7. Salir."
                    + "\n-_-_-_-_-_-_-_-_-_-_-");
            option = Integer.parseInt(s.nextLine());
            switch (option) {
                case 1:
                    barajaB.mostrarBaraja(baraja);
                    break;
                case 2:
                    barajaB.barajar(baraja);
                    break;
                case 3:
                    barajaB.siguienteCarta(baraja);
                    break;
                case 4:
                    barajaB.darCartas(baraja);
                    break;
                case 5:
                    barajaB.cartasDisponibles(baraja);
                    break;
                case 6:
                    barajaB.cartasMonton();
                    break;
                case 7:
                    break;
            }
        } while (option != 7);
        
    }
    
}
