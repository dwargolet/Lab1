package lab1;

import java.util.Objects;

/**
 *
 * @author dworgolet
 */
public class Employee {
    
    private String lastName;
    private String firstName;
    private String ssn;
    private String empNum;
    
    public Employee(String lastName, String firstName, String ssn, String empNum) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.ssn = ssn;
        this.empNum = empNum;
    }

    public String getEmpNum() {
        return empNum;
    }

    public void setEmpNum(String empNum) {
        this.empNum = empNum;
    }
    
    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee # " +  empNum + " - " + firstName + " " + lastName;
    }


  //uses employee ssn to check equality
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.ssn);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (!Objects.equals(this.ssn, other.ssn)) {
            return false;
        }
        return true;
    }
    
    
    
}
