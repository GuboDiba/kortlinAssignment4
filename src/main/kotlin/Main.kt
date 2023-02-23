
fun main(){
town("Kisumu","Nakuru","Mombasa","Embu","Nyeri","Kisii")
city()
  numbers()
    name("Ann","Maria","Esther")

}
//  Question 1
  fun town(town1:String,town2:String,town3:String,town4:String,town5:String,town6:String){
      var towns= arrayOf(town1,town2,town3,town4,town5,town6)
      println(towns.contentToString())
  }

//Question 2
fun city(){
    var cities= arrayOf("harare","mumbai","dodoma","jakarta")
    cities.forEach { cities-> println(cities.capitalize()) }
}

//Question 3
fun numbers(){
    var number=arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    println(number.get(1) + number.get(4))
    println(number.indexOf(158))
    println(number.sortedArray().contentToString())
}

//Question 4
fun name(con1:String,con2:String,con3:String):Array<String>{
   var names= arrayOf(con1,con2,con3)
    return(names)
}