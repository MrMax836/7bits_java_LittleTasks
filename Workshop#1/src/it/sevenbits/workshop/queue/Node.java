package it.sevenbits.workshop.queue;

import it.sevenbits.workshop.matrix.Matrix;

public class Node {
    private Node nodeNext;
    private Node nodePrev;
    private Matrix elem;

    public Node() {
        this.nodeNext = null;
        this.nodePrev = null;
        this.elem = null;
    }

    public Node(Node p, Node n, Matrix m) {
        this.nodePrev = p;
        this.nodeNext = n;
        this.elem = m;
    }

    public Matrix getMatrix() {
        return this.elem;
    }

    public void setMatrix(Matrix m) {
        this.elem = m;
    }

    public Node getNext() {
        return this.nodeNext;
    }

    public Node getPrev() {
        return this.nodePrev;
    }

    public void setNext(Node n) {
        this.nodeNext = n;
    }

    public void setPrev(Node p) {
        this.nodePrev = p;
    }
}
