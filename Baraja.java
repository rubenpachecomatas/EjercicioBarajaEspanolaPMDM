/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciobarajaespanola;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ODLana
 */
public class Baraja {
    
    private ArrayList<Carta> baraja;
    private ArrayList<Carta> resto;

    public Baraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
        this.resto = new ArrayList<Carta>();
    }

    public ArrayList<Carta> getBaraja() {
        return baraja;
    }
    
    public void mostrarBaraja(ArrayList<Carta> baraja) {
        System.out.println(baraja);
    }
    
    public void siguienteCarta (ArrayList<Carta> baraja) {
        if (baraja.size() > 0) {
        System.out.println(baraja.get(baraja.size()-1));
        resto.add(baraja.get(baraja.size()-1));
        baraja.remove(baraja.get(baraja.size()-1));
        } else {
            System.out.println("No hay más cartas en la baraja.");
        }
    }
    
    public void barajar(ArrayList<Carta> baraja) {
        Collections.shuffle(baraja);
    }
    
    public void cartasDisponibles(ArrayList<Carta> baraja) {
        String res = "El número de cartas aún disponibles es "
                + "de " + baraja.size();
        System.out.println(res);
    }
    
    public void cartasMonton() {
        if (resto.size() > 0) {
            System.out.println(resto);
        } else {
            System.out.println("No hay salido ninguna carta todavía.");
        }
    }
    
    public void darCartas(ArrayList<Carta> baraja) {
        Scanner s = new Scanner (System.in);
        System.out.println("Indique el número de cartas que desea: ");
        int num = Integer.parseInt(s.nextLine());
        String cartasSacadas = "";
        
        if (baraja.size() >= num) {
            for (int i = 0; i < num; i++) {
                cartasSacadas += baraja.get(baraja.size()-1) + " | ";
                resto.add(baraja.get(baraja.size()-1));
                baraja.remove(baraja.get(baraja.size()-1));
            }
            
            System.out.println(cartasSacadas);
        } else {
            System.out.println("No hay tantas cartas en la baraja");
        }
    }

    @Override
    public String toString() {
        return " Baraja:" + baraja;
    }
    
    
    
}
