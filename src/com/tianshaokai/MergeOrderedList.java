package com.tianshaokai;

public class MergeOrderedList {

    public static void main(String[] args) {

    }

    private static Node merge(Node head1, Node head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }

        Node head = null;

        if (head1.value > head2.value) {
            head = head1;
            head1.next = head1.next;
        } else {
            head = head2;
            head2.next = head2.next;
        }
return head;
    }
}
