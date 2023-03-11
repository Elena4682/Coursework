public class Employee {
    private String abbreviation;
    private int department;
    private int salary;
    private static int idCount = 1;
    private int id;
    public Employee(String abbreviation, int department, int salary) {
        this.abbreviation = abbreviation;
        this.department = department;
        this.salary = salary;
        this.id = idCount;
        idCount++;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ФИО" + abbreviation+ " , отдел" + department+ " , зарплата" + salary + " , ID" + id;
    }
}


