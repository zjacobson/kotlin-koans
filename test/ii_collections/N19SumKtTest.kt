package ii_collections

import ii_collections.data.DELIVERIES
import ii_collections.data.lucas
import ii_collections.data.nathan
import org.junit.Assert.assertEquals
import org.junit.Test

class N19SumKtTest {
    @Test fun testGetTotalOrderPrice() {
        assertEquals(148.0, DELIVERIES[nathan]!!.getTotalOrderPrice(), 0.001)
    }

    @Test fun testTotalPriceForRepeatedItems() {
        assertEquals(586.0, DELIVERIES[lucas]!!.getTotalOrderPrice(), 0.001)
    }
}
