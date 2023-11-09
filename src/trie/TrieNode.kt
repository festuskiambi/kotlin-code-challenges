package trie

class TrieNode {
    val children = HashMap<Char, TrieNode?>()
    var end = false
}