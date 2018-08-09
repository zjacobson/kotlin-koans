package ii_collections

fun example2(list: List<Int>) {

    val isZero: (Int) -> Boolean = { it == 0 }

    val hasZero: Boolean = list.any(isZero)

    val allZeros: Boolean = list.all(isZero)

    val numberOfZeros: Int = list.count(isZero)

    val firstPositiveNumber: Int? = list.firstOrNull { it > 0 }
}

fun Delivery.isFrom(city: City): Boolean = this.city == city

fun Trip.checkAllDeliveriesAreFrom(city: City): Boolean  = deliveries.all { it.isFrom(city) }

fun Trip.hasDeliveryFrom(city: City): Boolean = deliveries.any { it.isFrom(city) }

fun Trip.countDeliveriesFrom(city: City): Int = deliveries.count { it.isFrom(city) }

fun Trip.findFirstDeliveryFrom(city: City): Delivery? = deliveries.firstOrNull { it.isFrom(city) }
