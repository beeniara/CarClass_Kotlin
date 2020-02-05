fun main(args: Array<String>) {
  var Toyota: Car = Car()
    println("Toyota current Speed is : "+Toyota.speed+ " Km per Hour")
    println("Toyota color is : "+Toyota.color+ " this is original colour")
    println("Toyota number of wheels : "+Toyota.numberOfWheels+ " Mag Wheels")



}

class Car{
    //Car properties
    var speed: Int = 50
    var color: String = "Red"
    var numberOfWheels = 4
    var model: String = "Hiace"

}