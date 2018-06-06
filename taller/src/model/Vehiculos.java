package model;

public abstract class Vehiculos {
    private String vin;
    private float litros;
	private int cilindros;

    public Vehiculos() {
        super();
    }

    public String getVin() {
        return vin;
    }
    public void setVin(String vin) {
        this.vin = vin;
    }

    public float getLitros() {
        return litros;
    }
    public void setLitros(float litros) {
        this.litros = litros;
    }
    public int getCilindros() {
        return cilindros;
    }
    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    
	public static void add(Vehiculos vehiculos) {
		System.out.println();
		
	}

	public static void addMotocicletas() {
		
		
	}


}