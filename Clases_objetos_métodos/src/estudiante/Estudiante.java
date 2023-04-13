package estudiante;

public class Estudiante {
	
	public String nombre;
    public int creditos;
    public double gpa;
    public double puntosCalidad;

    public Estudiante(String nombre, int creditos, double gpa, double puntosCalidad) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.gpa = gpa;
        this.puntosCalidad = puntosCalidad;
        
    }

    public double obtenerGPA() {
        return this.puntosCalidad / this.creditos;
    }

    public void actualizarCreditos(int Creditos, double PuntosCalidad) {
        
    	 this.creditos += creditos;
         this.puntosCalidad += puntosCalidad;
         gpa = this.obtenerGPA();
    }
    
    
    
    

}
