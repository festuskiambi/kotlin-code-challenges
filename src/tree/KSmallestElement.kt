package tree

fun kthSmallest(root: TreeNode?, k: Int): Int {
    var result = 0
    val s = ArrayDeque<TreeNode?>()
    var curr = root
    var count  =0

    while (true){
        while (curr != null){
            s.addLast(curr)
            curr = curr.left
        }
        curr = s.removeLast()
        count ++
        if (count == k){
            result = curr!!.`val`
            break
        }
        curr = curr?.right
    }


    return result

}