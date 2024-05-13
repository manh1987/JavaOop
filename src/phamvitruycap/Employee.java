package phamvitruycap;

public class Employee {
    //Thành phần của lớp
    private  String name = "Anh tester";
    private  String brithday;
    private  int age = 30;
    private String address = "Cần Thơ";

    public String getName(){
        return  name;
    }
    public String getAddress(){
        return  address;
    }
    //Khai báo Class và Object


    public static void main(String[] args) {
        Employee employee1 = new Employee();
        System.out.println(employee1.getName());

        Employee employee2 = new Employee();
        System.out.println(employee2.getAddress());
    }
}
