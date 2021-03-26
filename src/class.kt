fun main(){
    var human=mary("James","20",40)
    human.eat(2)
    println(human.weight)

    var mary=user("James","Peter","jamespeter@gmail.com","0741789056","3470")
    print(mary.firstName)
    print(mary.email) }

class mary(var name:String,var age:String,var weight:Int){
    fun eat(foodWeight:Int){
    println("I am eating $foodWeight kg of food")}
    fun add(weight:Int) {
        println(2)
    }
    fun speak(speech:String){
      print(speech)}
fun birthday(){
    age=age+1

}
}

data class user(var firstName:String,var lastName:String,var email:String,var phoneNumber:String,var password:String)
