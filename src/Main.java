import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee [0]= new Employee(" Иванов Иван Иванович ", 3, 40000);
        employee [1]= new Employee(" Семенова Татьяна Андреевна ", 1, 50000);
        employee [2]= new Employee(" Петров Степан Алексеевич" , 2, 40000);
        employee [3]= new Employee(" Гущин Алексей Иванович" , 4, 45000);
        employee [4]= new Employee(" Иванова Вера Григорьевна ", 5, 50000);
        for (int i = 0; i < employee.length; i++) {
            if (i == employee.length-1){
                System.out.println(employee[i]);
                break;
            }
            System.out.println(employee[i] + " ");

        }

        }



        }
