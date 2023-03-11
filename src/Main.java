import java.util.Arrays;

public class Main {
    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee(" Иванов Иван Иванович ", 3, 40000);
        employees[1] = new Employee(" Семенова Татьяна Андреевна ", 1, 50000);
        employees[2] = new Employee(" Петров Степан Алексеевич", 2, 43000);
        employees[3] = new Employee(" Гущин Алексей Иванович", 4, 47000);
        employees[4] = new Employee(" Иванова Вера Григорьевна ", 5, 58000);
        employees[5] = new Employee(" Сидорова Елена Сергеевна ", 1, 51000);
        employees[6] = new Employee(" Бабич Алексей Юрьевич ", 5, 55000);
        employees[7] = new Employee(" Ким Сергей Алексеевич", 3, 45000);
        employees[8] = new Employee(" Воронцова Тамара Ивановна", 2, 60000);
        employees[9] = new Employee(" Дементьева Алла Сергеевна ", 4, 41000);

        printEmployees();
        System.out.println("***");
        System.out.println("Сумма зарплат " + sumSalary());
        System.out.println("***");
        System.out.println(minSalaryEmployee());
        System.out.println("***");
        System.out.println(maxSalaryEmployee());
        System.out.println("***");
        System.out.println("Среднее значение зарплат " + averageValueSalaries());
        System.out.println("***");
        printAbbreviation();
        System.out.println("***");
        printIndexSalary();
        System.out.println("***");
        System.out.println(minSalaryEmployeeInDep());
        System.out.println("***");
        System.out.println(maxSalaryEmployeeInDep());
        System.out.println("***");
        System.out.println("Сумма зарплат по отделу " + sumSalaryInDep());
        System.out.println("***");
        System.out.println("Среднее значение зарплат в отделе " + averageValueSalariesInDep());
        System.out.println("***");
        indexSalaryInDep();
        System.out.println("***");
        printAbbreviationInDep();
        System.out.println("***");
        printEmployeesWithLessSalary();
        System.out.println("***");
        printEmployeesWithAfterSalary();

    }

    public static void printEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if (i == employees.length - 1) {
                System.out.println(employees[i]);
                break;
            }
            System.out.println(employees[i] + " ");
        }
    }

    public static int sumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }

    public static Employee minSalaryEmployee() {
        Employee min = null;
        for (Employee employee : employees) {
            if (min == null || employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    public static Employee maxSalaryEmployee() {
        Employee max = null;
        for (Employee employee : employees) {
            if (max == null || employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

    public static double averageValueSalaries() {
        int sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        return (double) sum / employees.length;
    }

    public static void printAbbreviation() {
        for (Employee employee : employees) {
            System.out.println(employee.getAbbreviation());
        }
    }

    public static void printIndexSalary() {
        int percent=5;
        for (Employee employee : employees) {
            employee.setSalary((employee.getSalary() + (employee.getSalary() * percent) / 100));
            System.out.println("Зарплата сотрудника " + employee.getAbbreviation() +
                    " после индексации " + employee.getSalary());
        }
    }

    public static Employee minSalaryEmployeeInDep() {
        int department= 1;
        Employee min = null;
        for (Employee employee : employees) {
            if (min == null || employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    public static Employee maxSalaryEmployeeInDep() {
        int department= 1;
        Employee max = null;
        for (Employee employee : employees) {
            if (max == null || employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }
    public static int sumSalaryInDep() {
        int department=1;
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department)
                sum = sum + employee.getSalary();
        }
        return sum;
    }
    public static double averageValueSalariesInDep() {
        int department =1;
        int employeesInDepartment = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department)
                employeesInDepartment++;
        }
        return (double)sumSalaryInDep()/employeesInDepartment;
    }
    public static void indexSalaryInDep() {
        int percent=5;
        int department=1;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                employee.setSalary((employee.getSalary() + (employee.getSalary() * percent) / 100));
                System.out.println("Зарплата сотрудника " + employee.getAbbreviation() +
                        " после индексации " + employee.getSalary());
            }
        }
    }
    public static void printAbbreviationInDep() {
        int department=1;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println("ФИО " + employee.getAbbreviation()+ " , зарплата " + employee.getSalary());
            }
        }
    }

    public static void printEmployeesWithLessSalary() {
        int number=50000;
        for (Employee employee : employees) {
            if (employee.getSalary() < number) {
                System.out.println(employee);
            }
        }
    }
    public static void printEmployeesWithAfterSalary() {
        int number=50000;
        for (Employee employee : employees) {
            if (employee.getSalary() >= number) {
                System.out.println(employee);
            }
        }
    }

}




















