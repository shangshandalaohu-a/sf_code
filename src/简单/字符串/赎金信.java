package 简单.字符串;

public class 赎金信 {
    public static void main(String[] args) {

    }

    public boolean canConstruct(String ransomNote, String magazine) {
        char[] c1 = new char[26];
        char[] c2 = new char[26];
        for (int i = 0; i < ransomNote.length(); i++) {
            c1[ransomNote.charAt(i) - 'a']++;
        }
        for (int i = 0; i < magazine.length(); i++) {
            c2[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (c1[i] > c2[i]) {
                return false;
            }
        }
        return true;
    }
}
