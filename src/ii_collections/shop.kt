package ii_collections

data class Trip(val name: String, val deliveries: List<Delivery>)

data class Delivery(val name: String, val city: City, val orders: List<Order>) {
    override fun toString() = "$name from ${city.name}"
}

data class Order(val items: List<Item>, val isDelivered: Boolean)

data class Item(val name: String, val price: Double) {
    override fun toString() = "'$name' for $price"
}

data class City(val name: String) {
    override fun toString() = name
}


