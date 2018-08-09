package ii_collections.data

import ii_collections.*

//items
val idea = Item("IntelliJ IDEA Ultimate", 199.0)
val reSharper = Item("ReSharper", 149.0)
val dotTrace = Item("DotTrace", 159.0)
val dotMemory = Item("DotMemory", 129.0)
val dotCover = Item("DotCover", 99.0)
val appCode = Item("AppCode", 99.0)
val phpStorm = Item("PhpStorm", 99.0)
val pyCharm = Item("PyCharm", 99.0)
val rubyMine = Item("RubyMine", 99.0)
val webStorm = Item("WebStorm", 49.0)
val teamCity = Item("TeamCity", 299.0)
val youTrack = Item("YouTrack", 500.0)

//DELIVERIES
val lucas = "Lucas"
val cooper = "Cooper"
val nathan = "Nathan"
val reka = "Reka"
val bajram = "Bajram"
val asuka = "Asuka"
val riku = "Riku"

//cities
val Canberra = City("Canberra")
val Vancouver = City("Vancouver")
val Budapest = City("Budapest")
val Ankara = City("Ankara")
val Tokyo = City("Tokyo")

fun customer(name: String, city: City, vararg orders: Order) = Delivery(name, city, orders.toList())
fun order(vararg items: Item, isDelivered: Boolean = true) = Order(items.toList(), isDelivered)
fun trip(name: String, vararg deliveries: Delivery) = Trip(name, deliveries.toList())

val trip = trip("jb test trip",
        customer(lucas, Canberra,
                order(reSharper),
                order(reSharper, dotMemory, dotTrace)
        ),
        customer(cooper, Canberra),
        customer(nathan, Vancouver,
                order(rubyMine, webStorm)
        ),
        customer(reka, Budapest,
                order(idea, isDelivered = false),
                order(idea, isDelivered = false),
                order(idea)
        ),
        customer(bajram, Ankara,
                order(reSharper)
        ),
        customer(asuka, Tokyo,
                order(idea)
        ),
        customer(riku, Tokyo,
                order(phpStorm, phpStorm),
                order(phpStorm)
        )

)

val DELIVERIES: Map<String, Delivery> = trip.deliveries.fold(hashMapOf(), {
    map, customer ->
    map[customer.name] = customer
    map
})

val orderedItems = setOf(idea, reSharper, dotTrace, dotMemory, rubyMine, webStorm, phpStorm)

val sortedDeliveries = listOf(cooper, nathan, bajram, asuka, lucas, riku, reka).map { DELIVERIES[it] }

val groupedByCities = mapOf(
        Canberra to listOf(lucas, cooper),
        Vancouver to listOf(nathan),
        Budapest to listOf(reka),
        Ankara to listOf(bajram),
        Tokyo to listOf(asuka, riku)
).mapValues { it.value.map { name -> DELIVERIES[name] } }
