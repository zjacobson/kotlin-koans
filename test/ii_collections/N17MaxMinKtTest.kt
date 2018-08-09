package ii_collections

import ii_collections.data.*
import org.junit.Assert.assertEquals
import org.junit.Test

class N17MaxMinKtTest {
    @Test fun testCustomerWithMaximumNumberOfOrders() {
        assertEquals(CUSTOMERS[reka], shop.getCustomerWithMaximumNumberOfOrders())
    }

    @Test fun testTheMostExpensiveOrderedProduct() {
        assertEquals(rubyMine, CUSTOMERS[nathan]!!.getMostExpensiveOrderedProduct())
    }
}
