package ii_collections

import ii_collections.data.*
import org.junit.Assert.*
import org.junit.Test

class N15AllAnyAndOtherPredicatesKtTest {
    @Test fun testDeliveryIsFromCity() {
        assertTrue(DELIVERIES[lucas]!!.isFrom(Canberra))
        assertFalse(DELIVERIES[lucas]!!.isFrom(Budapest))
    }

    @Test fun testAllDeliveriesAreFromCity() {
        assertFalse(trip.checkAllDeliveriesAreFrom(Canberra))
    }

    @Test fun testAnyDeliveryIsFromCity() {
        assertTrue(trip.hasDeliveryFrom(Canberra))
    }

    @Test fun testCountDeliveriesFromCity() {
        assertEquals(2, trip.countDeliveriesFrom(Canberra))
    }

    @Test fun testFirstDeliveryFromCity() {
        assertEquals(DELIVERIES[lucas], trip.findFirstDeliveryFrom(Canberra))
        assertEquals(null, trip.findFirstDeliveryFrom(City("Chicago")))
    }
}
