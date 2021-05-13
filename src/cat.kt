fun main(){

    colorSort(listOf(Car("Matt","Toyota","blue"),
        Car("Nissan","Matt","blue"),
        Car("Tuktuk","Nissan","purple"),
        Car("Pickup","Toyota","blue"),
        Car("Rolls","Matt","blue")))
    long("Zachu")
    var account=CurrentAccount(98765430,"John Doe",120000.00)
    account.deposit(140000.00)
    account.withdraw(2000.00)
    account.details()
    var savings=SavingsAccount(7)
    savings.withdraw(10000.0)



}
data class Car(var make:String,var model:String,var color:String)
fun colors(car:List<Car>){
    var blue= mutableListOf<String>()
    var other= mutableListOf<String>()
    when(Colors) {

        "blue"->println(blue.add(car.toString()))
        else->println(other.add(car.toString()))
    }
}

fun long(name:String):Int{
    return name.length
}

open class CurrentAccount(var accountNumber:Int,var accountName:String,var balance:Double){
    fun deposit(amount:Double){
        println(amount+remainder)
    }
    open fun withdraw(amount:Double){
        println(balance-amount)
    }
    fun details(){
        println("Account number ${accountNumber} with balance ${balance} is operated by ${accountName}")
    }
}
