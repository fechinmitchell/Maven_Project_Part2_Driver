package Project_Driver;

import MavenProject.Course;
import MavenProject.Module;
import MavenProject.Student;
import org.joda.time.LocalDate;
import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {
        Student s1 = new Student("Fechin", "Mitchell", "14441182", new LocalDate(1996, 5, 17));
        Student s2 = new Student("Gearoid", "King", "144118293", new LocalDate(1996, 5, 4));
        Student s3 = new Student("Murrough", "Sweeney", "145676450", new LocalDate(1996, 2, 23));
        Student s4 = new Student("Emmet", "Moran", "167878792", new LocalDate(1997, 4, 7));
        Student s5 = new Student("Ciaran", "McGinley", "123456789", new LocalDate(1996, 10, 30));
        Student s6 = new Student("Jack", "Moran", "198765432", new LocalDate(1996, 10, 30));
        Student s7 = new Student("Dave", "Egan", "197538642", new LocalDate(1996, 10, 30));
        Student s8 = new Student("Cian", "Laffey", "186429753", new LocalDate(1996, 10, 30));
        
        Module machineLearning = new Module("Machine Learning & Data Mining", "CT475", new ArrayList<Student>());
        machineLearning.addStudent(s1);
        machineLearning.addStudent(s3);
        machineLearning.addStudent(s8);

        Module softwareEngineeing = new Module("Software Engineering III", "CT417", new ArrayList<Student>());
        softwareEngineeing.addStudent(s1);
        softwareEngineeing.addStudent(s2);
        softwareEngineeing.addStudent(s3);
        softwareEngineeing.addStudent(s6);
        
        Module digitalSystems = new Module("Digital Systems", "ENG786", new ArrayList<Student>());
        digitalSystems.addStudent(s4);
        digitalSystems.addStudent(s5);
        digitalSystems.addStudent(s8);

        Module telecommunications = new Module("Telecommunications Engineering", "ENG456", new ArrayList<Student>());
        telecommunications.addStudent(s4);
        telecommunications.addStudent(s5);
        telecommunications.addStudent(s7);

        Course bp4 = new Course("Electronic & Computer Eng", new LocalDate(2017, 9, 4), new LocalDate(2017, 5, 2), new ArrayList<Module>());
        bp4.addModule(softwareEngineeing);
        bp4.addModule(machineLearning);

        Course ble4 = new Course("Electronic & Electrical", new LocalDate(2017, 9, 6), new LocalDate(2017, 5, 5), new ArrayList<Module>());
        ble4.addModule(telecommunications);
        ble4.addModule(digitalSystems);

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);
        students.add(s8);

        for(Student student : students) {
            System.out.println("Student Name: " + student.getFirstName() + " " + student.getSurname());
            System.out.println("Course Name: " + student.getCourse().getName());
            System.out.print("Modules Name: ");
            for (Module module : student.getModules()) {
                System.out.print(module.getName()+ ", ");
            }
            System.out.println("\n");
        }



    }

}
