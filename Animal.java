import java.util.Scanner;

class St {  
    int rollno;  
    String name, course;  
    float fee;  

    // Constructor with three parameters
    St(int rollno, String name, String course) {  
        this.rollno = rollno;  
        this.name = name;  
        this.course = course;  
    }  

    // Constructor with four parameters (reusing the previous constructor)
    St(int rollno, String name, String course, float fee) {  
        this(rollno, name, course); // Reusing constructor  
        this.fee = fee;  
    }  

    // Method to display student information
    void display() {  
        System.out.println(rollno + " " + name + " " + course + " " + fee);  
    }  
}  

public class Animal {  
    public static void main(String args[]) {  
        // Creating objects using different constructors
        St s1 = new St(111, "Ankit", "Java");  
        St s2 = new St(112, "Sumit", "Java", 6000f);  

        // Displaying the details
        s1.display();  
        s2.display();  
    }  
}
