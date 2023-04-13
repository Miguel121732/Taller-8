package animales;

public class Principal {
	
	public static void main (String [] args) {
		
		System.out.println("**Punto Tres**\n");
		
		Animal animal1 = new Animal();
	    Animal animal2 = new Animal(50, 2, 4);

	    
	    System.out.println("El animal 1 tiene una velocidad de " + animal1.getSpeed() + " millas por hora.");
	    System.out.println("El animal 2 tiene una velocidad de " + animal2.getSpeed() + " millas por hora.");
	    
	}
	   
}


