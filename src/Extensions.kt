

fun String.addEnthusiasm(amount: Int =1) = this + "!".repeat(amount)

fun Any.easyPrint() = println(this)

fun main(args: Array<String>) {
    "Madrigal has left the building".addEnthusiasm().easyPrint()
    42.easyPrint()
}