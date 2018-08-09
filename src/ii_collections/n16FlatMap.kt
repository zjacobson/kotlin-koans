package ii_collections

fun example() {

    val result = listOf("abc", "12").flatMap { it.toList() }

    result == listOf('a', 'b', 'c', '1', '2')
}

val Delivery.orderedItems: Set<Item> get() = orders.flatMap { it.items }.toSet()

val Trip.allOrderedItems: Set<Item> get() = deliveries.flatMap { it.orderedItems }.toSet().also {  }
