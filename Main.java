/****************************************************************************
 *
 * Created by: Matthew lourenco
 * Created on: Mar 2018
 * This program tests the vehicle class
 *
 ****************************************************************************/

public class Main {
	
	public static void main(String[] args) throws Exception {
		//Instantiate two vehicles and test them
		
		System.out.println("Vehicle 1");
		Vehicle vehicle1 = new Vehicle("AAAA111", Vehicle.Colours.GREY);
		System.out.println(vehicle1.getStatus());
		vehicle1.accelerate(5);
		System.out.println(vehicle1.getStatus());
		vehicle1.accelerate(20);
		System.out.println(vehicle1.getStatus());
		vehicle1.brake(30);
		System.out.println(vehicle1.getStatus());
		
		System.out.println("\nVehicle 2");
		Vehicle vehicle2 = new Vehicle();
		System.out.println(vehicle2.getStatus());
		vehicle2.setLicensePlate("JAVAWNS");
		System.out.println(vehicle2.getStatus());
		vehicle2.setColour(Vehicle.Colours.RED);
		System.out.println(vehicle2.getStatus());
	}
}