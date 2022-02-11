package 简单;

public class 实现strStr函数_indexof {
    public static void main(String[] args) {
        System.out.println(strStr("sadgasdiog", "as"));

    }

    public static int strStr(String haystack, String needle) {
        int hay = haystack.length();
        int nee = needle.length();
        for (int i = 0; i < hay - nee + 1; i++) {
            boolean flat = true;
            for (int j = 0; j < nee; j++) {
                if (haystack.charAt(j + i) != needle.charAt(j)) {
                    flat = false;
                    break;
                }
            }
            if (flat) {
                return i;
            }
        }
        return -1;
    }
}


   /* public static int strStr(String haystack, String needle) {
        if (haystack.length()==0||needle.length()==0){
            return 0;
        }
        char[] ch = haystack.toCharArray();
        char[] ne = needle.toCharArray();
        int l=0;int index=0;
        for (int i = 0; i < haystack.length(); i++) {
            if (l!=needle.length()&&ch[i]==ne[l]){
                l++;
                index=i;
            }
        }
        if (l==needle.length()){
            return index-needle.length()+1;
        }


        return -1;
    }*/

