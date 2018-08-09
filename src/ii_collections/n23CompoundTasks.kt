package ii_collections

fun Trip.getCustomersWhoOrderedProduct(item: Item): Set<Delivery> =
// Return the set of deliveries who ordered the specified item
        deliveries.filter { it.orderedItems.contains(item) }.toSet()



fun Delivery.getMostExpensiveDeliveredProduct(): Item? =
    // Return the most expensive product among all delivered items
    // (use the Order.isDelivered flag)
    orders.filter { it.isDelivered }.flatMap { it.items }.maxBy { it.price }

fun Trip.getNumberOfTimesProductWasOrdered(item: Item): Int =
    // Return the number of times the given item was ordered.
    // Note: a customer may order the same item for several times.
    deliveries.flatMap { it.orders }.flatMap { it.items }.count { it == item }

