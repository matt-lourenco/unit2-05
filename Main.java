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
		
		Vehicle vehicle1 = new Vehicle("AAAA111", Vehicle.Colours.GREY, 4, 50);
		vehicle1.getStatus();
		vehicle1.accelerate(5);
		
		Vehicle vehicle2 = new Vehicle();
		vehicle1.getStatus();
	}
}