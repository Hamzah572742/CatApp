fun main() {
    val binnie = Cat("Binnie", 10, 10)
    val clyde = Cat("Clyde", 5, 5)
    val flathead = Cat("Flathead", 7, 10)
    val cupra= Cat("Cupra", 2, 7)

    flathead.eat(10)


    cupra.walk(1)
    binnie.walk(1)
    clyde.walk(1)
    println(flathead)
    println(cupra)
    println(binnie)
    println(clyde)
}