package estudiante;


public class Principal {
	
	public static void main (String [] args) {
	    
	    System.out.println("**Estudiantes**\n");
	    
	    Estudiante mary = new Estudiante("Mary Jones", 14, 0, 46);
	    Estudiante john = new Estudiante("John Stiner", 60, 0, 173);
	    Estudiante ari =  new Estudiante("Ari Samala", 31, 0, 69);
	    
	    
        System.out.println("Nombre: " + mary.nombre);
        System.out.println("Créditos: " + mary.creditos);
        System.out.println("Puntos de calidad: " + mary.puntosCalidad);
        System.out.println("Promedio ponderado: " + mary.obtenerGPA());
        
        System.out.println("\nNombre: " + john.nombre);
        System.out.println("Créditos: " + john.creditos);
        System.out.println("Puntos de calidad: " + john.puntosCalidad);
        System.out.println("Promedio ponderado: " + john.obtenerGPA());
        
        System.out.println("\nNombre: " + ari.nombre);
        System.out.println("Créditos: " + ari.creditos);
        System.out.println("Puntos de calidad: " + ari.puntosCalidad);
        System.out.println("Promedio ponderado: " + ari.obtenerGPA());
        ari.actualizarCreditos(13, 52);
        System.out.println("Créditos actualizados: " + ari.creditos);
        System.out.println("Puntos de calidad actualizados: " + ari.puntosCalidad);
        System.out.println("Promedio ponderado actualizado: " + ari.obtenerGPA());
    }
	   
	}


