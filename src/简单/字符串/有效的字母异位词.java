package 简单.字符串;

import java.util.Arrays;

public class 有效的字母异位词 {
    public static void main(String[] args) {

        char[] c1 = {'z', 'v'};
        char[] c2 = {'z', 'v'};
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1.equals(c2));
    }

    public boolean isAnagram(String s, String t) {

        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);

        return Arrays.equals(str1, str2);


     /*   char[] chars = s.toCharArray();
        Arrays.sort(chars);

        char[] chars1 = t.toCharArray();
        Arrays.sort(chars1);

        String s1 = String.valueOf(chars);
        String s2 = String.valueOf(chars1);
        if (s2.equals(s1)){
            return true;
        }

        return false;*/
    }
}

