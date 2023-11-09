package LinkedLists

import java.util.Collections.addAll

fun main() {
    var linkedList = LinkedList(0)
    addAll(linkedList, listOf(1, 2, 3, 4, 5, 6, 7, 8, 9))

    removeKthNodeFromEnd(linkedList, 10)
    var result = getNodeValuesInArray(linkedList)

    println(result)

}

open class LinkedList(value: Int) {
    var value = value
    var next: LinkedList? = null
}

fun removeKthNodeFromEnd(head: LinkedList?, k: Int) {
    var first = head
    var second = head
    var counter = 1

    while (counter <= k) {
        second = second?.next
        counter += 1
    }
    if (second == null) {
        head?.value = head!!.next!!.value
        head.next = head.next!!.next
        return
    }
    while (second?.next != null) {
        println(first?.value)
        second = second.next
        first = first?.next
    }
    first?.next = first?.next?.next
}

fun addAll(ll: LinkedList, values: List<Int>) {
    var current = ll
    for (value in values) {
        val newLL = LinkedList(value)
        current.next = newLL
        current = newLL
    }
}


fun getNodeValuesInArray(linkedList: LinkedList): List<Int> {
    var values = mutableListOf<Int>()
    var current: LinkedList? = linkedList
    while (current != null) {
        values.add(current.value)
        current = current.next
    }
    return values
}