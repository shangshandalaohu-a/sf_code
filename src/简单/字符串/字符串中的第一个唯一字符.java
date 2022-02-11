package 简单.字符串;

public class 字符串中的第一个唯一字符 {
    public static void main(String[] args) {
        int leetcode = firstUniqChar("leetcode");

    }

    public static int firstUniqChar(String s) {
        int[] i = new int[26];
        char[] chars = s.toCharArray();
        for (int j = 0; j < s.length(); j++) {
            i[chars[j] - 'a']++;
        }
        for (int j = 0; j < s.length(); j++) {
            if (i[chars[j] - 'a'] == 1) {
                return j;
            }
        }

        return -1;
    }
}