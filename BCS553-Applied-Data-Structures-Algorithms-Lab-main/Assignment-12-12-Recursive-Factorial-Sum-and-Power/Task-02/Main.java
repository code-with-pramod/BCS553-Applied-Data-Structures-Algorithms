/*
 * Name: Pramod
 * Roll No: 2410303342
 * Student ID: BCS2024299
 * Email: kashyappramod19840@gmail.com
 * GitHub: code-with-pramod
 * Course: BCS553 - Applied Data Structures & Algorithms Lab
 * Assignment: 12
 * Task: 2
 */

public class Main {
    static int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}
