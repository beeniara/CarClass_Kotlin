fun main(args: Array<String>) {
  var Toyota: Car = Car()
    println("Toyota current Speed is : "+Toyota.speed+ " Km per Hour")
    println("Toyota color is : "+Toyota.color+ " this is original colour")
    println("Toyota number of wheels : "+Toyota.numberOfWheels+ " Mag Wheels")

    //Call class an initialize the Constructor

    var newBoxer= Boxer("Jony",1000,20-0)

    //how we can call Constructor
    var animal = Animal(1000)


}

class Car{
    //Car properties
    var speed: Int = 50
    var color: String = "Red"
    var numberOfWheels = 4
    var model: String = "Hiace"

}

//** What is Construtor? is a group of code that are automatically excuted when the Class was called

class Boxer(name: String,power: Int, speed: Int){
    //properties
    private var name: String=""
    private var power: Int=0
    private var speed: Int= 0

    //Constructor
    init{
        this.name=name
        println(name + " - " + power + " - " + speed)//this is what you will see in the screen " Jony - 1000 _ 20"
    }

    fun getName(): String {
        return name
    }



}

//**This how we work with custom Constructor or more than one counstuctor in your Class
class Animal(power: Int){
    //first Constructor
    init {
        println("The Power from the Constructor"+power)
    }

    //Second Constructor or Custome one
    constructor(name: String, color: String, speed: Int,power: Int):this(power){

    }
}