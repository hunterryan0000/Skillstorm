class Vehicle {// class body
	//Primitive
	int speed = 2000000; // declared variable
	byte wheels = 4;
	short weight = 2000;
	char fuel = 'D';
	boolean running = false;
	long serial = 123456789123456789L;
	float fuelRemaining = 100.1234567890123f;

	String make = "Toyota";

	//Can use own class as data type
	Vehicle toy;


	void accelerate() {//method body
		int count = 0;
	} 
	Vehicle(){
		speed = 0;
	}//Constructor
}