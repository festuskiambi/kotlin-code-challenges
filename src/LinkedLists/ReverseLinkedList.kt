package LinkedLists

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun reverseList(head: ListNode?): ListNode? {
    if (head == null) return null

    var prev: ListNode? = null
    var current = head

    while (current != null) {
        var tempNext = current.next
        current.next = prev
        prev = current
        current = tempNext
    }

    return prev
}