import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Crear {
	public void createEstudiante(String nombre, String apellido, String fechaNacimiento, String genero, String direccion, String telefono, String correo, String grado, String fechaInscripcion) {
        String sql = "INSERT INTO estudiantes (nombre, apellido, fecha_nacimiento, genero, direccion, telefono, correo_electronico, grado, fecha_inscripcion) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, nombre);
            pstmt.setString(2, apellido);
            pstmt.setDate(3, java.sql.Date.valueOf(fechaNacimiento));
            pstmt.setString(4, genero);
            pstmt.setString(5, direccion);
            pstmt.setString(6, telefono);
            pstmt.setString(7, correo);
            pstmt.setString(8, grado);
            pstmt.setDate(9, java.sql.Date.valueOf(fechaInscripcion));
            
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
