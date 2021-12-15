package wed;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee akshu = new Employee("Akshu", "Shigvan", 9696);
        Employee mayu = new Employee("Mayuri", "Tambe", 8595);
        System.out.println(akshu.getFirstName() + "'s monthly salary is " + akshu.getMonthlySalary());
        System.out.println(mayu.getFirstName() + "'s monthly salary is " + mayu.getMonthlySalary());
        akshu.setMonthlySalary(akshu.getMonthlySalary() * 1.1);
        mayu.setMonthlySalary(mayu.getMonthlySalary() * 1.1);
        System.out.println("Salary after 10% boost");
        System.out.println(akshu.getFirstName() + "'s monthly salary is " + akshu.getMonthlySalary());
        System.out.println(mayu.getFirstName() + "'s monthly salary is " + mayu.getMonthlySalary());
    }
}