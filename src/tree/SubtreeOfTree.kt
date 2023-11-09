package tree

fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
    if (subRoot == null ) return true
    if(root == null) return false

    if (isSameTree(root, subRoot)) return true

    return isSameTree(root.left, subRoot) or isSameTree(root.right, subRoot)


}

