/*
 * Name: Pramod
 * Roll No: 2410303342
 * Student ID: BCS2024299
 * Email: kashyappramod19840@gmail.com
 * GitHub: akhilonix
 * Course: BCS553 - Applied Data Structures & Algorithms Lab
 * Assignment: 9
 * Task: 2
 */

class Box {
    int width;
    Box(int width) { this.width = width; }
}
public class Main {
    public static void main(String[] args) {
        Box b = new Box(25);
        System.out.println("Width: " + b.width);
    }
}
