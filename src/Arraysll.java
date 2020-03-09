import javax.swing.*;

public class Arraysll {


        public static void main (String[] args){
            String[] paises=new String[8];

            for (int i=0; i<8; i++){

                paises[i]= JOptionPane.showInputDialog("Introduce país " + (i+1));
            }

            for (String elemeto:paises){

                System.out.println("País: " + elemeto);
            }
        }



}
