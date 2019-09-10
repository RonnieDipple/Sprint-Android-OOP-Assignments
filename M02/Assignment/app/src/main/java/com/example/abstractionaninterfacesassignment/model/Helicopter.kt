package com.example.abstractionaninterfacesassignment.model

import com.example.abstractionaninterfacesassignment.model.Vehicle

class Helicopter(id: String, weight: Int, favorite: Boolean): Vehicle(id, weight, favorite), AirTravel {

    override fun fly(): String {

        return "$id is flying with rotors"

    }

    override fun travel(): String{
        return fly()
    }

}