package ii_collections

fun example4() {
    val max = listOf(1, 42, 4).max()
    val longestString = listOf("a", "b").maxBy { it.length }
}

fun Trip.getDeliveryWithMaximumNumberOfOrders(): Delivery? =
    // Return a customer whose order count is the highest among all deliveries
    deliveries.maxBy { it.orders.size }

fun Delivery.getMostExpensiveOrderedItem(): Item? =
    // Return the most expensive product which has been ordered
    orders.flatMap { it.items }.maxBy { it.price }
