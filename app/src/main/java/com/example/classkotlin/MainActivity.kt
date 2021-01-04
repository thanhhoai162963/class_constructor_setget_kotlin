package com.example.classkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val family = Family()
        family.showInfo()
        val person = Person()
        person.showInfo()
        val food = Food()
        food.nameFood = "hotpot"
        food.showInfo()
        food.address = "199"
        Log.d("bbb",food.address)
    }
}
class Student{
    var name = "thanh"
    var age = 25
    fun showInfo(){
        Log.d("bbb",this.name)
        Log.d("bbb",this.age.toString())
    }
}
//primary constructor
class Family(var mom:String="", var father:String=""){
    init {
        mom = "mẹ tới"
        father = "cha an"
    }
    fun showInfo(){
        Log.d("bbb",this.mom)
        Log.d("bbb",this.father.toString())
    }
}
//secondary constructor
class Person (var age: Int = 0, val area: String ="asian",var email:String="hoaithanh249"){
    init {
        email ="123"
    }
    constructor(email: String) : this(){
        this.email = email
    }
    fun showInfo(){
        Log.d("bbb",this.email)
    }
}
//Setter and getter
class Food (){
    var nameFood = "noodle"
        set(newNameFood) {
            field = newNameFood +"123"
        }
        get() = field
    var price = 15.000
        set(value) {
            field = value
        }
        get() = field
    var address ="188"
        set(value) { field = value}
        get() = field
    fun showInfo() = Log.d("bbb",this.nameFood)
}