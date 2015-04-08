/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coneccionoracol;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author alumno04
 */
public class ConeccionOracol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        if (Coneccion.conectar()==null) {
               System.out.println("la conneccion fallo!!!.");
            
        } else {
                System.out.println("la conneccion fue exitosa!!!.");
                
                try {
                    Statement st=Coneccion.conectar().createStatement();
                    ResultSet rs=st.executeQuery("SELECT * FROM persona");
                    while (rs.next()) {                        
                        System.out.println("ID:"+rs.getInt("id_persona"));
                        System.out.println("ID:"+rs.getString("nombre"));
                        System.out.println("ID:"+rs.getString("apellido_pat"));
                        System.out.println("ID:"+rs.getString("apellido_mat"));
                    }
            } catch (Exception e) {
            }
                
               
                
        }
    }
    
}
