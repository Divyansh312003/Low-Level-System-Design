package ProxyDesignPattern;

public class EmployeeDaoImpl implements EmployeeDao{

    @Override
    public void create(String client, EmployeeDao obj) {
       System.out.println("New Employee created in table");
    }

    @Override
    public void delete(String client, int empId) {
        System.out.println("Employee deleted");
    }

    @Override
    public EmployeeDo get(String client, int empId) {
         System.out.println("data fetched successfully");
         return new EmployeeDo();
    
         
    }
    
}
