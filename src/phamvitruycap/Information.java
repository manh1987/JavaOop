package phamvitruycap;

public class Information {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.getInfoProtected();
        employee.getInfoDefault();
        employee.getName();
        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
    }
}
