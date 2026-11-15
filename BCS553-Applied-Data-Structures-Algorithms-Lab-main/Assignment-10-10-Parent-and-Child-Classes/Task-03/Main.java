/*
 * Name: Pramod
 * Roll No: 2410303342
 * Student ID: BCS2024299
 * Email: kashyappramod19840@gmail.com
 * GitHub: code-with-pramod
 * Course: BCS553 - Applied Data Structures & Algorithms Lab
 * Assignment: 10
 * Task: 3
 */

class Person {
    String name;
    void greet() { System.out.println("Hello, " + name); }
}
class Teacher extends Person { }
public class Main {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "Kiran";
        t.greet();
    }
}
