package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Test {


//    Employee emp1 = new Employee(5, "John", 29);
//
//    void add(List<Employee> lstEmp) {
//        lstEmp.add(emp1);
//    }

    public static void main(String[] args) {
        List<Employee> lstEmp = new ArrayList<>();
        Employee emp1 = new Employee(5, "John", 29);
        Employee emp2 = new Employee(2, "kone", 32);
        Employee emp3 = new Employee(3, "Bone", 23);
        Employee emp4 = new Employee(8, "Tone", 54);
        lstEmp.add(emp1);
        lstEmp.add(emp2);
        lstEmp.add(emp3);
        lstEmp.add(emp4);

      List<Employee> le =   lstEmp.stream().filter(emp -> emp.getAge() > 50).collect(Collectors.toList());

        System.out.println("lstEmp : " + le);

       //List<Integer> age =  lstEmp.stream().forEach(employee -> employee.getAge());

       String s ="absasa";
       s.length();



    }
}
