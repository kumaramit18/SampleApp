package src;

import java.util.*;

public class EmployeeComparator implements  Comparable<EmployeeComparator> {

    private int id;
    private String name;
    private int age;
    private long salary;

    public EmployeeComparator(int id, String name, int age, long salary) {
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
    public int compareTo(EmployeeComparator emp) {
        return (this.id - emp.id);
    }

    public static void main(String args[]) {
        //sorting object array
        EmployeeComparator[] empArr = new EmployeeComparator[4];
        empArr[0] = new EmployeeComparator(10, "Mikey", 25, 10000);
        empArr[1] = new EmployeeComparator(20, "Arun", 29, 20000);
        empArr[2] = new EmployeeComparator(5, "Lisa", 35, 5000);
        empArr[3] = new EmployeeComparator(1, "Pankaj", 32, 50000);

        Arrays.sort(empArr);
        System.out.println("Default Sorting of Employees list:\n" + Arrays.toString(empArr));

        List<EmployeeComparator> empList = new ArrayList<EmployeeComparator>();
        empList.add(empArr[0]);
        empList.add(empArr[1]);
        empList.add(empArr[2]);
        empList.add(empArr[3]);

        Collections.sort(empList);

        for (EmployeeComparator emp : empList)
            System.out.print(" " + emp);

        Collections.sort(empList, EmployeeComparator.SalaryComparator);
        System.out.println("\nEmployees list sorted by Salary:\n");
        for (EmployeeComparator emp : empList)
            System.out.print(" " + emp);

        System.out.println("\nEmployees list sorted by Age:\n");
        Collections.sort(empList, EmployeeComparator.AgeComparator);
        for (EmployeeComparator emp : empList)
            System.out.print(" " + emp);
    }

    public static Comparator<EmployeeComparator> SalaryComparator = new Comparator<EmployeeComparator>() {
        @Override
        public int compare(EmployeeComparator o1, EmployeeComparator o2) {
            return (int) (o1.getSalary() - o2.getSalary());
        }
    };

    public static Comparator<EmployeeComparator> AgeComparator =  new Comparator<EmployeeComparator>() {
        @Override
        public int compare(EmployeeComparator o1, EmployeeComparator o2) {
            return (o1.getAge() - o2.getAge());
        }
    };

    public static Comparator<EmployeeComparator> NameComparator = new Comparator<EmployeeComparator>() {
        @Override
        public int compare(EmployeeComparator o1, EmployeeComparator o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
}