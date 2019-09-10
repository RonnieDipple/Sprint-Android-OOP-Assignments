package com.example.abstractionaninterfacesassignment.model

class Motorbike(id: String, weight: Int, favorite: Boolean): Vehicle(id, weight, favorite), GroundTravel {
    override fun travel(): String {
        return drive()
    }

    override fun drive(): String {
        return "The $id goes fast of two wheels"
    }


}