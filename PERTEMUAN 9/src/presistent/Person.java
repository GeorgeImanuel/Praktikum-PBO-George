/*
Nama    : George Imanuel Surya
NIM     : 24060123120028
Tanggal : 18/05/2025
*/
package presistent;

/*
File        : Person.java
Deskripsi   : class menampung object person | person database model
*/

/**
 *
 * @author enzok
 */
public class Person {
    private int id;
    private String name;
    
    public Person(String name){
        this.name = name;
    }
    
    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
}