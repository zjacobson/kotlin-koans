package ii_collections

import ii_collections.data.*
import org.junit.Assert.assertEquals
import org.junit.Test

class N17MaxMinKtTest {
    @Test fun testDeliveryWithMaximumNumberOfOrders() {
        assertEquals(DELIVERIES[reka], trip.getDeliveryWithMaximumNumberOfOrders())
    }

    @Test fun testTheMostExpensiveOrderedItem() {
        assertEquals(rubyMine, DELIVERIES[nathan]!!.getMostExpensiveOrderedItem())
    }
}
