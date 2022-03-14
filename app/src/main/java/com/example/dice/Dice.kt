package com.example.dice

class Dice(val numSides: Int) {
    var sides = 6
fun roll(): Int {
    return (1..sides).random()
}
}

fun main(){
val diceRange = 1..6
val randomNumber = diceRange.random()
//println("Random number: $randomNumber")
 val myFirstDice = Dice(6)
//myFirstDice.sides =20
   //val diceRoll = myFirstDice.roll()
    println("Your ${myFirstDice.sides} sided dice roll ${myFirstDice.roll()}")

    val mySecondDice= Dice(20)
    println("Your ${mySecondDice.numSides} sided dice rolled  ${mySecondDice.roll()}!")
}