package lab1;

/**
 *
 * @author dworgolet
 */
public class Startup {


    public static void main(String[] args) {
       Employee e1 = new Employee("Wargolet", "Daniel", "333-333-3333", "187813");
       Employee e2 = new Employee("Wargolet", "Daniel", "333-333-3333", "187813");
       Employee e3 = new Employee("Buth", "Steven", "444-444-4444", "189211"); 
       Employee e4 = new Employee("Buth", "Matthew", "555-555-5555", "983813"); 
       
       
       System.out.println(e1.toString());       
       System.out.println(e2.toString());
       System.out.println(e3.toString());
       System.out.println(e4.toString());
       
       
    }
    
}
