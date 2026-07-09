/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class Codec {

    int index = 0;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serializeMe(root, sb);
        return sb.toString();
    }

    public void serializeMe(TreeNode root, StringBuilder sb) {

        if(root == null){
            sb.append("N,");
            return;
        }

        sb.append(root.val).append(",");

        serializeMe(root.left, sb);
        serializeMe(root.right, sb);

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {

        String[] intAr = data.split(",");

        int index = 0;

        return deserializeMe(intAr);
        
    }

    public TreeNode deserializeMe(String[] values) {

        if (values[index].equals("N")) {
            index++;
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(values[index++]));

        node.left = deserializeMe(values);
        node.right = deserializeMe(values);
        
        return node;
    }
}

