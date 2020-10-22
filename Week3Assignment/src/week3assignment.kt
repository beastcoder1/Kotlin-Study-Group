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

