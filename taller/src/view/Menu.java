package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.Automoviles;
import model.Motocicletas;
import model.Vehiculos;

public class Menu {


	public static void menu() {
	Scanner sc = new Scanner(System.in);
    int opc;
    int resp;
    opc = sc.nextInt();
    
    ArrayList<Vehiculos> vehiculo = new ArrayList<Vehiculos>();

    System.out.println("MENU");
    System.out.println("1.Ingresar un auto");
    System.out.println("2.Ingresar una moto");
    System.out.println("0.Salir");
    
    switch(opc) {
    
    case 1 :
    	System.out.println("1.Automovil");
    	System.out.println("2.Motocicleta");
    	resp = sc.nextInt();
    	if(resp == 1) {
    	
    		Vehiculos.add(new Automoviles());
    	}else {
    		Vehiculos.addMotocicletas();
    	}
    
    }	
}
}