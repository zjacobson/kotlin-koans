package ii_collections

fun example8() {
    val numbers = listOf(1, 3, -4, 2, -11)

    // The details (how multi-assignment works) will be explained later in the 'Conventions' task
    val (positive, negative) = numbers.partition { it > 0 }

    positive == listOf(1, 3, 2)
    negative == listOf(-4, -11)
}

fun Trip.getDeliveriesWithMoreUndeliveredOrdersThanDelivered(): Set<Delivery> =
// Return deliveries who have more undelivered orders than delivered
        deliveries.partition { it.orders.count { !it.isDelivered } > it.orders.count { it.isDelivered } }.first.toSet()

