
package coneccionoracol;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author alumno04
 */
public class Coneccion {
    
  public static Connection conectar(){
      Connection coneccion=null;
      
      try{
           Class.forName("oracle.jdbc.driver.OracleDriver");
           coneccion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","prueba1","Susan1234");
      }catch (Exception e) {
          e.printStackTrace();
          
      }
     
      return coneccion;
  }
    
}
