package com.example.abstractionaninterfacesassignment.model

class Submarine (id: String, weight: Int, favorite: Boolean): Vehicle(id, weight, favorite), WaterTravel {
    override fun travel(): String {
        return sail()
    }

    override fun sail(): String {
        return "The $id is sailing under the water and weighs $weight tons"
    }
}