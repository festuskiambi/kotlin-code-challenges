package trie



class Trie {
    private val root: TrieNode? = TrieNode()

    fun insert(word: String) {
        var curr = root

        for (c in word) {
            if (curr?.children?.containsKey(c) == false) {
                curr.children[c] = TrieNode()
            }
            curr = curr?.children?.get(c)
        }
        curr?.end = true
    }

    fun search(word: String): Boolean {
        var curr = root

        for (c in word) {
            if (curr?.children?.containsKey(c) == false) {
                curr.children[c] = TrieNode()
            }
            curr = curr?.children?.get(c)
        }
        return curr?.end == true
    }
}