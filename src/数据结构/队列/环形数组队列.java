package 数据结构.队列;

import java.util.Scanner;

public class 环形数组队列 {
    public static void main(String[] args) {
        CircleArray circleArray = new CircleArray(5);
        char key = ' ';
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("s(show):显示队列");
            System.out.println("e(exit):推出");
            System.out.println("a(add):添加数据到队列");
            System.out.println("g(get):从队列取出数据");
            System.out.println("h(head):获取头数据");
            key = scanner.next().charAt(0);
            switch (key) {
                case 's':
                    circleArray.showQueue();
                    break;
                case 'a':
                    System.out.println("输入一个数");
                    int value = scanner.nextInt();
                    circleArray.addQueue(value);
                    break;
                case 'g':
                    try {
                        int queue = circleArray.getQueue();
                        System.out.println(queue);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 'h':
                    try {
                        int i = circleArray.HeadDate();
                        System.out.println(i);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 'e':
                    scanner.close();
                    //loop=false;
                    break;
                default:
                    break;

            }
        }
    }
}


class CircleArray {
    //                                     |————————————|
    private int Maxsize;  //                                      |—————————————|
    private int arr[];     //                                    |—————————————|
    private int front;//默认是0 指向第一个                        |—————————————|
    private int rear;//默认是0 指向最后一个元素后一个             | —————————————|

    //构建函数
    public CircleArray(int arrMaxsize) {
        Maxsize = arrMaxsize;
        arr = new int[Maxsize];
    }

    //判断数组是否时空
    public boolean isEmpty() {
        return front == rear;
    }

    //判断数组是否是满的
    public boolean isFull() {
        return (rear + 1) % Maxsize == front;
    }

    //为数组添加数据
    public void addQueue(int n) {
        if (isFull()) {
            System.out.println("数组已经满了");
            return;
        }
        arr[rear] = n;
        rear = (rear + 1) % Maxsize;
    }

    //出队列
    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空,不能取出");
        }
        int var = arr[front];
        front = (front + 1) % Maxsize;
        return var;

    }

    //有效数据长度,(Maxsize-front+rear)%Maxsize  当rear<front时，长度是(maxsize-front)+(rear-0)
    public int size() {
        if (isEmpty()) {
            return 0;
        }
        return (Maxsize - front + rear) % Maxsize;
    }


    //获取头数据
    public int HeadDate() {
        if (isEmpty()) {
            new RuntimeException("数组是空的");
        }

        return arr[front];
    }

    //显示所有数据
    public void showQueue() {
        if (isEmpty()) {
            new RuntimeException("数组是空的");
        }
        for (int i = front; i < front + size(); i++) {
            System.out.printf("arr[%d]=%d\n", i % Maxsize, arr[i % Maxsize]);
        }


    }


}
