fun main(){
    var human=mary("James","20",40f)
    human.eat(2)
    println(human.weight)
    human.speak("I love coding")

    var mary=user("James","Peter","jamespeter@gmail.com","0741789056","3470")
    println(mary.firstName)
    println(mary.email) }

class mary(var name:String,var age:String,var weight:Float){
    fun eat(foodWeight:Int){
    println("I am eating $foodWeight kg of food")}
    fun add(weight:Int) {
        println(2)
    }
    fun speak(speech:String){
      println(speech)}
fun birthday(age:Int){
    println(age)

}
}

data class user(var firstName:String,var lastName:String,var email:String,var phoneNumber:String,var password:String)
