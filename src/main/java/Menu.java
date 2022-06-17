import java.util.Arrays;

public class Menu {

    public static void main(String[] args) throws Exception {

        EmployeePayroll record = new EmployeePayroll();
        EmployeeRecord record1 = record.addEmployee(new EmployeeRecord("1234", "michael", "daniel", "developer", 'm', 20.0, 30.3, 43.4, 45.6, 85.5, 35.6, 43.5, 3.5, 53.2, 12));
        EmployeeRecord record2 = record.addEmployee(new EmployeeRecord("6543","john","doe","developer",'m',92.1,320.3,273.1,345.1,853.0,345.3,423.5,337.5,100.2,9));
        EmployeeRecord record3 = record.addEmployee(new EmployeeRecord("2456","sam","stone","driver",'f',678.6,880.3,456.4,57.6,87.5,95.6,343.5,66.5,43.2,200));

    }






}
