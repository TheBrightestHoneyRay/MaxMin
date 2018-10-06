import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {

    ArrayList<Employee> employees = new ArrayList<Employee>();
    private double bonus;

    public Manager(){
        super();
        bonus = 0;
    }

    public Manager(String uname, double usalary, int ustarted, String uinsuranceNumber, double ubonus){
        super(uname, usalary, ustarted, uinsuranceNumber);
        bonus = ubonus;
    }

    public double getBonus(){
        return bonus;
    }

    public void print(){
        for(int i = 0; i < employees.size(); i++){
            System.out.print(employees.get(i) + "\n");
        }
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void addEmployee(String uname, double usalary, int ustarted, String uinsuranceNumber){
        Employee empl = new Employee(uname, usalary, ustarted, uinsuranceNumber);
        employees.add(empl);
    }

    public boolean isEmployee(Employee emp){
        if(employees.contains(emp)){
            System.out.println("There is such employee named " + emp.getName() + ".");
            return true;
        }

        return false;
    }

    public boolean isEmployee(String uname, double usalary, int ustarted, String uinsuranceNumber){
        Employee emp = new Employee(uname, usalary, ustarted, uinsuranceNumber);
        if(employees.contains(emp)){
            System.out.println("There is such employee named " + emp.getName() + ".");
            return true;
        }
        return false;
    }

    public boolean equals(Object object){
        if(object == this || object instanceof Manager)
            return true;

        return false;
    }

}
