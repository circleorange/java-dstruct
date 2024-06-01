package dstruct;

import dstruct.binarysearchtree.Tree;

public class App {

    public static void main(String[] args) {

        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(26);
        intTree.insert(32);
        intTree.insert(33);

        intTree.traverseInOrder();

        print("Get result: " + intTree.get(27));
        print("Get result: " + intTree.get(404));

        print("Minimum Value: " + intTree.min());
        print("Maximum Value: " + intTree.max());
    }

    public static void print (Object arg0) {

        System.out.println(arg0);
    }
}
