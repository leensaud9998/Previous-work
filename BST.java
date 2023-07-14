/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;

class BST<Key extends Comparable<? super Key>, T> {

    private BSTNode<Key, T> root; // Root of the BST
    int size;             // Number of nodes in the BST

    BST() {
        root = null;
        size = 0;
    }

    public void clear() {
        root = null;
        size = 0;
    }

    /**
     * @return The number of records in the dictionary.
     */
    public int size() {
        return size;
    }

    /**
     * Insert a record into the tree.
     *
     * @param k Key value of the record.
     * @param e The record to insert.
     */
    public void insert(Key k, T e) {
        root = inserthelp(root, k, e);
        size++;
    }

    /**
     * @return The current subtree, modified to contain the new item
     */
    private BSTNode<Key, T> inserthelp(BSTNode<Key, T> rt, Key k, T e) {
        if (rt == null) {
            return new BSTNode<Key, T>(k, e);
        }
        if (rt.getKey().compareTo(k) > 0) {
            rt.setLeft(inserthelp(rt.getLeft(), k, e));
        } else {
            rt.setRight(inserthelp(rt.getRight(), k, e));
        }
        return rt;
    }

    public T find(Key k) {
        return findhelp(root, k);
    }

    private T findhelp(BSTNode<Key, T> rt, Key k) {
        if (rt == null) {
            return null;
        }
        if (rt.getKey().compareTo(k) > 0) {
            return findhelp(rt.getLeft(), k);
        } else if (rt.getKey().compareTo(k) == 0) {
            return rt.getData();
        } else {
            return findhelp(rt.getRight(), k);
        }
    }

    private BSTNode<Key, T> getmin(BSTNode<Key, T> rt) {
        if (rt.getLeft() == null) {
            return rt;
        }
        return getmin(rt.getLeft());
    }

    private BSTNode<Key, T> deletemin(BSTNode<Key, T> rt) {
        if (rt.getLeft() == null) {
            return rt.getRight();
        }
        rt.setLeft(deletemin(rt.getLeft()));
        return rt;
    }

    public T remove(Key k) {
        T temp = findhelp(root, k); // First find it
        if (temp != null) {
            root = removehelp(root, k); // Now remove it
            size--;
        }
        return temp;
    }

    private BSTNode<Key, T> removehelp(BSTNode<Key, T> rt, Key k) {
        if (rt == null) {
            return null;
        }
        if (rt.getKey().compareTo(k) > 0) {
            rt.setLeft(removehelp(rt.getLeft(), k));
        } else if (rt.getKey().compareTo(k) < 0) {
            rt.setRight(removehelp(rt.getRight(), k));
        } else { // Found it ^_^
            if (rt.getLeft() == null) {
                return rt.getRight();
            } else if (rt.getRight() == null) {
                return rt.getLeft();
            } else { // Two children
                BSTNode<Key, T> temp = getmin(rt.getRight());
                rt.setData(temp.getData());
                rt.setKey(temp.getKey());
                rt.setRight(deletemin(rt.getRight()));
            }
        }
        return rt;
    }
}
