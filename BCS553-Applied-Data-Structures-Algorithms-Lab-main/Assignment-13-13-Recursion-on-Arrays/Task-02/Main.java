/*
 * Name: Pramod
 * Roll No: 2410303342
 * Student ID: BCS2024299
 * Email: kashyappramod19840@gmail.com
 * GitHub: akhilonix
 * Course: BCS553 - Applied Data Structures & Algorithms Lab
 * Assignment: 13
 * Task: 2
 */

public class Main {
    static int max(int[] a, int i) {
        if (i == a.length - 1) return a[i];
        return Math.max(a[i], max(a, i + 1));
    }
    public static void main(String[] args) {
        int[] a = {3, 6, 9, 12, 15};
        System.out.println(max(a, 0));
    }
}
