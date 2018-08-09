package ii_collections

import ii_collections.data.*
import org.junit.Assert.assertEquals
import org.junit.Test

class N16FlatMapKtTest {
    @Test fun testGetOrderedProductsSet() {
        assertEquals(setOf(idea), CUSTOMERS[reka]!!.orderedItems)
    }

    @Test fun testGetAllOrderedProducts() {
        assertEquals(orderedProducts, shop.allOrderedItems)
    }
}
