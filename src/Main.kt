fun main(){
var conducts=Human("halima",23,58)
    conducts.eat(32)
    conducts.increament(32)
    println(conducts.weight)
    println(conducts.speak("i have still soo much to learn"))
    conducts.birthday(23)
    println(conducts.age)
    var person1=user("halima","osman","fardosa@gmail.com",645373,7544365)
    var person2=user("james","sam","jammy@gmail.com",4657,7345732)
    println("${person1.firstname} ${person1.lastname} ${person1.email}")
    println("${person2.firstname} ${person2.lastname} ${person2.email}")
}
class Human(var name:String,var age:Int, var weight:Int, ){
    fun eat(foodWeight: Int){
        println("i am eating $foodWeight kg of food")
    }
    fun increament(increments:Int):Int{
        weight+=increments
        return weight
    }
   fun speak(speech: String):String{
    return  speech
    }
    fun birthday(age: Int):Int{
        this.age =age+1
        return age
    }
}
class user(var firstname:String,var lastname:String,var email:String,var password:Int, var phonenumber:Int){

}


