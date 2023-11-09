package tree

fun invertTree(root: TreeNode?): TreeNode? {
    if (root == null) return null

    val temp = root.left
    val left = root.right
    val right = temp

    invertTree(left)
    invertTree(right)
    return root
}