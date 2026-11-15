/*
 * Name: Pramod
 * Roll No: 2410303342
 * Student ID: BCS2024299
 * Email: kashyappramod19840@gmail.com
 * GitHub: code-with-pramod
 * Course: BCS553 - Applied Data Structures & Algorithms Lab
 * Assignment: 8
 * Task: 1
 */

class Student {
    int roll;
    String name;
    void show() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
    }
}
public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.roll = 5; s.name = "Rohan";
        s.show();
    }
}
