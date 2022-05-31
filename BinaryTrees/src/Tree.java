public class Tree {

    private Integer elemento;
    private Tree right;
    private Tree left;

    //Getters and Setters

    public Tree getRight() {
        return right;
    }

    public void setRight(Tree right) {
        this.right = right;
    }

    public Tree getLeft() {
        return left;
    }

    public void setLeft(Tree left) {
        this.left = left;
    }

    public Integer getElemento() {
        return elemento;
    }

    public void setElemento(Integer elemento) {
        this.elemento = elemento;
    }

    // Constructors
    public Tree(){
        this.elemento = null;
        this.left = null;
        this.right = null;
    }

    public Tree(Integer elemento){
        this.elemento = elemento;
        this.right = null;
        this.left = null;
        System.out.println("Criei a árvore com o elemento: " + elemento);
    }
}
