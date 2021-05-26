public class Student implements Comparable<Student> {
    private String name;

    Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }
}
