abstract class Animal {
    abstract fun doMove()
    fun doFly() {

    }
}

class Cat : Animal(), Moveable {
    override fun doMove() {
       // логика
    }
    override fun doRun() {
       // логика
    }
}

interface Moveable {
    fun doRun()
}

fun main() {
    val animal = Animal()
    val cat = Cat()
    val animal2 = object : Animal() {
        override fun doMove() {
            TODO("Not yet implemented")
        }
    }
    animal2.doFly()
    animal2.doMove()
    val move = object : Moveable{
        override fun doRun() {
            //
        }
    }
    move.doRun()
}

open class Car(_name: String) {
    var name: String = ""
    var power: Int = 0
    init {
        this.name = _name
        this.power = power
    }
    constructor(_name: String, power: Int) : this(_name) {

    }
}
class ECar : Car(_name = "") {

}


fun main2(args: Array<String>) {
    val car : Car = Car("Car")
    val car1 = Car("Car")
    val car2 = Car("Car2",100)

    val ivan = Student()
  //  ivan.name = "123"
    println(ivan.name)
}