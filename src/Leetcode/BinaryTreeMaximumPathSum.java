package Leetcode;

import java.util.HashMap;

public class BinaryTreeMaximumPathSum {
	
	public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
	}
	
	HashMap<TreeNode, Integer> maxSpMap = new HashMap<BinaryTreeMaximumPathSum.TreeNode, Integer>();
	
	public int maxPathSum(TreeNode root) {
		if(root == null)
			return 0;
		else if(root.left == null && root.right == null){
			maxSpMap.put(root, max(0, root.val));
			return root.val;
		}
		else{
			int maxChildP = max(maxPathSum(root.left), maxPathSum(root.right));
			
			int maxLp = root.left == null? 	0:maxSpMap.get(root.left);
			int maxRp = root.right == null? 0:maxSpMap.get(root.right);
			int maxSp = max(maxLp, maxRp) + root.val;
			maxSpMap.put(root, maxSp);
			return max(maxChildP, maxLp+maxRp+root.val);
		}
    }
	
	int max(int a, int b){
		return a>b?a:b;
	}
	
}
