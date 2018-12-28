public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result  = new ArrayList<>();
        if(root == null) return result;
        Stack<TreeNode> stack  = new Stack<>();
        Set<TreeNode> set = new HashSet<>();
        stack.push(root);
        while (!stack.empty()){
            TreeNode temp = stack.peek();
            if((temp.left!=null||temp.right!=null)&&!set.contains(temp)){
                set.add(stack.pop());
                if(temp.right!=null) stack.push(temp.right);
                stack.push(temp);
                if(temp.left!=null) stack.push(temp.left);
            }else{
                result.add(stack.pop().val);
            }
        }
        return result;
    }