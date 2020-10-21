fun main(args:Array<String>)
{
    var person = Person("osemudiamen Itua", "67")
    person.personDetails()

    var student = Student("osemudiamen Itua", "67")
    student.school = "University Of Lagos"

    student.personDetails()

    student.studentDetails()
}

/*
    Expected output

    My name is osemudiamen Itua and I am 67 years old
    My name is osemudiamen Itua and I am 67 years old
    I am a student of University Of Lagos

* */

open class Person(var name:String,var age:String?)
{

    fun personDetails()
    {
        println("My name is $name and I am $age years old")
    }


}

class Student(name: String,age: String?) : Person(name,age)
{
    var school:String? = null
    get() {return field}
    set(value) {field = value;}

    fun studentDetails()
    {
        println("I am a student of $school")
    }
}