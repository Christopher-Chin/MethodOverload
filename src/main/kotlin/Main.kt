import java.lang.reflect.Method

fun main(args: Array<String>) {
    println("Method Overloading Example")

    var overloading = MethodOverloading()

    overloading.multiply(1.00,2.00,3.00)
    overloading.multiply(1,2,3)
    overloading.multiply(1.0,2.1,1.1)


}