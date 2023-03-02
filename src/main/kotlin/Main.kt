fun main() {
var sian = Human("Masian",42,67)
sian.eat(4)
    println(sian.weight)
    sian.speak("My name is Mercy and I love kotlin")
    sian.birthday(1)
   var mine = user("Mercy","Masian","masianmercy@gmail.com","0734567523","masi@@23")
println(mine.email)
    println(mine.lastName)
}
class Human(var name : String, var age : Int,var weight :Int){

    fun eat(foodweight:Int){
        println("I am eating $foodweight kgs of food")
        weight += foodweight
    }
    fun speak (speech :String){
        println(speech)
    }
    fun birthday(add:Int){
        age += 1
        println(age)
    }
}
data class user(var firstName:String,var lastName:String,var email:String, var phoneNumber:String, var passWord:String)



