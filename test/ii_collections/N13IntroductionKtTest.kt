package ii_collections

import ii_collections.data.DELIVERIES
import ii_collections.data.trip
import org.junit.Assert.assertEquals
import org.junit.Test

class N13IntroductionKtTest {
    @Test fun testSetOfDeliveries() {
        assertEquals(DELIVERIES.values.toSet(), trip.getSetOfDeliveries())
    }
}
