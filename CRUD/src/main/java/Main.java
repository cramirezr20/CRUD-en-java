
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Crear crearNuevo = new Crear();
	        crearNuevo.createEstudiante("Cristian", "Ramírez", "1993-07-13", "M", "San Jose Pinula", "55554444", "cramirezr20@miumg.com.gt", "4", "2024-08-03");

	        // Leer estudiantes
	        Leer leer = new Leer();
	        leer.readEstudiantes();

	        // Actualizar un estudiante
	        Actualizar actualizar = new Actualizar();
	        actualizar.updateEstudiante(1, "Juan", "Pérez", "2000-01-01", "M", "123 Calle Falsa", "123456789", "juan.perez@example.com", "11", "2023-08-01");

	        // Eliminar un estudiante
	        Eliminar eliminar = new Eliminar();
	        eliminar.deleteEstudiante(1);
	    }
	}


