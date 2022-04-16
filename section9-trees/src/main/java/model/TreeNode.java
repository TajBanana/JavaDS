package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TreeNode {
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
    }
}
