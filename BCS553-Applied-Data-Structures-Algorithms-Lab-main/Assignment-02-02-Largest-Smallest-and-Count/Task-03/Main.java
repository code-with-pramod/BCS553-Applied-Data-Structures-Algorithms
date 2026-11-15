/*
 * Name: Pramod
 * Roll No: 2410303342
 * Student ID: BCS2024299
 * Email: kashyappramod19840@gmail.com
 * GitHub: code-with-pramod
 * Course: BCS553 - Applied Data Structures & Algorithms Lab
 * Assignment: 2
 * Task: 3
 */

public class Main {
    public static void main(String[] args) {
        int[] marks = {45, 67, 80, 52, 90};
        int count = 0;
        for (int mark : marks) {
            if (mark > 60) count++;
        }
        System.out.println("Count: " + count);
    }
}
