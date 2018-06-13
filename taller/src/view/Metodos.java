package view;


import java.util.Scanner;

import model.Automoviles;
import model.Motocicletas;
import model.Taller;

public class Metodos {
	
	Scanner sc = new Scanner(System.in);
	 
	public void agregarVehiculos(){
		
		int vehi;
		
		System.out.println("Que tipo de vehiculo desea ingresar?");
		System.out.println("1.Automovil");
		System.out.println("2.Motocicleta");
		
		vehi = sc.nextInt();
		
		switch (vehi) {
		case 1:
			Automoviles auto = new Automoviles(null, vehi, vehi, false);
			
				System.out.println("Ingrese VIN.");
				auto.setVin(sc.nextLine());
				System.out.println("Ingrese Cantidad de Cilindros.");
				auto.setCilindros(sc.nextInt());
				System.out.println("Ingrese Capacidad litros.");
				auto.setLitros(sc.nextInt());
				System.out.println("Tiene Airbag?");
				auto.setAirbags(sc.hasNext());
				Taller.agregarVehiculo(auto);
			break;
		case 2:
			System.out.println("Ingrese VIN.");
			String vin = sc.nextLine();
			System.out.println("Ingrese Cantidad de Cilindros.");
			int cantCil = sc.nextInt();
			System.out.println("Ingrese Capacidad litros.");
			int capLit = sc.nextInt();
			System.out.println("Tiene encendido electrico?");
			boolean eIgn= sc.hasNext();
			Motocicletas moto = null;				
			
				moto = new Motocicletas(vin,cantCil,capLit,eIgn);
				Taller.agregarVehiculo(moto);

			break;
		case 0:
			System.out.println("Saliendo...");
			break;
		default:
			System.out.println("Opcion incorrecta");
			break;
		}
	}
	
	public void mostrarVehiculos() {
		System.out.println("Listado de vehiculos");
		System.out.println(Taller.getVehiculosTaller());
	}
	
	public void eliminarVehiculo() {
		System.out.println("Listado de vehiculos");
		System.out.println(Taller.getVehiculosTaller());
		System.out.println("Ingrese indice del vehiculo a eliminar.");
		
			Taller.eliminarVehiculos(sc.nextInt());
		
	}

}
