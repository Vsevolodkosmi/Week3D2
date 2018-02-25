public class Student {

    private String name;
    private int age;
    private double averageMark;
    private Address address;

    public Student(String name, int age, double averageMark, Address address) {
        this.name = name;
        this.age = age;
        this.averageMark = averageMark;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", averageMark=").append(averageMark);
        sb.append(", address=").append(address);
        sb.append('}');
        return sb.toString();
    }
}
