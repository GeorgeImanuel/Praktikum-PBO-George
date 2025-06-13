/*
Nama    : George Imanuel Surya
NIM     : 24060123120028
Tanggal : 18/05/2025
*/
package presistent;

/**
 *
 * @author noels
 */
import java.io.*;

public class ReadSerializePerson {
    public static void main(String[] args) {
        Person person = null;

        try {
            FileInputStream fileIn = new FileInputStream("person.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            person = (Person) in.readObject();
            in.close();
            fileIn.close();

            System.out.println("Serialized person name = " + person.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}