package ii_collections

import ii_collections.data.sortedDeliveries
import ii_collections.data.trip
import org.junit.Assert.assertEquals
import org.junit.Test

class N18SortKtTest {
    @Test fun testGetDeliveriesSortedByNumberOfOrders() {
        assertEquals(sortedDeliveries, trip.getDeliveriesSortedByNumberOfOrders())
    }
}
