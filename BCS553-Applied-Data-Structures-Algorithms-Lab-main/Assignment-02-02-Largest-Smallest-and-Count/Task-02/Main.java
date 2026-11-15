/*
 * Name: Pramod
 * Roll No: 2410303342
 * Student ID: BCS2024299
 * Email: kashyappramod19840@gmail.com
 * GitHub: code-with-pramod
 * Course: BCS553 - Applied Data Structures & Algorithms Lab
 * Assignment: 2
 * Task: 2
 */

public class Main {
    public static void main(String[] args) {
        int[] marks = {45, 67, 80, 52, 90};
        int smallest = marks[0];
        for (int mark : marks) {
            if (mark < smallest) smallest = mark;
        }
        System.out.println("Smallest: " + smallest);
    }
}
