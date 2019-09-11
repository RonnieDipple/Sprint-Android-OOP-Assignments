package com.example.abstractionaninterfacesassignment.model


abstract class Vehicle(val id: String, val weight: Int = 2, var favorite: Boolean){

    abstract fun travel(): String


}

interface AirTravel{
    fun fly(): String
}

interface WaterTravel{
     fun sail(): String
}

interface GroundTravel{
     fun drive(): String
}