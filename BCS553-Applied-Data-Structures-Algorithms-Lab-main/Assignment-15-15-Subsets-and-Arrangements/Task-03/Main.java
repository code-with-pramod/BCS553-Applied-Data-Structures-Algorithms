/*
 * Name: Pramod
 * Roll No: 2410303342
 * Student ID: BCS2024299
 * Email: kashyappramod19840@gmail.com
 * GitHub: code-with-pramod
 * Course: BCS553 - Applied Data Structures & Algorithms Lab
 * Assignment: 15
 * Task: 3
 */

public class Main {
    static char[] letters = {'x', 'y'};
    static boolean[] used = new boolean[letters.length];
    static char[] result = new char[letters.length];
    static void arrange(int pos) {
        if (pos == letters.length) {
            System.out.println(new String(result));
            return;
        }
        for (int i = 0; i < letters.length; i++) {
            if (!used[i]) {
                used[i] = true;
                result[pos] = letters[i];
                arrange(pos + 1);
                used[i] = false;
            }
        }
    }
    public static void main(String[] args) { arrange(0); }
}
