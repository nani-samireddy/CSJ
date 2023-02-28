public class Student {
    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
    String name;
    int marks;

    void updateMarks(int n){
        this.marks = n;
    }

    public static void main(String[] args) {
        Student nani = new Student("nani",70);
        nani.updateMarks(85);
        System.out.println(nani.name);
        System.out.println(nani.marks);
    }

}
