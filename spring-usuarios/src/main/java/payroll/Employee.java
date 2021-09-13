package payroll;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Employee {

  private @Id @GeneratedValue Long id;
  private String lastName;
  private String firstName;
  private String proc;
  private int sal;
  private String fA;


  Employee() {}

  Employee(String lastName, String firstName, String proc, int sal, String fA) {

    this.lastName = lastName;
    this.firstName = firstName;
    this.proc = proc;
    this.sal = sal;
    this.fA = fA;
  }

  public Long getId() {
    return this.id;
  }

  public String getlastName() {
    return this.lastName;
  }

  public String getfirstName() {
    return this.firstName;
  }

  public String getproc() {
    return this.proc;
  }

  public int getsal() {
    return this.sal;
  }

  public String getfA() {
    return this.fA;
  }


  public void setId(Long id) {
    this.id = id;
  }

  public void setlastName(String lastName) {
    this.lastName = lastName;
  }

  public void setfirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setproc(String proc) {
    this.proc = proc;
  }

  public void setsal(int sal) {
    this.sal = sal;
  }

  public void setfA(String fA) {
    this.fA = fA;
  }



  @Override
  public boolean equals(Object o) {

    if (this == o)
      return true;
    if (!(o instanceof Employee))
      return false;
    Employee employee = (Employee) o;
    return Objects.equals(this.id, employee.id) 
        && Objects.equals(this.lastName, employee.lastName)
        && Objects.equals(this.firstName, employee.firstName)
        && Objects.equals(this.proc, employee.proc)
        && Objects.equals(this.sal, employee.sal)
        && Objects.equals(this.fA, employee.fA);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.lastName, 
                        this.firstName, this.proc, 
                        this.sal, this.fA);
  }

  @Override
  public String toString() {
    return "Employee{" + "id=" + this.id 
                       +  ", lastname='" + this.lastName 
                       +  ", firstName='" + this.firstName 
                       +  ", proc='" + this.proc 
                       +  ", sal='" + this.sal 
                       +  ", sal='" + this.fA 
                       + '\'' + '}';
  }
}