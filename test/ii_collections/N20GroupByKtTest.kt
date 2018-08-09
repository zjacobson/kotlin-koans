package ii_collections

import ii_collections.data.groupedByCities
import ii_collections.data.trip
import org.junit.Assert.assertEquals
import org.junit.Test

class N20GroupByKtTest {
    @Test fun testGroupDeliveriesByCity() {
        assertEquals(groupedByCities, trip.groupDeliveriesByCity())
    }
}
