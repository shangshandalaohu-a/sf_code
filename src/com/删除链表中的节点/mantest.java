package com.删除链表中的节点;

public class mantest {
    public static void main(String[] args) {
        Man aman = new Man(0);
        Man nextnode;
        nextnode = aman;

        Man bman = new Man(1);
        nextnode.next = bman;
        nextnode = nextnode.next;

    }


}

class Man {

    int age;
    Man next;

    Man(int i) {
        this.age = i;
    }


}