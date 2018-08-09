package ii_collections

fun example9() {
    val result = listOf(1, 2, 3, 4).fold(1, { partResult, element -> element * partResult })
    result == 24
}

// The same as
fun whatFoldDoes(): Int {
    var result = 1
    listOf(1, 2, 3, 4).forEach { element -> result = element * result}
    return result
}

fun Trip.getSetOfItemsOrderedByEachDelivery(): Set<Item> {
    // Return the set of items that were ordered by each of the deliveries
    return deliveries.fold(allOrderedItems) {
        orderedByAll, customer ->
        orderedByAll.intersect(customer.orderedItems)
    }
}
