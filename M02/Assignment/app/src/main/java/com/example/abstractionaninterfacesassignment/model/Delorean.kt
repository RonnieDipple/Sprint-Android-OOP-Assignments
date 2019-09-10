package com.example.abstractionaninterfacesassignment.model

class Delorean (id: String = "Delorean", weight: Int, favorite: Boolean): Vehicle(id, weight, favorite), GroundTravel, AirTravel {
    private var isFav: String = ""
    override fun fly(): String {
        isFav = "Most Favorite Vehicle"
        return "The $id is flying with hover wheels and it is my $isFav"
    }


    override fun travel(): String {
        if (favorite){
            return fly()
        }

        return drive()

    }

    override fun drive(): String {
        isFav = "Most Hated Vehicle"
        return "The $id is driving on wheels and it is my $isFav"
    }




}