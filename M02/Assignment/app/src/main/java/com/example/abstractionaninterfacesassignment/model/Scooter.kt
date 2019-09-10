package com.example.abstractionaninterfacesassignment.model

class Scooter (id: String, weight: Int, favorite: Boolean): Vehicle(id, weight, favorite), GroundTravel {
    override fun travel(): String {
        return drive()
    }

    override fun drive(): String {
       return "The scooter is zooming along on the ground using very fast wheels"
    }
}