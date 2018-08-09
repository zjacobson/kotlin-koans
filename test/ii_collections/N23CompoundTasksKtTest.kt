package ii_collections

import ii_collections.data.*
import org.junit.Assert.assertEquals
import org.junit.Test

class N23CompoundTasksKtTest {
    @Test fun testGetDeliveriesWhoOrderedItem() {
        assertEquals(setOf(DELIVERIES[reka], DELIVERIES[asuka]), trip.getDeliveriesWhoOrderedItem(pizza))
    }

    @Test fun testMostExpensiveDeliveredItem() {
        val testShop = trip("test trip for 'most expensive delivered product'",
                customer(lucas, Canberra,
                        order(pizza, isDelivered = false),
                        order(spaghetti)
                )
        )
        assertEquals(spaghetti, testShop.deliveries[0].getMostExpensiveDeliveredItem())
    }

    @Test fun testNumberOfTimesEachItemWasOrdered() {
        assertEquals(4, trip.getNumberOfTimesItemWasOrdered(pizza))
    }

    @Test fun testNumberOfTimesEachItemWasOrderedForRepeatedItem() {
        assertEquals("A customer may order a product for several times",
                3, trip.getNumberOfTimesItemWasOrdered(spaghetti))
    }

    @Test fun testNumberOfTimesEachItemWasOrderedForRepeatedInOrderItem() {
        assertEquals("An order may contain a particular product more than once",
                3, trip.getNumberOfTimesItemWasOrdered(phpStorm))
    }
}
