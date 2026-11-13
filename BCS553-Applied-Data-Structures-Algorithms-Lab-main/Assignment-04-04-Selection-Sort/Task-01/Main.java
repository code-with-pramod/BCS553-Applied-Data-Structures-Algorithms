/*
 * Name: Pramod
 * Roll No: 2410303342
 * Student ID: BCS2024299
 * Email: kashyappramod19840@gmail.com
 * GitHub: akhilonix
 * Course: BCS553 - Applied Data Structures & Algorithms Lab
 * Assignment: 4
 * Task: 1
 */

public class Main {
    public static void main(String[] args) {
        int[] a = {64, 25, 12, 22, 11};
        int minIndex = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[minIndex]) minIndex = i;
        }
        System.out.println(minIndex);
    }
}
