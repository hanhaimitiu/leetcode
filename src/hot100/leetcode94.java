package hot100;

import java.util.ArrayList;
import java.util.List;

public class leetcode94 {


      static class TreeNode {
          int val;
          TreeNode left;
         TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res= new ArrayList<>();
        mytrace(root,res);
        return res;
    }

    private void mytrace(TreeNode root,List<Integer> res) {
          if(root==null){
              return;
          }
          if(root.left!=null){
              mytrace(root.left,res);
          }

              res.add(root.val);


        if(root.right!=null){
            mytrace(root.right,res);
        }
    }
}
