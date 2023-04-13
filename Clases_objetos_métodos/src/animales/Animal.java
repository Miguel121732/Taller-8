package animales;


public class Animal {
	
	
	int weight, height;
	double speed;
	public Animal() {
	weight = 50;
	height = 4;
	speed = 2; //miles per hour
	}
	public Animal(int w, int h, int s ) {
	weight = w;
	h = height;
	speed = s;
	}
	public double getTime(double miles) { 
	return miles/speed;
	}
	public int getWeight() {
	return weight;
	}
	public int getHeight() {
	return height;
	}
	public double getSpeed() {
	return speed;
	}

	
	
}
