package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado_31 {
    public static void main (String[] args){
    	
    	//Forma de crear el metodo
    	
    	/*Empleado empleado1 = new Empleado("Maria Perez", 85000, 1990, 12, 17);
    	
    	Empleado empleado2 = new Empleado("Juan Ramos", 95000, 1995, 2, 10);
    	
    	Empleado empleado3 = new Empleado("Jose Martinez", 105000, 1996, 10, 27);
    	
    	empleado1.subeSueldo(5);
    	empleado2.subeSueldo(5);
    	empleado3.subeSueldo(5);
    	
    	System.out.println("Nombre: " + empleado1.dameNombre() + " sueldo: " + empleado1.dameSueldo() + 
    			"Fecha de contrato: " + empleado1.dameFechaContrato());
    	
    	System.out.println("Nombre: " + empleado2.dameNombre() + " sueldo: " + empleado2.dameSueldo() + 
    			"Fecha de contrato: " + empleado2.dameFechaContrato());
    	
    	System.out.println("Nombre: " + empleado3.dameNombre() + " sueldo: " + empleado3.dameSueldo() + 
    			"Fecha de contrato: " + empleado3.dameFechaContrato());*/
    	
    	Empleado[] misEmpleado = new Empleado [3];  //Forma de crear el metodo pero conun array
    	
    	misEmpleado[0] = new Empleado ("Maria Perez", 85000, 1990, 12, 17);
    	misEmpleado[1] = new Empleado ("Juan Ramos", 95000, 1995, 2, 10);
    	misEmpleado[2] = new Empleado ("Jose Martinez", 105000, 1996, 10, 27);
    	
    	/*for (int i=0; i<3; i++) {
    		
    		misEmpleado[i].subeSueldo(5);         <---- For tradicional
    		
    	}*/
    	
    	for (Empleado e: misEmpleado) {         // <------ for mejorado
    		e.subeSueldo(5);
    	}
    	
    	/*for (int i=0; i<3; i++) {               <---- For tradicional
    		
    		System.out.println("Nombre: " + misEmpleado[i].dameNombre() + " sueldo: " + misEmpleado[i].dameSueldo() + 
        			"Fecha de contrato: " + misEmpleado[i].dameFechaContrato());	
    	}*/
    	
    	for (Empleado e: misEmpleado) {                 // <------ for mejorado
    		System.out.println("Nombre: " + e.dameNombre() + " sueldo: " + e.dameSueldo() + 
        			"Fecha de contrato: " + e.dameFechaContrato());
    		
    	}
    	
    }
}



class Empleado {
	
	 	private String nombre;
	    private double sueldo;
	    private Date altaContrato;
	    
    public Empleado (String nom, double sue, int agno,int mes, int dia){
    	
    	nombre =nom;
    	sueldo =sue;
    	GregorianCalendar calendario=new GregorianCalendar(agno, mes, dia);
    	altaContrato = calendario.getTime();
    }
    
    public String dameNombre() {
    	return nombre;
    }
    
   
    public double dameSueldo() {
    	return sueldo;
    }
    
    public Date dameFechaContrato() {
    	return altaContrato;
    }
    
    public void subeSueldo (double porcentaje) {
    	double aumento=sueldo*porcentaje/100;
    	sueldo+=aumento;
    }
    
}


    

 
