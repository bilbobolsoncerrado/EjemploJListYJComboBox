

public class Hoteles {

	String nombre;
	String ubicacion;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public Hoteles(String nombre, String ubicacion) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	public Hoteles() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Hoteles [nombre=" + nombre + ", ubicacion=" + ubicacion + "]";
	}

	
	
}
