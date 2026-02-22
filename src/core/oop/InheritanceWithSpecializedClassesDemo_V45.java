package core.oop;

public class InheritanceWithSpecializedClassesDemo_V45 {
    public static void main(String[] args) {
        //

        Person person = new Person("Tom", "Riddle");
        Studentt studentt = new Studentt("Harry", "Potter", 3.25);
        Employee employee = new Employee("Rubeus", "Hagrid", 50000);
        employee.showSalary();
        studentt.showGPA();
    }
}
