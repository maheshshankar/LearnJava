import java.io.IOException;


class EmployeeIDException extends Exception {
    EmployeeIDException(String name) {
        super(name);
    }
}
class EmployeeCreator {
    public boolean createEmployee(int id) throws EmployeeIDException {
        if(id==0)  {
            throw new EmployeeIDException("ID Mandatory");
        }
        return false;
    }

}
public class Animal {
    public static void main(String args[]) throws EmployeeIDException{
        EmployeeCreator ec = new EmployeeCreator();
        ec.createEmployee(0);
    }
}
