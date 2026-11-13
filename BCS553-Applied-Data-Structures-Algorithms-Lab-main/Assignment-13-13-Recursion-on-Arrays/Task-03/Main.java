/*
 * Name: Pramod
 * Roll No: 2410303342
 * Student ID: BCS2024299
 * Email: kashyappramod19840@gmail.com
 * GitHub: akhilonix
 * Course: BCS553 - Applied Data Structures & Algorithms Lab
 * Assignment: 13
 * Task: 3
 */

public class Main {
    static void printReverse(int[] a, int i) {
        if (i < 0) return;
        System.out.println(a[i]);
        printReverse(a, i - 1);
    }
    public static void main(String[] args) {
        int[] a = {3, 6, 9, 12, 15};
        printReverse(a, a.length - 1);
    }
}
