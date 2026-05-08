package oop_00000110617_jesslynclarestasanders.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()
    val philipsLamp = SmartDevice("", "").apply {
        name = "Philips WiZ Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }
}

