package Ranking.myapp
fun coursesSelection(n : Int,Name : String,n1 : Int,n2 : Int,n3 : Int ,n4 : Int,n5 : Int,c1 : Course1,c2 : Course2,c3 : Course3,c4 : Course4,c5 : Course5){
    var choicelist = mutableListOf<Int>(n1,n2,n3,n4,n5)
    var k : Int = 0;
  // loop to check each choice and if the seat is available k=1 and the loop stops and go back
    for(i in choicelist.indices){
        if(k==0) {
            when (choicelist[i]) {
                1 -> {
                    k = course1(c1, n , Name)

                }
                2 -> {
                    k = course2(c2, n, Name)

                }
                3 -> {
                    k = course3(c3, n, Name)

                }
                4 -> {
                    k = course4(c4, n, Name)

                }
                5 -> {
                    k = course5(c5, n, Name)

                }
            }

        }
    }
}

//if the seats are available in selected course the name will be added to the list and returns 1
fun course1(c1 : Course1, n : Int , Name: String) : Int{
    var flag =0
    if(c1.isAvailable()==true){
        c1.AddtoList(n,Name)
        flag = 1
    }
    return flag
}
//if the seats are available in selected course the name will be added to the list and returns 1
fun course2(c2 : Course2, n : Int , Name: String): Int{
    var flag =0
    if(c2.isAvailable()==true){
        c2.AddtoList(n,Name)
        flag = 1
    }
    return flag
}
//if the seats are available in selected course the name will be added to the list and returns 1
fun course3(c3 : Course3, n : Int , Name: String): Int{
    var flag =0
    if(c3.isAvailable()==true){
        c3.AddtoList(n,Name)
        flag = 1
    }
    return flag
}
//if the seats are available in selected course the name will be added to the list and returns 1
fun course4(c4 : Course4, n : Int , Name: String): Int{
    var flag =0
    if(c4.isAvailable()==true){
        c4.AddtoList(n,Name)
        flag = 1
    }
    return flag
}
//if the seats are available in selected course the name will be added to the list and returns 1
fun course5(c5 : Course5, n : Int , Name: String): Int{
    var flag =0
    if(c5.isAvailable()==true){
        c5.AddtoList(n,Name)
        flag = 1
    }
    return flag
}
fun main(){
    var c1 = Course1()
    var c2 = Course2()
    var c3 = Course3()
    var c4 = Course4()
    var c5 = Course5()
    for(i in 1..100){ //loop to read the name and choices for top 15 candidates
        println("Enter your Name(Ranker $i) : ") //Reading the name of the candidate(the names are being read rankwise)
        var Name = readLine()!!
        println("Enter your first five choices(ranker $i) :") //reading the choices of the candidate

            var n1 = readLine()!!
            var choice1 = n1.toInt()
            var n2 = readLine()!!
            var choice2 = n2.toInt()
            var n3 = readLine()!!
            var choice3 = n3.toInt()
            var n4 = readLine()!!
            var choice4 = n4.toInt()
            var n5 = readLine()!!
            var choice5 = n5.toInt()

          var n = i.toInt()
        coursesSelection(n,Name,choice1,choice2,choice3,choice4,choice5,c1, c2, c3, c4, c5)
           //the function which
    }
    c1.printList()
    c2.printList()
    c3.printList()
    c4.printList()
    c5.printList()

}
