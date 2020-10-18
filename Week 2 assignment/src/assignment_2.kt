
fun main(args:Array<String>)
{
    println("_______________Test1____________________");
    getSquares("2 4 6 8 10 12 14 16 18 20");
    println("\n\n_________________Test2___________________");
    getSquares("1 2 3 4 5 6 7 8 9 0");
}

fun getSquares(word:String)
{
   //Complete this function to solve the question. Alright! 
   Val numbers = arrayOf(word)
   numbers.forEachIndexed(){index, number ->
         var times = number*2 
         Print(" $index ( $number = $times )   ")
   }
}
