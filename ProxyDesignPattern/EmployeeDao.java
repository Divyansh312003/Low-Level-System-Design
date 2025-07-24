package ProxyDesignPattern;

public interface EmployeeDao {
    void create(String client,EmployeeDao obj);
    void delete(String client,int empId);
    EmployeeDo get(String client,int empId);
}
