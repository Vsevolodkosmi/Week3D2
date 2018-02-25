
import java.util.Scanner;

public class StudentManager {

    private Scanner scanner = new Scanner(System.in);
    private StudentGroup studentGroup = new StudentGroup();

    public void addNewStudent() {
        System.out.println();

        System.out.print("Enter students name - ");
        String name = scanner.next();
        System.out.print("Enter students age - ");
        int age = scanner.nextInt();
        System.out.print("Enter students average mark - ");
        double averageMark = scanner.nextDouble();
        System.out.print("Enter students city - ");
        String city = scanner.next();
        System.out.print("Enter students street - ");
        String street = scanner.next();
        System.out.print("Enter students phone - ");
        String phone = scanner.next();
        Address address = new Address(city,street,phone);
        Student student = new Student(name, age, averageMark,address);
        studentGroup.add(student);

        System.out.println("Student " + "was successfully added\n");
    }

    public void removeStudent() {
        String name = getInputString("Enter students name - ");

        System.out.println("Was entered next students name - " + name);

        studentGroup.removeByName(name);
        System.out.println("Student was successfully removed\n");
    }


    public void displayAllStudents() {

        studentGroup.displayAllStudents();

    }

    public void searchByName(){
        String name = getInputString("Enter students name - ");
        studentGroup.searchByName(name);
    }

    public void studentWithWorstDegree(){
        studentGroup.sortByWorstDegree();
    }

    public void studentWithBestDegree(){
        studentGroup.sortByBestDegree();
    }

    private String getInputString(String message){
        System.out.print(message);
        String input = "";
        while (input.isEmpty()) {
            input = scanner.nextLine();
        }
        return input;
    }
}