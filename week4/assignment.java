public class assignment {
    public static void main(String[] args) {

		System.out.println("Bike");

		Vehicle Bike  = new Vehicle();

		Bike.fuelType("Electric Power/Petrol/CNG");

		System.out.println();
        
        System.out.println("Car");

		Vehicle car  = new Vehicle();

        car.setTyres(4);
               
        car.setType("Passenger");
    
                System.out.println("Number Of Tyres - "+car.getTyres());
                System.out.println("Type Of Vehicle - "+car.getType());

                car.fuelType("Electric Power/Petrol/Diesel/CNG");

                System.out.println();
                System.out.println("Trek");

		Vehicle trek  = new Vehicle(10,"carrier");

        System.out.println("No Of Tyres: "+trek.getTyres());
       System.out.println("Vehicle Type: "+trek.getType());
        
       
       trek.fuelType("Petrol/Diesel");
  
	}
}

class Vehicle{

    int  Tyres;
    String Type;

    Vehicle(){
	
        this. Tyres=2;
        this.Type="Passenger";
	
        System.out.println("No of Tyres: "+Tyres);
        System.out.println("Vehicle Type: "+Type);
	
    }
        Vehicle(int Tyres, String Type)
	
        {
		this.Tyres=Tyres;
        this.Type=Type;
	}
    
    public void fuelType(String ftype) {
    
        System.out.println("Fuel Type: "+ftype);

    }
	public int getTyres(){

        return this.Tyres;
    }
	
    public String getType() {
		return this.Type;
	
    }
	
    public void setTyres(int Tyres){
	
        this.Tyres = Tyres;
	
    }
    
    public void setType(String Type){
	
        this.Type=Type;
	
    } 
}
