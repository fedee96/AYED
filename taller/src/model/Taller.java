package model;
import java.util.ArrayList;
public final class Taller {
	static ArrayList<Vehiculos> vehiculosTaller;

	public Taller() {
		super();	
		vehiculosTaller = new ArrayList<Vehiculos>();
	}

	public static ArrayList<Vehiculos> getVehiculosTaller() {
		return vehiculosTaller;
	}

	public static void agregarVehiculo(Vehiculos vehiculo){
		vehiculosTaller.add(vehiculo);
	}

	public static String mostrarVehiculos() {
		String vehiculos = null;
		for (int i = 0 ; i < vehiculosTaller.size(); i++) {
			vehiculos =+ i +"."+ vehiculosTaller.get(i).getClass().getSimpleName()+"\n"+vehiculosTaller.get(i).getVehiculo()+"\n\n";
		}
		return vehiculos;
	}

	public static void eliminarVehiculos(int delInd) {
		vehiculosTaller.remove(delInd);
	}
}