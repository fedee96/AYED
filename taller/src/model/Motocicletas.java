package model;

public class Motocicletas extends Vehiculos {

    private boolean encendido;

    public Motocicletas() {
		super();
	}

	public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public String getVehiculo() {
    	String vehiculo = "VIN: "+getVin()+"Litros: "+getLitros()+"Cilindros: "+getCilindros()+"Encendido electrico: "+isEncendido();
		return vehiculo;
      
    }

}