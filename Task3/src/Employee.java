import com.sun.xml.internal.ws.message.EmptyMessageImpl;

public class Employee extends Person {
    private double salary;
    private int started;
    private String insuranceNumber;

    public Employee(){
        super();
        salary = 0;
        started = 0;
        insuranceNumber = "no insurance number";
    }

    public Employee(String uname, double usalary, int ustarted, String uinsuranceNumber){
        super(uname);
        salary = usalary;
        started = ustarted;
        insuranceNumber = uinsuranceNumber;
    }
    public double getSalary(){
        return salary;
    }

    public int gerStarted(){
        return started;
    }

    public String getInsuranceNumber(){
        return insuranceNumber;
    }

    public void setSalary(double usalary){
        salary = usalary;
    }

    public void setStarted(int ustarted){
        started = ustarted;
    }

    public void setInsuranceNumber(String uinsuranceNumber){
        insuranceNumber = uinsuranceNumber;
    }

    public String toString(){
        String uname = super.getName();
        String employee = "Name: " + uname + "\nSalary: " + salary + "\nStarted: " + started + "\nInsurance number: " + insuranceNumber;
        return employee;
    }

    public boolean equals(Object object){
        /*if(super.getName() == employee.getName() && salary == employee.getSalary() && started == employee.gerStarted() && insuranceNumber == employee.getInsuranceNumber()){
            System.out.println("This is the same person");
        }*/

        if(object == this || object instanceof Employee)
            return true;

        return false;
    }
}
