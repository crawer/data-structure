package org.course.quickFind;

public class QuickFindUFTest {

    public static void main(String[] args){
        QuickFindUF quickFindUF = new QuickFindUF(10);

        quickFindUF.union(0, 8);
        quickFindUF.union(9, 1);
        quickFindUF.union(6, 2);
        quickFindUF.union(5, 3);
        quickFindUF.union(4, 2);
        quickFindUF.union(5, 2);
        quickFindUF.union(9, 5);
        quickFindUF.union(7, 1);

        System.out.println(quickFindUF.connected(7, 1));
        System.out.println(quickFindUF.connected(8, 1));
        System.out.println(quickFindUF.connected(6, 2));
    }
}
