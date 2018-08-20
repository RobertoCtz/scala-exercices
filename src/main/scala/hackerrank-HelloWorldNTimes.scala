/*
Print "Hello World" N amount of times. The input portion will be handled automatically. You need to write a function with the recommended method signature.

Input Format

A single line of input containing integer N, the number of times to print "Hello World".

Output Format

Output N lines, each containing "Hello World".



*/

object HelloWorldNTimes {
  def main(args: Array[String]): Unit = {
    def f(n:Int) = println("Hello World \n"*n)
    f(5)
  }
}
