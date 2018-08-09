package ii_collections

import ii_collections.data.DELIVERIES
import ii_collections.data.reka
import ii_collections.data.trip
import org.junit.Assert.assertEquals
import org.junit.Test

class N21PartitionKtTest {
    @Test fun testGetDeliveriesWhoHaveMoreUndeliveredOrdersThanDelivered() {
        assertEquals(setOf(DELIVERIES[reka]), trip.getDeliveriesWithMoreUndeliveredOrdersThanDelivered())
    }
}
