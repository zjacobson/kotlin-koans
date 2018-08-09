package ii_collections

import ii_collections.data.CUSTOMERS
import ii_collections.data.reka
import ii_collections.data.shop
import org.junit.Assert.assertEquals
import org.junit.Test

class N21PartitionKtTest {
    @Test fun testGetCustomersWhoHaveMoreUndeliveredOrdersThanDelivered() {
        assertEquals(setOf(CUSTOMERS[reka]), shop.getCustomersWithMoreUndeliveredOrdersThanDelivered())
    }
}
