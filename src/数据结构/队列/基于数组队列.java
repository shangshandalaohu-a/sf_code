package 数据结构.队列;


import java.util.Scanner;

public class 基于数组队列 {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(3);
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
                    arrayQueue.showQueue();
                    break;
                case 'a':
                    System.out.println("输入一个数");
                    int value = scanner.nextInt();
                    arrayQueue.addQueue(value);
                    break;
                case 'g':
                    try {
                        int queue = arrayQueue.getQueue();
                        System.out.println(queue);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 'h':
                    try {
                        int i = arrayQueue.headQueue();
                        System.out.println(i);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 'e':
                    scanner.close();
                    loop = false;
                    break;
                default:
                    break;

            }
        }
    }

}


class ArrayQueue {

    private int maxSize;    //最大 |-------|2
    private int front;      //头部 |       |1                   rear 最后一个元素后一个
    private int rear;       //尾部 |______| 0   尾 rear  -1     front-1
    //                头 front  -1
    private int[] arr;

    public ArrayQueue(int n) {
        maxSize = n;
        front = -1;
        rear = -1;
        arr = new int[maxSize];
    }

    public Boolean isFull() {
        return front == maxSize - 1;
    }

    public Boolean isEmpty() {
        return front == rear;
    }

    public void addQueue(int n) {
        if (isFull()) {
            System.out.println("队列已满,不能加入数据");
        }
        rear++;
        arr[rear] = n;
    }

    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空,不能取出");
        }
        front++;
        return arr[front];
    }

    public void showQueue() {
        if (isEmpty()) {
            System.out.println("队列为空,没有数据");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            //   System.out.printf("arr[%d]=%d\n",i, arr[i]);
            System.out.printf("arr[%d]=%d\n", i, arr[i]);
        }
    }

    public int headQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空,不能取出");
        }
        return arr[front + 1];
    }
}