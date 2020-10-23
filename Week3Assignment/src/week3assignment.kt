open class Person( open var name: String, open var age: String) {

    fun personDetails() = println("My name is $name and I am $age years old")

}

class Student(override var name: String, override var age: String) :Person(name, age) {
    var school: String = "defaultValue"
        get() = field

        set(value) {
            field = value
        }

    fun studentDetails() = println("I am a student of $school")

}

fun main(args:Array<String>)
{
    var person = Person("osemudiamen Itua", "67")
    person.personDetails()

    var student = Student("osemudiamen Itua", "67")
    student.school = "University Of Lagos"

    student.personDetails()

    student.studentDetails()
}
open class Person(var name : String = "", var age: String = "0"){

    fun personDetails(){
        println("My name is $name and I am $age years old");
    }
}
class Student(var newname : String = "", var newage: String = "0"): Person(newname,newage){

    var school : String = ""

    fun studentDetails(){
        println("I am a student of $school");
    }
}

/*
    Expected output

    My name is osemudiamen Itua and I am 67 years old
    My name is osemudiamen Itua and I am 67 years old
    I am a student of University Of Lagos

* */

