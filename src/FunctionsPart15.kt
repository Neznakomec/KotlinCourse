fun main(args: Array<String>) {
    println(whatShouldIDoToday("sad"))
    println(whatShouldIDoToday())
    println(whatShouldIDoToday(readLine()!!))
}

fun whatShouldIDoToday(weather: String = "sunny", temperature: Int = 24) : String {
    print("What is your mood? ")
    return when {
        goodMoodWeather(weather) -> "go for a walk"
        badMoodWeather(weather, temperature) -> "stay in bed"
        isHotTemperature(temperature) -> "go swimming"
        else -> "Stay home and read."
    }
}

fun isHotTemperature(temperature: Int) = temperature > 35

fun goodMoodWeather(weather: String) = readLine() == "happy" && weather == "Sunny"


fun badMoodWeather(weather: String, temperature: Int) = readLine() == "sad" && weather == "rainy" && temperature == 0
