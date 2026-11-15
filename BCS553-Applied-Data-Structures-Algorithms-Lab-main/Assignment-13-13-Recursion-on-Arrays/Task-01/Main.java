/*
 * Name: Pramod
 * Roll No: 2410303342
 * Student ID: BCS2024299
 * Email: kashyappramod19840@gmail.com
 * GitHub: code-with-pramod
 * Course: BCS553 - Applied Data Structures & Algorithms Lab
 * Assignment: 13
 * Task: 1
 */

public class Main {
    static int sum(int[] a, int i) {
        if (i == a.length) return 0;
        return a[i] + sum(a, i + 1);
    }
    public static void main(String[] args) {
        int[] a = {3, 6, 9, 12, 15};
        System.out.println(sum(a, 0));
    }
}
