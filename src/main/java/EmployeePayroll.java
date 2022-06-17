import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class EmployeePayroll {


    private final Map<String,EmployeeRecord> employeeRecords = new HashMap<>();


    public EmployeeRecord addEmployee(EmployeeRecord employeeRecord) throws Exception {

        Optional<String> ide = employeeRecords.keySet().stream()
                .filter(id -> id.equals(employeeRecord.getEmpID()))
                .findFirst();

        if (ide.isPresent()) {
            throw new Exception(" This id already exists ");
        } else {

            if (employeeRecord.getEmpRatePerHour() <= 300) {
                employeeRecord.setEmpRatePerHour(employeeRecord.getEmpRatePerHour());
            }

            double basicpay = employeeRecord.getEmpRatePerHour() * 40;
            employeeRecord.setEmpBasicPay(basicpay);

            if (employeeRecord.getEmpHrsWorked() <= 50) {
                employeeRecord.setEmpHrsWorked(employeeRecord.getEmpHrsWorked());
            }

            if (employeeRecord.getEmpHrsWorked() > 40) {
                double overtime = employeeRecord.getEmpRatePerHour() * 0.015;
                employeeRecord.setEmpOvertimePay(overtime);
            }

            double sssdeductions = employeeRecord.getEmpBasicPay() * 0.05;
            double sss = 500.00;
            employeeRecord.setEmpSSSDeduction(Math.max(sssdeductions, sss));

            double otherdeduct = employeeRecord.getEmpBasicPay() * 0.25;
            if (otherdeduct < employeeRecord.getEmpOtherDeductions()) {
                employeeRecord.setEmpOtherDeductions(otherdeduct);
            }


            double deductions = employeeRecord.getEmpTaxDeduction() + employeeRecord.getEmpOtherDeductions() + employeeRecord.getEmpSSSDeduction();
            employeeRecord.setEmpTotalDeductions(deductions);

            double netpay = employeeRecord.getEmpBasicPay() + employeeRecord.getEmpOvertimePay() - employeeRecord.getEmpTotalDeductions();
            employeeRecord.setEmpNetPay(netpay);


            employeeRecords.put(employeeRecord.getEmpID(), employeeRecord);
            //employeeRecords.add(employeeRecord.getEmpID(),employeeRecord);

        }
        return employeeRecord;

}

    public EmployeeRecord updateEmployee( EmployeeRecord employeeRecord) throws Exception {


        EmployeeRecord byId = findById(employeeRecord.getEmpID());



        if (employeeRecord.getEmpBasicPay() != 0) {
            byId.setEmpBasicPay(employeeRecord.getEmpBasicPay());
        }
        if (employeeRecord.getEmpOtherDeductions() != 0) {
            byId.setEmpOtherDeductions(employeeRecord.getEmpOtherDeductions());
        }
        if (employeeRecord.getEmpRatePerHour() != 0) {
            byId.setEmpRatePerHour(employeeRecord.getEmpRatePerHour());
        }
        if (employeeRecord.getEmpHrsWorked() != 0) {
            byId.setEmpHrsWorked(employeeRecord.getEmpHrsWorked());
        }
        if (employeeRecord.getEmpGender() != 0) {
            byId.setEmpGender(employeeRecord.getEmpGender());
        }
        if (employeeRecord.getEmpSSSDeduction() != 0) {
            byId.setEmpSSSDeduction(employeeRecord.getEmpSSSDeduction());
        }
        if (employeeRecord.getEmpOvertimePay() != 0) {
            byId.setEmpOvertimePay(employeeRecord.getEmpOvertimePay());
        }
        if (employeeRecord.getEmpFirstName() != null) {
            byId.setEmpFirstName(employeeRecord.getEmpFirstName());
        }
        if (employeeRecord.getEmpLastName() != null) {
            byId.setEmpLastName(employeeRecord.getEmpLastName());
        }
        if (employeeRecord.getEmpTaxDeduction() != 0) {
            byId.setEmpTaxDeduction(employeeRecord.getEmpTaxDeduction());
        }
        if (employeeRecord.getEmpDepartment() != null) {
            byId.setEmpDepartment(employeeRecord.getEmpDepartment());
        }
        if (employeeRecord.getEmpNetPay() != 0) {
            byId.setEmpNetPay(employeeRecord.getEmpNetPay());
        }
        if (employeeRecord.getEmpTotalDeductions() != 0) {
            byId.setEmpTotalDeductions(employeeRecord.getEmpTotalDeductions());
        }
        if (employeeRecord.getSize() != 0) {
            byId.setSize(employeeRecord.getSize());
        }

        return employeeRecords.replace(employeeRecord.getEmpID(), employeeRecord);
        //System.out.println(employeeRecord);
    }

    public void deleteEmployee(String employeeId) throws Exception {


//        EmployeeRecord employeeRecord = employeeRecords.stream()
//                .filter(ide -> employeeId.equals(ide.getEmpID()))
//                .findFirst()
//                .orElseThrow(() -> new Exception("employee not present"));
//        employeeRecords.remove(employeeRecord);

//        employeeRecords.removeIf(e -> e.getEmpID().equals(employeeId));


    }


    public EmployeeRecord findById(String empId) throws Exception {

        EmployeeRecord employeeRecord = employeeRecords.get(empId);

        if (Objects.isNull(employeeRecord)) {
           throw new Exception("This id doesnt exist");
        }

     //   System.out.println(employeeRecord);
        return employeeRecord;
    }


    public void findByEmpDept(String empDept) {

//        List<EmployeeRecord> employeeDeptRecord = employeeRecords.stream()
//                .filter(em -> empDept.equals(em.getEmpDepartment())).collect(Collectors.toList());
//        System.out.println(employeeDeptRecord);



        
    }


    public void findByNetPay(double from, double to) throws Exception {

//        List<EmployeeRecord> netPay = employeeRecords.stream()
//                .filter(pay -> pay.getEmpNetPay() >= from && pay.getEmpNetPay() <= to)
//                .collect(Collectors.toList());
//        if (netPay.isEmpty()) {
//            throw new Exception(" not in range");
//        }
//        System.out.println(netPay);


//        for (EmployeeRecord e: employeeRecords) {
//            if (e.getEmpNetPay() >= from && e.getEmpNetPay() <= to){
//
//                //System.out.println(e);
//            }
//        }
//
    }
    public void findAllEmployees(){
        System.out.println(employeeRecords.values());
        //return employeeRecords;

    }

    @Override
    public String toString() {
        return "EmployeePayroll{" +
                "employeeRecords=" + employeeRecords +
                '}';
    }
}
