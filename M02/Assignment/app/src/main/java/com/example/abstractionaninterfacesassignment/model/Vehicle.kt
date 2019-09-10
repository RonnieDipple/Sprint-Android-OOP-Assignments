package com.example.abstractionaninterfacesassignment.model

abstract class Vehicle(val id: String, val weight: Int, val favorite: Boolean) {
    abstract fun fly(): String
}

interface AirTravel{
    abstract fun fly(): String
}

interface WaterTravel{
    abstract fun sail(): String
}

interface GroundTravel{
    abstract fun drive(): String
}