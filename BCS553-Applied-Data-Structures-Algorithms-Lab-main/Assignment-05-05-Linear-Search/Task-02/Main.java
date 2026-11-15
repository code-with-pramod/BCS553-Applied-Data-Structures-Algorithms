/*
 * Name: Pramod
 * Roll No: 2410303342
 * Student ID: BCS2024299
 * Email: kashyappramod19840@gmail.com
 * GitHub: code-with-pramod
 * Course: BCS553 - Applied Data Structures & Algorithms Lab
 * Assignment: 5
 * Task: 2
 */

public class Main {
public static int linearSearch(int[] a, int key) {
    for (int i = 0; i < a.length; i++) {
        if (a[i] == key) return i;
    }
    return -1;
}
public static void main(String[] args) {
    int[] a = {45, 67, 80, 52, 90};
    System.out.println(linearSearch(a, 100));
}
}
