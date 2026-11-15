/*
 * Name: Pramod
 * Roll No: 2410303342
 * Student ID: BCS2024299
 * Email: kashyappramod19840@gmail.com
 * GitHub: code-with-pramod
 * Course: BCS553 - Applied Data Structures & Algorithms Lab
 * Assignment: 14
 * Task: 1
 */

public class Main {
    static boolean isSorted(int[] a, int i) {
        if (i >= a.length - 1) return true;
        if (a[i] > a[i + 1]) return false;
        return isSorted(a, i + 1);
    }
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 10};
        System.out.println(isSorted(a, 0));
    }
}
