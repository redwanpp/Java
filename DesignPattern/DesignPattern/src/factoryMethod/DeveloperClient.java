package factoryMethod;

public class DeveloperClient {
    public static void main(String[] args) {
        Employee em = EmployeeFactory.getEmployee("android developer");
        int salary = em.salary();
        System.out.println(salary);

        Employee em2 = EmployeeFactory.getEmployee("web developer");
        int salary2 = em2.salary();
        System.out.println(salary2);
    }
}
