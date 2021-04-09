import Tree.BinaryTree;

public class Main {

    public static void main(String[] args) {
        BinaryTree<Integer> integerTree = new BinaryTree<>();

        System.out.println("\nInteger check: \n");

        integerTree.add(5);
        integerTree.add(3);
        integerTree.add(4);
        integerTree.add(2);
        integerTree.add(7);
        integerTree.add(6);
        integerTree.add(8);

        System.out.println("Left-Right-Root: " + integerTree.goLeftRightRoot());
        System.out.println("Left-Root-Right: " + integerTree.goLeftRootRight());
        System.out.println("Root-Left-Right: " + integerTree.goRootLeftRight());

        System.out.println("\nFind 5: " + (integerTree.search(5) ? "is found" : "is not found"));
        System.out.println("Find 25: " + (integerTree.search(25) ? "is found" : "is not found"));

        BinaryTree<Student> studentTree = new BinaryTree<>();

        System.out.println("\nStudent check: \n");

        studentTree.add(new Student("E"));
        studentTree.add(new Student("C"));
        studentTree.add(new Student("D"));
        studentTree.add(new Student("B"));
        studentTree.add(new Student("G"));
        studentTree.add(new Student("F"));
        studentTree.add(new Student("E"));

        System.out.println("Left-Right-Root: " + studentTree.goLeftRightRoot());
        System.out.println("Left-Root-Right: " + studentTree.goLeftRootRight());
        System.out.println("Root-Left-Right: " + studentTree.goRootLeftRight());

        System.out.println("\nFind E:" + (studentTree.search(new Student("E")) ? " is found" : " is not found"));
        System.out.println("Find R:" + (studentTree.search(new Student("R")) ? " is found" : " is not found"));
    }
}
