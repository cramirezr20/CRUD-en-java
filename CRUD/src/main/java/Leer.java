import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Leer {
	public void readEstudiantes() {
        String sql = "SELECT * FROM estudiantes";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                Date fechaNacimiento = rs.getDate("fecha_nacimiento");
                String genero = rs.getString("genero");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");
                String correo = rs.getString("correo_electronico");
                String grado = rs.getString("grado");
                Date fechaInscripcion = rs.getDate("fecha_inscripcion");

                System.out.println(id + ", " + nombre + ", " + apellido + ", " + fechaNacimiento + ", " + genero + ", " + direccion + ", " + telefono + ", " + correo + ", " + grado + ", " + fechaInscripcion);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
