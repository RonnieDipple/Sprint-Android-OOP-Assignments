package com.example.abstractionaninterfacesassignment.model

class MonsterTruck (id: String, weight: Int, favorite: Boolean): Vehicle(id, weight, favorite), GroundTravel {
    override fun travel(): String {
        return drive()
    }

    override fun drive(): String {
        return "The $id is smashing cars and jumping over them on the ground using very big wheels"
    }
}
