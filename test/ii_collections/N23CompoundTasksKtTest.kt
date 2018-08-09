package ii_collections

import ii_collections.data.*
import org.junit.Assert.assertEquals
import org.junit.Test

class N23CompoundTasksKtTest {
    @Test fun testGetDeliveriesWhoOrderedItem() {
        assertEquals(setOf(DELIVERIES[reka], DELIVERIES[asuka]), trip.getDeliveriesWhoOrderedItem(idea))
    }

    @Test fun testMostExpensiveDeliveredItem() {
        val testShop = trip("test trip for 'most expensive delivered product'",
                customer(lucas, Canberra,
                        order(idea, isDelivered = false),
                        order(reSharper)
                )
        )
        assertEquals(reSharper, testShop.deliveries[0].getMostExpensiveDeliveredItem())
    }

    @Test fun testNumberOfTimesEachItemWasOrdered() {
        assertEquals(4, trip.getNumberOfTimesItemWasOrdered(idea))
    }

    @Test fun testNumberOfTimesEachItemWasOrderedForRepeatedItem() {
        assertEquals("A customer may order a product for several times",
                3, trip.getNumberOfTimesItemWasOrdered(reSharper))
    }

    @Test fun testNumberOfTimesEachItemWasOrderedForRepeatedInOrderItem() {
        assertEquals("An order may contain a particular product more than once",
                3, trip.getNumberOfTimesItemWasOrdered(phpStorm))
    }
}
