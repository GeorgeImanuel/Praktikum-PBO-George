/*
Nama    : George Imanuel Surya
NIM     : 24060123120028
Tanggal : 18/05/2025
*/
package presistent;

/*
File        : MySQLPersonDAO.java
Deskripsi   : implementasi PersonDAO untuk MySQL
*/

import java.sql.*;

/**
 *
 * @author enzok
 */
public class MySQLPersonDAO implements PersonDAO{
    public void savePerson(Person person) throws Exception{
        String name = person.getName();
        
        //membuat koneksi, nama db, user, password(menyesuaikan)
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost/pbo", "root", ""
        );
        
        //kerjakan mysql query
        String query = "INSERT INTO person(name) VALUES ('"+name+"')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        
        //tutup koneksi database
        con.close();
    }
}

