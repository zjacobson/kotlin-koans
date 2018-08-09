package ii_collections

import ii_collections.data.CUSTOMERS
import ii_collections.data.lucas
import ii_collections.data.nathan
import org.junit.Assert.assertEquals
import org.junit.Test

class N19SumKtTest {
    @Test fun testGetTotalOrderPrice() {
        assertEquals(148.0, CUSTOMERS[nathan]!!.getTotalOrderPrice(), 0.001)
    }

    @Test fun testTotalPriceForRepeatedProducts() {
        assertEquals(586.0, CUSTOMERS[lucas]!!.getTotalOrderPrice(), 0.001)
    }
}
