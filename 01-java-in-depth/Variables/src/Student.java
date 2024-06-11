public class Student {
    int id = 1000;
    int nextId = id + 1;

    void compute () {
        int nextId = id + 1;
        System.out.println(id);
        System.out.println(nextId);
    }
    public static void main (String[] args) {
        Student s = new Student();
        s.compute();
    }
}
