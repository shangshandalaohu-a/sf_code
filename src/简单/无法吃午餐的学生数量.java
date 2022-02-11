package 简单;

/*
我们先统计出喜欢不同形状的学生数量，因为学生是可以通过回到队尾进行顺序调整，所以我们不需要关心学生的顺序，只关心数量。
三明治的顺序很重要，因为前面的三明治没有被领走，后面的三明治无法拿到。
我们按顺序遍历三明治数组，把对应的三明治分给喜欢的学生，直到当前的三明治没有学生喜欢了，那么就得到答案了，具体请看代码：
*/
public class 无法吃午餐的学生数量 {
    public static void main(String[] args) {
        int[] students = {1, 0, 1, 0};
        int[] sandwiches = {1, 1, 1, 0};
        countStudents(students, sandwiches);
    }


    public static int countStudents(int[] students, int[] sandwiches) {
        //
        int[] counts = new int[2];
        for (int num : students) {
            counts[num] += 1;
        }
        int n = sandwiches.length;
        for (int i = 0; i < n; i++) {
            if (counts[sandwiches[i]] > 0) {
                counts[sandwiches[i]] -=1;
            } else {
                return n - i;
            }
        }
        return 0;
    }
}