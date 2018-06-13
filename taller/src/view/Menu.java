package view;

import java.util.Scanner;

public class Menu {


	public static void menuOpciones() {
		
	Metodos metodos = new Metodos(); 
	Scanner sc = new Scanner(System.in);
    int opc = 1;
    opc = sc.nextInt();

    do {
    System.out.println("MENU");
    System.out.println("1.Ingresar un vehiculo");
    System.out.println("2.Mostrar vehiculos");
    System.out.println("3.Eliminar un vehiculo");
    System.out.println("0.Salir");
    
    switch(opc) {
    
    case 1 :
    	metodos.agregarVehiculos();
    	break;
    case 2:
    	metodos.mostrarVehiculos();
    	break;
    case 3:
    	metodos.eliminarVehiculo();
    	break;
    case 0:
    	System.out.println("Saliendo...");
    	break;
    default:
    	System.out.println("Opcion incorrecta");
    }	
    sc.close();
}while(opc!=0);
}
}