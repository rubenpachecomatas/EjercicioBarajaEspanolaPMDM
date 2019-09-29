/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciobarajaespanola;

/**
 *
 * @author ODLana
 */
public class Carta {
    
    private int palo;
    private int num;

    public Carta(int palo, int num) {
        this.palo = palo;
        this.num = num;
    }

    @Override
    public String toString() {
        
        String paloS = "";
        String numS = "";
        
        switch (palo) {
            case 0:
                paloS = "Oros";
                break;
            case 1:
                paloS = "Copas";
                break;
            case 2:
                paloS = "Espadas";
                break;
            case 3:
                paloS = "Bastos";
                break;
            
        }
        
        switch (num) { 
            case 1:
                numS = "As";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                numS = "" + num;
                break;
            case 10:
                numS = "Sota";
                break;
            case 11:
                numS = "Caballo";
                break;
            case 12:
                numS = "Rey";
                break;   
        }
        return numS + " de " + paloS;
    }
    
    
    
}
