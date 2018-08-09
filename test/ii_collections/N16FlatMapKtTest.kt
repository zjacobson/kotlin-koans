package ii_collections

import ii_collections.data.*
import org.junit.Assert.assertEquals
import org.junit.Test

class N16FlatMapKtTest {
    @Test fun testGetOrderedItemsSet() {
        assertEquals(setOf(pizza), DELIVERIES[reka]!!.orderedItems)
    }

    @Test fun testGetAllOrderedItems() {
        assertEquals(orderedItems, trip.allOrderedItems)
    }
}
