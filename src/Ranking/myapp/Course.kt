package Ranking.myapp

abstract class Course {
    abstract var courseNo : Int
}
//classes for each course
class Course1 : Course(){
    override var courseNo = 1
    var capacity : Int =3;
    var CandidateList = mutableListOf<String>()

   //if seat available returns true the name is added to the list
    fun AddtoList(n : Int,Name :String){
        var name : String = Name+"(Rank"+n+')'
        CandidateList.add(name)
    }
    //prints the candidates of the list
    fun printList(){
        println("The list of Candidates Selected For Course $courseNo are :")
        for(i in CandidateList.indices){
            println("${i+1}. ${CandidateList[i]}")
        }
        println()
    }
    //checks if seats are available are not
    fun isAvailable() : Boolean
    {
        if(capacity>0){
            capacity--
            return true
        }
        else return false
    }
}
class Course2 : Course(){
    override var courseNo = 2
    var capacity : Int =3;
    var CandidateList = mutableListOf<String>()

    //if seat available returns true the name is added to the list
    fun AddtoList(n : Int,Name :String){
        var name : String = Name+"(Rank"+n+')'
        CandidateList.add(name)
    }

    //prints the candidates of the list
    fun printList(){
        println("The list of Candidates Selected For Course $courseNo are :")
        for(i in CandidateList.indices){
            println("${i+1}. ${CandidateList[i]}")
        }
        println()
    }
    //checks if seats are available are not
    fun isAvailable() : Boolean
    {
        if(capacity>0){
            capacity--
            return true
        }
        else return false
    }
}
class Course3 : Course(){
    override var courseNo = 3
    var capacity : Int =3;
    var CandidateList = mutableListOf<String>()

    //if seat available returns true the name is added to the list
    fun AddtoList(n : Int,Name :String){
        var name : String = Name+"(Rank"+n+')'
        CandidateList.add(name)
    }

    //prints the candidates of the list
    fun printList(){
        println("The list of Candidates Selected For Course $courseNo are :")
        for(i in CandidateList.indices){
            println("${i+1}. ${CandidateList[i]}")
        }
        println()
    }
    //checks if seats are available are not
    fun isAvailable() : Boolean
    {
        if(capacity>0){
            capacity--
            return true
        }
        else return false
    }
}
class Course4 : Course(){
    override var courseNo = 4
    var capacity : Int =3;
    var CandidateList = mutableListOf<String>()

    //if seat available returns true the name is added to the list
    fun AddtoList(n : Int,Name :String){
        var name : String = Name+"(Rank"+n+')'
        CandidateList.add(name)
    }

    //prints the candidates of the list
    fun printList(){
        println("The list of Candidates Selected For Course $courseNo are :")
        for(i in CandidateList.indices){
            println("${i+1}. ${CandidateList[i]}")
        }
        println()
    }
    //checks if seats are available are not
    fun isAvailable() : Boolean
    {
        if(capacity>0){
            capacity--
            return true
        }
        else return false
    }
}
class Course5 : Course(){
    override var courseNo = 5
    var capacity : Int =3;
    var CandidateList = mutableListOf<String>()

    //if seat available returns true the name is added to the list
    fun AddtoList(n : Int,Name :String){
        var name : String = Name+"(Rank"+n+')'
        CandidateList.add(name)
    }

    //prints the candidates of the list
    fun printList(){
        println("The list of Candidates Selected For Course $courseNo are :")
        for(i in CandidateList.indices){
            println("${i+1}. ${CandidateList[i]}")
        }
        println()
    }
    //checks if seats are available are not
    fun isAvailable() : Boolean
    {
        if(capacity>0){
            capacity--
            return true
        }
        else return false
    }
}