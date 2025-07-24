package ProxyDesignPattern;

public class EmployeeProxy implements EmployeeDao{
    EmployeeDao employeeDao;
    public EmployeeProxy(){
        this.employeeDao=new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, EmployeeDao obj) {
        if(client=="ADMIN")  System.out.println("New Employee created in table");
        else System.out.println("Access Denied");
    }

    @Override
    public void delete(String client, int empId) {
        if(client=="ADMIN") System.out.println("Employee deleted");
        else System.out.println("Access Denied");
    }

    @Override
    public EmployeeDo get(String client, int empId) {
        if(client=="ADMIN" || client=="USER"){
         System.out.println("data fetched successfully");
        
        }
        else{
             System.out.println("Access Denied");
        }
         return new EmployeeDo();
    
         
    }
    
}
