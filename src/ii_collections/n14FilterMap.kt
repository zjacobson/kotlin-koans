package ii_collections

fun example1(list: List<Int>) {

    // If a lambda has exactly one parameter, that parameter can be accessed as 'it'
    val positiveNumbers = list.filter { it > 0 }

    val squares = list.map { it * it }
}

fun Trip.getCitiesCustomersAreFrom(): Set<City> {
    // Return the set of cities the deliveries are from
    return deliveries.map { it.city }.toSet()
}

fun Trip.getCustomersFrom(city: City): List<Delivery> {
    // Return a list of the deliveries who live in the given city
    return deliveries.filter { it.city == city }
}


