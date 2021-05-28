package Report.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.PersistenceException;

/**
 * @author Misael Mendoza G.
 * @email misael.mendoza@potros.itson.edu.mx
 * @Fecha 28/05/2021
 */
public class Conexion {

    private final String baseD = "pvgc";
    private final String user = "root";
    private final String password = "tololonga";
    private final String url = "jdbc:mysql://localhost:3306/pvgc?serverTimezone=UTC"; 
    private Connection con = null;

   public Conexion ()
            throws PersistenceException, SQLException, InstantiationException, IllegalAccessException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            throw new PersistenceException("Error al conectarse a la base de datos",ex);
        }
   }
    
    public Connection getConexion() {
        return con;
    }
    
    public void close() throws PersistenceException{
        try {
            con.close();
        } catch (SQLException ex) {
            throw new PersistenceException("Error al cerrar a la base de datos",ex);
        }
    }
}
