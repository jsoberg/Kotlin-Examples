package com.soberg.example.chapter2

fun main(args: Array<String>) {
    loops()
}

private fun loops() {
    range()
    downTo()
    rangeWithStep()
    overCollection()
    overMap()
}

private fun range() {
    for (i in 1..100) {
        print("$i ")
    }
    print("\n")
}

private fun downTo() {
    for (i in 100 downTo 1) {
        print("$i ")
    }
    print("\n")
}

private fun rangeWithStep() {
    for (i in 1..100 step 3) {
        print("$i ")
    }
    print("\n")
}

fun overCollection() {
    val collection: List<Int> = listOf(1,2,3,4,5,6,7,8,9,10)
    for(i in collection) {
        print("$i ")
    }
    print("\n")
}

fun overMap() {
    val map: MutableMap<Char, String> = HashMap()
    for(char in 'A'..'Z') {
        map[char] = Integer.toBinaryString(char.toInt())
    }
    for ((key, value) in map) {
        print("$key:$value ")
    }
    print("\n")
}
