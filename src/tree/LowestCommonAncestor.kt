package tree

fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
    var curr = root

    while (curr != null) {
        if (p!!.`val` > curr.`val` && q!!.`val` > curr.`val`) {
            curr = curr.right
        } else if (p!!.`val` < curr.`val` && q!!.`val` < curr.`val`) {
            curr = curr.left
        } else
            break
    }


    return curr
}