package Company.Knoldus.Validators

class Factorial{
  def factorial(num:Int):BigInt={
    if(num==1) return 1
    return num*factorial(num-1)
  }
}