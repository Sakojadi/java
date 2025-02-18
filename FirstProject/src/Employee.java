public abstract class Employee {
    protected String name;
    protected int id;
    protected int baseSalary;

    public Employee(String name, int id, int baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayEmployeeInfo(){
        System.out.println("\nName: " + name+ "\nId: " + id + "\nBase Salary: " + baseSalary);
    }
}

interface Payable{
    public double getPaymentAmount();

}

class FullTimeEmployee extends Employee implements Payable{
    double bonus = 1.2;
    boolean health_insurance = true;

    public FullTimeEmployee(String name, int id, int baseSalary) {
        super(name, id, baseSalary);
    }

    public void displayEmployeeInfo(){
        super.displayEmployeeInfo();
        System.out.println("Bonus: " + bonus + "\nHealth Insurance: " + health_insurance);
    }

    public double calculateSalary(){
        return baseSalary*bonus;
    }

    public double getPaymentAmount()
    {
        return calculateSalary();
    }

}

class ContractEmployee extends Employee implements Payable{
    int hourly_rate = 12;
    int hours_worked;

    public ContractEmployee(String name, int id, int baseSalary, int hours_worked) {
        super(name, id, baseSalary);
        this.hours_worked = hours_worked;
    }

    public void displayEmployeeInfo() {
        super.displayEmployeeInfo();
        System.out.println("Hourly rate: "+ hourly_rate + "\nHours worked: " + hours_worked);
    }

        public double calculateSalary(){
        return hours_worked*hourly_rate;
    }

    public double getPaymentAmount(){
        return calculateSalary();
    }

}

class mainEmployee{
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        employees[0] = new FullTimeEmployee("Nasipa", 1111, 10000);
        employees[1] = new ContractEmployee("Dina", 2222, 0, 13);
        for (Employee e: employees){
            e.displayEmployeeInfo();
            System.out.println(e.calculateSalary());
        }
    }
}

