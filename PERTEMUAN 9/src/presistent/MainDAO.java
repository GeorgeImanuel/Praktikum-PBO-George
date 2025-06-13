/*
Nama    : George Imanuel Surya
NIM     : 24060123120028
Tanggal : 18/05/2025
*/
package presistent;

/*
File        : MainDAO.java
Deskripsi   : main program untuk akses DAO
*/

/**
 *
 * @author enzok
 */
public class MainDAO {
    public static void main(String[] args) {
        Person person = new Person("Kelek Walang");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try{
            m.getPersonDAO().savePerson(person);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
