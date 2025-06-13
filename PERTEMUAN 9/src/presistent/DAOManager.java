/*
Nama    : George Imanuel Surya
NIM     : 24060123120028
Tanggal : 18/05/2025
*/
package presistent;

/*
File        : DAOManager.java
Deskripsi   : pengelola DAO dalam program
*/

/**
 *
 * @author enzok
 */
public class DAOManager {
    private PersonDAO personDAO;
    
    public void setPersonDAO(PersonDAO personDAO){
        this.personDAO = personDAO;
    }
    
    public PersonDAO getPersonDAO(){
        return this.personDAO;
    }
}
