import java.util.Arrays;

public class StudentGroup {

    private int size;

    private Student[] students = new Student[10];


    public void add(Student student) {
        if (size >= students.length) {
            copyArray();
        }
        students[size++] = student;
    }

    private void copyArray() {
        Student[] tmp = new Student[students.length * 2];
        System.arraycopy(students, 0, tmp, 0, students.length);
        students = tmp;
    }


    public void removeByName(String name) {
        Student[] x = new Student[students.length];
        for (int i = 0; i < size; i++) {
            if (students[i].getName().equals(name)) {
                System.arraycopy(students, 0, x, 0, x.length - i);
                System.arraycopy(students, i + 1, x, i, x.length - 1);
                students = x;
            }
        }
    }

    public void searchByName(String name) {
        for (int i = 0; i < size; i++) {
            if (students[i].getName().equals(name))
                System.out.print("Student has been found: " + students[i].getName() + " ");
        }


    }
        public void sortByWorstDegree() {

        }

    public void sortByBestDegree () {
    }


    @Override
    public String toString() {
        for (int i = 0; i < students.length; i++)
            return "Students name   = " + students[i].getName() + "; " +
                    "" + "Students age  =  " + students[i].getAge() + "; " +
                    "" + "Average mark  = " + students[i].getAverageMark() + "; " +
                    "" + "Students address  = " + students[i].getAddress() + "";

        return null;
    }
}