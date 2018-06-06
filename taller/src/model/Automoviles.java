package model;

public class Automoviles extends Vehiculos {

    public static Object addAutomoviles;
	private boolean airbags;

    public boolean isAirbags() {
        return airbags;
    }

    public void setAirbags(boolean airbags) {
        this.airbags = airbags;
    }

    public Automoviles(boolean airbags) {
        super();
        this.airbags = airbags;
    }
    
    public Automoviles() {
		getVehiculo();
	}

	public boolean getAirbags() {
    	return airbags;
    }

	public String getVehiculo() {
		String vehiculo = "VIN: "+getVin()+"Litros: "+getLitros()+"Cilindros: "+getCilindros()+"Airbags: "+getAirbags();;
		return vehiculo;
		
	}

}