package ru.skillbranch.devintensive.models

import ru.skillbranch.devintensive.utils.Utils
import java.util.*

data class User(val id: String,
                var firstName:String?,
                var lastName: String?,
                var avatar:String?,
                var rating:Int = 0,
                var respect:Int = 0,
                val lastVisit: Date? = null) {
    constructor(id: String, firstName:String?, lastName: String?):this(
        id = id,
        firstName = firstName,
        lastName = lastName,
        avatar = null
    )
    constructor(id:String): this(id,"Unknown","user")

    init {
        println("I'am alive and my name $firstName $lastName")
    }
    companion object Factory{
        private var i:Int = -1
        fun makeUser(fullName:String?):User {
            i++
            val (firstName,lastName) = Utils.parseFullName(fullName)
            return User("$i",firstName = firstName,lastName = lastName)
        }
    }
}