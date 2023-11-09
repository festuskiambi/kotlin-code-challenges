package graphs


class Node(var `val`: Int) {
    var neighbors: ArrayList<Node?> = ArrayList<Node?>()
}

//DFS
fun cloneGraphDfs(node: Node?): Node? {
    if (node == null) {
        return null
    }
    val q = ArrayDeque<Node>()
    val hm = HashMap<Node, Node>()

    q.add(node)
    hm[node] = Node(node.`val`)

    while (q.isNotEmpty()) {
        val current = q.removeLast()
        for (n in current.neighbors) {
            if (!hm.contains(n)) {
                val copy = Node(n!!.`val`)
                hm[n] = copy
                q.addLast(n)
            }
            hm[current]?.neighbors?.add(hm[n])
        }
    }
    return hm[node]
}