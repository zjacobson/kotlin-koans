package ii_collections

import ii_collections.data.*
import org.junit.Assert.assertEquals
import org.junit.Test

class N14FilterMapKtTest {
    @Test fun testCitiesDeliveriesAreFrom() {
        assertEquals(setOf(Canberra, Vancouver, Budapest, Ankara, Tokyo), trip.getCitiesDeliveriesAreFrom())
    }

    /**
     * Returns the list of the DELIVERIES who live in the city 'city'
     */
    @Test fun testDeliveriesFromCity() {
        assertEquals(listOf(DELIVERIES[lucas], DELIVERIES[cooper]), trip.getDeliveriesFrom(Canberra))
    }
}
