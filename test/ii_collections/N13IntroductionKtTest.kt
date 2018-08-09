package ii_collections

import ii_collections.data.CUSTOMERS
import ii_collections.data.shop
import org.junit.Assert.assertEquals
import org.junit.Test

class N13IntroductionKtTest {
    @Test fun testSetOfCustomers() {
        assertEquals(CUSTOMERS.values.toSet(), shop.getSetOfDeliveries())
    }
}
