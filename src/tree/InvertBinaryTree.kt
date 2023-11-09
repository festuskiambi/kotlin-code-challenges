package tree
fun main(){
    val tree = BinaryTree(1)
    tree.left = BinaryTree(2)
    tree.right = BinaryTree(3)
    tree.left!!.left = BinaryTree(4)
    tree.left!!.right = BinaryTree(5)
    tree.right!!.left = BinaryTree(6)
    tree.right!!.right = BinaryTree(7)
    tree.left!!.left!!.left = BinaryTree(8)
    tree.left!!.left!!.right = BinaryTree(9)

    val invertedTree = BinaryTree(1)
    invertedTree.left = BinaryTree(3)
    invertedTree.right = BinaryTree(2)
    invertedTree.left!!.left = BinaryTree(7)
    invertedTree.left!!.right = BinaryTree(6)
    invertedTree.right!!.left = BinaryTree(5)
    invertedTree.right!!.right = BinaryTree(4)
    invertedTree.right!!.right!!.left = BinaryTree(9)
    invertedTree.right!!.right!!.right = BinaryTree(8)

   println( invertBinaryTree(tree).right?.left?.value)
}

open class BinaryTree(value: Int) {
    var value = value
    var left: BinaryTree? = null
    var right: BinaryTree? = null
}


fun invertBinaryTree(tree: BinaryTree): BinaryTree {
    val queue = mutableListOf<BinaryTree?>()
    queue.add(tree)

    while (queue.isNotEmpty()) {
        val currentNode = queue.removeAt(0)
        currentNode?.let {
            swapLeftAndRight(currentNode)
            queue.add(currentNode.left)
            queue.add(currentNode.right)
        }
    }
    return tree
}

fun swapLeftAndRight(currentNode: BinaryTree) {
    val left = currentNode.left
    val right = currentNode.right
    currentNode.right = left
    currentNode.left = right
}
