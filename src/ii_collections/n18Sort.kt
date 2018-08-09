package ii_collections

fun example5() {
    val result = listOf("a", "bbb", "cc").sortedBy { it.length }

    result == listOf("a", "cc", "bbb")
}

fun Trip.getDeliveriesSortedByNumberOfOrders(): List<Delivery> =
    // Return a list of deliveries, sorted by the ascending number of orders they made
    deliveries.sortedBy { it.orders.size }

