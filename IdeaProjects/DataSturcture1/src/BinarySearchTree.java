public class BinarySearchTree {  // Remove BST outer class!

    class Node {
        int data;
        Node right;
        Node left;

        public Node(int item) {
            data = item;
            right = null;
            left = null;
        }
    }

    Node root;

    public void insert(int data) {
        root = InsertRecursion(root, data);
    }

    public Node InsertRecursion(Node root, int data) {
        if (root == null)
            root = new Node(data);
        else if (data < root.data) {
            root.left = InsertRecursion(root.left, data);
        } else if (data > root.data) {
            root.right = InsertRecursion(root.right, data);
        }
        return root;
    }

    public void delete(int data) {
        root = delete(root, data);
    }

    public Node delete(Node root, int data) {
        if (root == null) return null;

        if (data < root.data) {
            root.left = delete(root.left, data);
        } else if (data > root.data) {
            root.right = delete(root.right, data);
        } else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            root.data = findSmallest(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }

    int findSmallest(Node root) {
        while (root.left != null) root = root.left;
        return root.data;
    }


    public void inorder() {
        inorder(root);
        System.out.println();
    }

    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
}