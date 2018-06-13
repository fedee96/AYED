package model;
public class Automoviles extends Vehiculos {

	private boolean airbags;

	
	public Automoviles(String vin, int cantCil, int capLit, boolean airbags){
		super();
		setVin(vin);
		setCilindros(cantCil);
		setLitros(capLit);
		this.airbags= airbags;
	}

    public boolean isAirbags() {
        return airbags;
    }

    public void setAirbags(boolean airbags) {
        this.airbags = airbags;
    }

	public boolean getAirbags() {
    	return airbags;
    }
	public String tieneAirbag() {
		if (airbags== true)
			return "si";
		return "no";
	}
	public String getVehiculo() {
		String vehiculo = "VIN: "+getVin()+"Litros: "+getLitros()+"Cilindros: "+getCilindros()+"Airbags: "+getAirbags();;
		return vehiculo;
		
	}

}