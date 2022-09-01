
public class TheEmployee {
   private String firstName;
   private String lastName;
   private int salary;


    public TheEmployee(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }
    public int getAnnualSalary() {
        int salary=getSalary()*12;
        return salary;
    }
    public int riseSalary(int percent){
        int increaseSalary= (int) (0.2*getAnnualSalary());
        int newSalary= (int) (getAnnualSalary()+increaseSalary);
        return newSalary;
    }

}
class Employee{
    public static void main(String[] args) {
        TheEmployee theEmployee=new TheEmployee("Abishek","Bimali",10000);
        System.out.println(theEmployee.riseSalary(20));
    }
}
