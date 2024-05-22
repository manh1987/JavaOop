package phamvitruycap;

public class Employee {
    //Phạm vi truy cập private

    private String name = "Phương";
    private  int age = 30;
    public String company = "Viettel";

    public void getInfo(){
        System.out.println(name);
        System.out.println(age);

    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.getInfo();
    }

    //Phạm vi truy cập protected- truy cập sang class trong cùng package
    protected  void getInfoProtected(){
        System.out.println(name);
        System.out.println(age);
    }
//Phạm vi truy cập defaut
    void getInfoDefault(){
        System.out.println("Đây là ham default");
    }

    // Phạm vi truy cập puplic
    public  String  getName(){
        return name;

    }
    public  String getCompany(){
        return company;
    }
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
