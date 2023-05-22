package cliente_crud;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class conexionMysql {
    Connection cn; //variable de tipo connection
    public Connection conectar(){ //metodo conectar de tipo connection
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/crudclientes", "root", "");
            System.out.println("CONECTADO");
        }catch(Exception e){
            System.out.println("Error" + e);
        }
        return cn;
    }
}
