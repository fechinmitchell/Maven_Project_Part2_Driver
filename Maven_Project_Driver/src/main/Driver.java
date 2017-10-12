package Project_Driver;

import com.sun.tools.javac.code.Attribute;
import org.joda.time.LocalDate;
import sun.security.pkcs11.Secmod;

import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {
        Student s1 = new Student("Sean", "Bolton", "13382146", new LocalDate(1995, 8, 24));
        Student s2 = new Student("Cian", "Costelloe", "13345678", new LocalDate(1994, 9, 5));
        Student s3 = new Student("Jamie", "Clifford", "133432122", new LocalDate(1995, 12, 20));
        Student s4 = new Student("Colin", "Crowley", "133456723", new LocalDate(1996, 4, 1));
        Student s5 = new Student("Adam", "Wynne", "122345654", new LocalDate(1994, 9, 27));

        Module softwareEng = new Module("Software Engineering III", "CT417", new ArrayList<Student>());
        softwareEng.addStudent(s1);
        softwareEng.addStudent(s2);
        softwareEng.addStudent(s3);

        Module machineLearning = new Module("Machine Learning & Data Mining", "CT475", new ArrayList<Student>());
        machineLearning.addStudent(s1);
        machineLearning.addStudent(s3);

        Module dataMining = new Module("Data Mining", "CT786", new ArrayList<Student>());
        dataMining.addStudent(s4);
        dataMining.addStudent(s5);

        Module telecoms = new Module("Telecommunications Engineering", "ENG456", new ArrayList<Student>());
        telecoms.addStudent(s4);
        telecoms.addStudent(s5);

        CourseProgramme bp4 = new Course("Electronic & Computer Eng", new LocalDate(2016, 9, 2), new LocalDate(2017, 5, 1), new ArrayList<Module>());
        bp4.addModule(softwareEng);
        bp4.addModule(machineLearning);

        CourseProgramme it3 = new Course("Computer Science", new LocalDate(2015, 6, 5), new LocalDate(2016, 5, 6), new ArrayList<Module>());
        it3.addModule(telecoms);
        it3.addModule(dataMining);

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        for(Student student : students) {
            System.out.println("Name: " + student.getFirstName() + " " + student.getSurname());
            System.out.println("Course: " + student.getCourse().getName());
            System.out.print("Modules: ");
            for (Module module : student.getModules()) {
                System.out.print(module.getName()+ ", ");
            }
            System.out.println("\n");
        }



    }

}
