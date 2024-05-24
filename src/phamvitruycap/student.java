package phamvitruycap;

public class student {
    private String name = "Hiep";
    private int age = 30;
    private String CCCD = "1234656789";

    protected String getname(){
        return name;
    }

    protected String getCCCD(){
        return CCCD;
    }
    // Default - ko có từ khóa
    void  printAge(){
        System.out.println("Age: " + age);
    }
}
