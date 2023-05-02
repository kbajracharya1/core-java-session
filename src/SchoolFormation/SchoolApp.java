package SchoolFormation;

public class SchoolApp {
    public static void main(String[] args) {
        Student ram = new Student();
        ram.setId(1);
        ram.setName("Kritish");
        ram.setAge(15);
        ram.setGender(Gender.MALE);
        ram.setStudentClass("Ten");

        Teacher hari = new Teacher();
        hari.setId(1);
        hari.setName("Kritish");
        hari.setAge(15);
        hari.setGender(Gender.MALE);
        hari.setSalary(5000);

        Staff shyam = new Staff();
        shyam.setId(1);
        shyam.setName("Kritish");
        shyam.setAge(15);
        shyam.setGender(Gender.MALE);
        shyam.setSalary(2000);
        shyam.setTask("Cleaning");




    }
}
