/**
 * File         : Student.java
 * Deskripsi    : Program latihan penggunaan Polimorfisme Universal: Inclusion. Pembuatan Subclass Student
 * Pembuat      : George Imanuel Surya - 24060123120028
 * Lab          : B2
 */

public class Student extends Person {
    public Student(String name) {
        super(name);
    }

    @Override
    public boolean isAsleep(int hr) {
        return hr > 2 && hr < 8; 
    }
}
