public class BinaryTree {

    Tree root;

    private Tree addRecursive(Tree current, Integer elemento) {
        if (current == null) {
            return new Tree(elemento);
        }

        if (elemento < current.getElemento()) {
            current.setLeft(addRecursive(current.getLeft(), elemento));
        }

        if (elemento > current.getElemento()) {
            current.setRight(addRecursive(current.getRight(), elemento));
        }

        return current;

    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private boolean containsNodeRecursive(Tree current, Integer value) {
        if (current == null) {
            return false;
        }
        if (value == current.getElemento()) {
            return true;
        }
        return value < current.getElemento()
                ? containsNodeRecursive(current.getLeft(), value)
                : containsNodeRecursive(current.getRight(), value);
    }

    public boolean containsNode(Integer value) {
        return containsNodeRecursive(root, value);
    }

    private Tree deleteRecursive(Tree current, Integer value) {
        if (current == null) {
            return null;
        }

        if (value == current.getElemento()) {
            // Node to delete found
            // ... code to delete the node will go here
        }
        if (value < current.getElemento()) {
            current.setLeft(deleteRecursive(current.getLeft(), value));
            return current;
        }
        current.setRight(deleteRecursive(current.getRight(), value));
        return current;
    }
}
