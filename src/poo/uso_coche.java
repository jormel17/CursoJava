package poo;

import javax.swing.JOptionPane;

public class uso_coche {

    public static void main (String[] args){

            coche micoche=new coche();
        micoche.establece_color(JOptionPane.showInputDialog("Introduce color"));
        
        System.out.println(micoche.Dime_datos_generales());
        System.out.println(micoche.dime_color());
        
        micoche.configura_asientos(JOptionPane.showInputDialog("Tienes asientos de cuero?"));
        System.out.println(micoche.dime_asientos());

        micoche.cofigura_climatizador(JOptionPane.showInputDialog("Tiene climatizador?"));
        System.out.println(micoche.dime_climatizador());

        System.out.println(micoche.dime_peso_coche());
        
        System.out.println("El precio final del coche es: " + micoche.precio_coche());
       

    }
}
