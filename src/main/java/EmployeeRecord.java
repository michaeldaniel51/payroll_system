public class EmployeeRecord {


    private String empID;
    private String empLastName;
    private String empFirstName;
    private String empDepartment;
    private char empGender;
    private double empHrsWorked;
    private double empRatePerHour;
    private double empSSSDeduction;
    private double empTaxDeduction;
    private double empOtherDeductions;
    private double empBasicPay;
    private double empOvertimePay;
    private double empTotalDeductions;
    private double empNetPay;
    private int size;

    //"1234","michael","daniel","developer",'m',20.0,30.3,43.4,45.6,85.5,35.6,43.5,3.5,53.2,12
    //"6543","john","doe","programmer",'m',92.1,320.3,273.1,345.1,853.0,345.3,423.5,337.5,100.2,9
    //"2456","sam","stone","driver",'f',678.6,880.3,456.4,57.6,87.5,95.6,343.5,66.5,43.2,200
    //"9876","charles","dom","teacher",'f',50.3,20.3,4.4,25.2,53.2,3.6,33.5,2.2,5.3,14
    public EmployeeRecord() {
    }

    public EmployeeRecord(String empID, String empLastName, String empFirstName, String empDepartment, char empGender, double empHrsWorked, double empRatePerHour, double empSSSDeduction, double empTaxDeduction, double empOtherDeductions, double empBasicPay, double empOvertimePay, double empTotalDeductions, double empNetPay, int size) {
        this.empID = empID;
        this.empLastName = empLastName;
        this.empFirstName = empFirstName;
        this.empDepartment = empDepartment;
        this.empGender = empGender;
        this.empHrsWorked = empHrsWorked;
        this.empRatePerHour = empRatePerHour;
        this.empSSSDeduction = empSSSDeduction;
        this.empTaxDeduction = empTaxDeduction;
        this.empOtherDeductions = empOtherDeductions;
        this.empBasicPay = empBasicPay;
        this.empOvertimePay = empOvertimePay;
        this.empTotalDeductions = empTotalDeductions;
        this.empNetPay = empNetPay;
        this.size = size;
    }



    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    public String getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }

    public char getEmpGender() {
        return empGender;
    }

    public void setEmpGender(char empGender) {
        this.empGender = empGender;
    }

    public double getEmpHrsWorked() {
        return empHrsWorked;
    }

    public void setEmpHrsWorked(double empHrsWorked) {
        this.empHrsWorked = empHrsWorked;
    }

    public double getEmpRatePerHour() {
        return empRatePerHour;
    }

    public void setEmpRatePerHour(double empRatePerHour) {
        this.empRatePerHour = empRatePerHour;
    }

    public double getEmpSSSDeduction() {
        return empSSSDeduction;
    }

    public void setEmpSSSDeduction(double empSSSDeduction) {
        this.empSSSDeduction = empSSSDeduction;
    }

    public double getEmpTaxDeduction() {
        return empTaxDeduction;
    }

    public void setEmpTaxDeduction(double empTaxDeduction) {
        this.empTaxDeduction = empTaxDeduction;
    }

    public double getEmpOtherDeductions() {
        return empOtherDeductions;
    }

    public void setEmpOtherDeductions(double empOtherDeductions) {
        this.empOtherDeductions = empOtherDeductions;
    }

    public double getEmpBasicPay() {
        return empBasicPay;
    }

    public void setEmpBasicPay(double empBasicPay) {
        this.empBasicPay = empBasicPay;
    }

    public double getEmpOvertimePay() {
        return empOvertimePay;
    }

    public void setEmpOvertimePay(double empOvertimePay) {
        this.empOvertimePay = empOvertimePay;
    }

    public double getEmpTotalDeductions() {
        return empTotalDeductions;
    }

    public void setEmpTotalDeductions(double empTotalDeductions) {
        this.empTotalDeductions = empTotalDeductions;
    }

    public double getEmpNetPay() {
        return empNetPay;
    }

    public void setEmpNetPay(double empNetPay) {
        this.empNetPay = empNetPay;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "EmployeeRecord{" +
                "empID='" + empID + '\'' +
                ", empLastName='" + empLastName + '\'' +
                ", empFirstName='" + empFirstName + '\'' +
                ", empDepartment='" + empDepartment + '\'' +
                ", empGender=" + empGender +
                ", empHrsWorked=" + empHrsWorked +
                ", empRatePerHour=" + empRatePerHour +
                ", empSSSDeduction=" + empSSSDeduction +
                ", empTaxDeduction=" + empTaxDeduction +
                ", empOtherDeductions=" + empOtherDeductions +
                ", empBasicPay=" + empBasicPay +
                ", empOvertimePay=" + empOvertimePay +
                ", empTotalDeductions=" + empTotalDeductions +
                ", empNetPay=" + empNetPay +
                ", size=" + size +
                '}';
    }
}
