import java.util.Arrays;

public class Menu {

    public static void main(String[] args) throws Exception {

        EmployeePayroll record = new EmployeePayroll();
        EmployeeRecord record1 = record.addEmployee(new EmployeeRecord("1234", "michael", "daniel", "developer", 'm', 20.0, 30.3, 43.4, 45.6, 85.5, 35.6, 43.5, 3.5, 53.2, 12));
        EmployeeRecord record2 = record.addEmployee(new EmployeeRecord("6543","john","doe","developer",'m',92.1,320.3,273.1,345.1,853.0,345.3,423.5,337.5,100.2,9));
        EmployeeRecord record3 = record.addEmployee(new EmployeeRecord("2456","sam","stone","driver",'f',678.6,880.3,456.4,57.6,87.5,95.6,343.5,66.5,43.2,200));
        EmployeeRecord record4 = record.addEmployee(new EmployeeRecord("9876","charles","dom","teacher",'f',50.3,20.3,4.4,25.2,53.2,3.6,33.5,2.2,5.3,14));

//        System.out.println(record1);
//        System.out.println(record2);
//        System.out.println(record3);
//        System.out.println(record4);
//        System.out.println(Arrays.asList(record1,record2,record3,record4));


       // record.deleteEmployee("1234");
       // record.findById("1234");

      //

//        EmployeeRecord emp = record.updateEmployee("1234",new EmployeeRecord());
//            emp.setEmpFirstName("johnny");
//            emp.setEmpLastName("deep");

     //  EmployeeRecord e = record.updateEmployee(new EmployeeRecord("1234",null,null,"teacher",'f',50.3,20.3,4.4,25.2,53.2,3.6,33.5,2.2,5.3,14));
      //  System.out.println(e);



        //record.findByEmpDept("teacher");
         // record.findAllEmployees();
       // System.out.println(record.findAllEmployees().size());
        record.findByNetPay(621,3000000);


    }






}
