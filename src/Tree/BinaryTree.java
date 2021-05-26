package Tree;
/
public class BinaryTree<T extends Comparable<T>> {

    private static class Node<T> {
        private T rootValue;
        private Node<T> left, right;

        Node(T value) {
            this.rootValue = value;
        }
    }

    private Node<T> root;

    //public BinaryTree() {

    //    root = null;

    //}

    //добавление
    public void add(T value) {
        root = add(root, value);
    }

    private Node<T> add(Node<T> node, T value) {
        if (node == null) {
            node = new Node<>(value);
        } else if (value.compareTo(node.rootValue) > 0) {
            node.right = add(node.right, value);
        } else if (value.compareTo(node.rootValue) < 0) {
            node.left = add(node.left, value);
        }
        return node;
    }

    //поиск
    public boolean search(T value) {
        return (search(root, value) != null);
    }

    private Node<T> search(Node<T> node, T t) {
        if (node == null) {
            return null;
        } else if (t.compareTo(node.rootValue) > 0) {
            return search(node.right, t);
        } else if (t.compareTo(node.rootValue) < 0) {
            return search(node.left, t);
        } else {
            return node;
        }
    }

    //Обход дерева «Корень-Левый-Правый»
    public StringBuilder goRootLeftRight() {
        StringBuilder str = new StringBuilder();
        goRootLeftRight(root, str);
        return str;
    }

    private void goRootLeftRight(Node<T> node, StringBuilder str) {
        if (node != null) {
            str.append(node.rootValue.toString());
            str.append(" ");
            goRootLeftRight(node.left, str);
            goRootLeftRight(node.right, str);
        }
    }

    //Обход дерева «Левый-Правый-Корень»
    public StringBuilder goLeftRightRoot() {
        StringBuilder str = new StringBuilder();
        goLeftRightRoot(root, str);
        return str;
    }

    private void goLeftRightRoot(Node<T> node, StringBuilder str) {
        if (node != null) {
            goLeftRightRoot(node.left, str);
            goLeftRightRoot(node.right, str);
            str.append(node.rootValue.toString());
            str.append(" ");
        }
    }

    //- Обход дерева «Левый-Корень-Правый».
    public StringBuilder goLeftRootRight() {
        StringBuilder str = new StringBuilder();
        goLeftRootRight(root, str);
        return str;
    }

    private void goLeftRootRight(Node<T> node, StringBuilder str) {
        if (node != null) {
            goLeftRootRight(node.left, str);
            str.append(node.rootValue.toString());
            str.append(" ");
            goLeftRootRight(node.right, str);
        }
    }
}
