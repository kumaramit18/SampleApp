package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeComparable implements  Comparable<EmployeeComparable> {

    private int id;
    private String name;
    private int age;
    private long salary;

    public EmployeeComparable(int id, String name, int age, long salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeComparable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }


    @Override
    public int compareTo(EmployeeComparable emp) {
        return (this.id - emp.id);
    }

    public static void main(String args[]) {
        //sorting object array
        EmployeeComparable[] empArr = new EmployeeComparable[4];
        empArr[0] = new EmployeeComparable(10, "Mikey", 25, 10000);
        empArr[1] = new EmployeeComparable(20, "Arun", 29, 20000);
        empArr[2] = new EmployeeComparable(5, "Lisa", 35, 5000);
        empArr[3] = new EmployeeComparable(1, "Pankaj", 32, 50000);

        Arrays.sort(empArr);
        System.out.println("Default Sorting of Employees list:\n"+Arrays.toString(empArr));

        List<EmployeeComparable> empList = new ArrayList<EmployeeComparable>();
        empList.add(empArr[0]);
        empList.add(empArr[1]);
        empList.add(empArr[2]);
        empList.add(empArr[3]);

        Collections.sort(empList);

        for(EmployeeComparable emp: empList)
            System.out.print(" "+emp);


    }
}
