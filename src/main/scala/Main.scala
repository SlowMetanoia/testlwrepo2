import scala.io.StdIn
@main def hello(): Unit =
  def factorial(n:Int):Int = 
    if(n<=0) 1 else factorial(n-1) * n
  val x = StdIn.readInt()
  println(factorial(x))

def msg = "I was compiled by Scala 3. :)"
