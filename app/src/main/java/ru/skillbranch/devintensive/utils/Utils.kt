package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName: String?):Pair<String?,String?>{
        val parts: List<String>? = fullName?.split(" ")
        var firstName:String? = parts?.getOrNull(0)
        var lastName:String? = parts?.getOrNull(1)

        return Pair(firstName,lastName)
    }
}