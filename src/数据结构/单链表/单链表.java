package 数据结构.单链表;

public class 单链表 {
    public static void main(String[] args) {
        HeroNode h1 = new HeroNode(1, "Aa", "a");
        HeroNode h2 = new HeroNode(2, "Bb", "b");
        HeroNode h3 = new HeroNode(3, "Cc", "c");
        HeroNode h4 = new HeroNode(4, "Dd", "d");
        HeroNode h5 = new HeroNode(5, "Ee", "e");
        SingleLinkedList list = new SingleLinkedList();
        list.add(h1);
        list.add(h2);
        list.add(h3);
        // list.add(h4);
        //  list.add(h5);
        System.out.println(list.getLength());
        // System.out.println(list.findLastIndexNode(1));
        list.reversetList();
        list.list();

    }


}

class SingleLinkedList {

    private HeroNode head = new HeroNode(0, "", "");

    public void reversetList() {
        HeroNode cur = head.next;
        HeroNode next = null;
        HeroNode reverseHead = new HeroNode(0, "", "");
        while (cur != null) {
            next = cur.next;
            cur.next = reverseHead.next;
            reverseHead.next = cur;
            cur = next;
        }
        head.next = reverseHead.next;

    }

    public HeroNode findLastIndexNode(int index) {

        int length = getLength();
        HeroNode temp = head.next;
        for (int i = 0; i < length - index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public int getLength() {
        if (head.next == null) {
            System.out.println("空");
            return 0;
        }
        int length = 0;
        HeroNode temp = head.next;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;

    }

    public void delete(int no) {
        if (head.next == null) {
            System.out.println("链表为空");
        }
        HeroNode temp = head.next;

        boolean flag = false;
        while (true) {
            if (temp == null) {
                break;
            }
            if (temp.next.no == no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.next = temp.next.next;
        } else {
            System.out.println("没有找到节点");
        }

    }

    public void update(HeroNode newHeroNode) {
        if (head.next == null) {
            System.out.println("链表为空");
        }
        HeroNode temp = head.next;

        boolean flag = false;
        while (true) {
            if (temp == null) {
                break;
            }
            if (temp.no == newHeroNode.no) {
                flag = true;
                break;
            }

            temp = temp.next;
        }
        if (flag) {
            temp.name = newHeroNode.name;
            temp.nickname = newHeroNode.nickname;
        } else {
            System.out.printf("没有找到%d的节点", newHeroNode.no);
        }

    }

    public void add(HeroNode heroNode) {

        HeroNode temp = head;

        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = heroNode;

    }

    public void list() {

        HeroNode temp = head.next;
        while (true) {
            if (temp == null) {
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }

    public HeroNode getHead() {
        return head;
    }


}


class HeroNode {

    public int no;
    public String name;
    public String nickname;
    public HeroNode next;

    public HeroNode(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
