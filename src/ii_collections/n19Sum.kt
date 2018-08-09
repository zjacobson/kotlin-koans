package ii_collections

fun example6() {
    listOf(1, 3).sum() == 4
    listOf("a", "b", "cc").sumBy { it.length } == 4
}

fun Delivery.getTotalOrderPrice(): Double =
    // Return the sum of prices of all items that a customer has ordered.
    // Note: a customer may order the same product for several times.
    orders.flatMap { it.items }.sumByDouble { it.price }
