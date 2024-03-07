public class Person {
    public Person(String name, int age) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public void displayDetails(){
        System.out.println("Name " + name);
        System.out.println("Age "+ age );
    }

}
class Patient extends Person {
    private String condition;

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Patient(String name, int age, String condition){
        super(name, age);
        this.condition = condition;
    }
}
class Doctor extends Person {
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    private String specialization;

    public Doctor(String name, int age, String specialization){
        super(name, age);
        this.specialization = specialization;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Specialization: " + specialization);
    }
}