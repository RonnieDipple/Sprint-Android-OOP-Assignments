package com.example.abstractionaninterfacesassignment.model

import java.io.Serializable

abstract class Vehicle(val id: String, val weight: Int = 2, val favorite: Boolean){

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