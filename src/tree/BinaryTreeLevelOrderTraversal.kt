package tree

import jdk.nashorn.api.tree.Tree

fun levelOrder(root: TreeNode?): List<List<Int>> {
    val res = mutableListOf<List<Int>>()
    if (root == null) return res
    val q = ArrayDeque<TreeNode>()
    q.add(root)

    while (q.isNotEmpty()) {
        val size = q.size
        val level = mutableListOf<Int>()

        repeat(size){
            val curr = q.removeFirst()
            level.add(curr.`val`)
            if(curr.left != null)q.add(curr.left!!)
            if(curr.right != null)q.add(curr.right!!)
        }
        res.add(level)
    }

    return res
}