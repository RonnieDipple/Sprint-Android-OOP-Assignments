package com.example.abstractionaninterfacesassignment.model

import com.example.abstractionaninterfacesassignment.model.Vehicle

class Helicopter(id: String, weight: Int, favorite: Boolean): Vehicle(id, weight, favorite) {
    override fun fly(): String = "Helicopter flying"
}