package ProxyDesignPattern;

public class Main {
    public static void main(String[] args) {
        EmployeeDao employeeDao=new EmployeeProxy();
        employeeDao.create("ADMIN", employeeDao);
        employeeDao.delete("USER", 0);
    }
}
