class Student
{
    int roll_no;
    String name;

    Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class ArrayObj {
    public static void main(String[] args) {
        Student[] arr;
        arr = new Student[5];
        arr[0] = new Student(1, "Aman");
        arr[1] = new Student(2, "Neeraj");
        arr[2] = new Student(3, "Naman");
        arr[3] = new Student(4, "Dharmesh");
        arr[4] = new Student(5, "Mohit");
        for (Student i : arr) System.out.println(i.roll_no + " "  +i.name);
    }
}
