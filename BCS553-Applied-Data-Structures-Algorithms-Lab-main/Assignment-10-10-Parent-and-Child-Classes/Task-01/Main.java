/*
 * Name: Pramod
 * Roll No: 2410303342
 * Student ID: BCS2024299
 * Email: kashyappramod19840@gmail.com
 * GitHub: code-with-pramod
 * Course: BCS553 - Applied Data Structures & Algorithms Lab
 * Assignment: 10
 * Task: 1
 */

class Animal {
    void sound() { System.out.println("Some sound"); }
}
class Dog extends Animal { }
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
