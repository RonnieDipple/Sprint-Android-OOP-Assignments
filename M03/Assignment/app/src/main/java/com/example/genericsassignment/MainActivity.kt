package com.example.genericsassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.reactivex.Observable
import okhttp3.Request
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //### Task 1
        //
        //Steps:
        //
        //1. Create a simple example of a mutableList that takes strings as parameters.
        //2. Try adding an integer to the list and see what happens and fix any potential issues.

       // var mList = mutableListOf("a", "b", "c")
        // mList.add(1) <- int can't be added to Muteable List of type String


        /*### Task 2

         Steps:

        1. Create a class that accepts a particular type.
        2. Define the class and the type and see what happens
        when you pass an object that is of type other than the given one.
         */

        // Car(1)

        /*### Task 3

        Steps:

        1. Create a Function that can specify the type of arguments it can accept
        2. Check to see what happens if you pass on object that is not of this type.

        ###


        fun dog(dog: String){

        }

        dog(1)//Integer literally does not conform to expected type String

         */


        //### Task 4
        //
        //Steps
        //
        //1. Create a function that returns a certain type
        //2. Expose this function to another class which can then directly call this function and retrive the object
        //   returned by the function

        /*val myCar = Car("Test")//creates a version of the car class which can be found below
        println("I don't have a ${myCar.carBrand()}")

        /*### Task 7

           Steps

           1. Create an observable that emits 3 objects of type Int
           2. To finish this task, you will need to import rxjava, rxAndroid dependencies using gradle.

            */

        val intOneObservable = Observable.just(1)
        val intTwoObservable = Observable.just(2)
        val intThreeObservable = Observable.just(3)

        intOneObservable.subscribe() { int -> println("The observable returned $int") }
        intTwoObservable.subscribe() { int -> println("The observable returned $int") }
        intThreeObservable.subscribe() { int -> println("The observable returned $int") }


        /*### Task 8

        Steps

        1. Create an observable that emits objects of a custom data class Actor
        2. To finish this task, create two actors Tom Cruise, Brad Pitt and return these objects using an observable.
         */

        open class Actor
        class TomCruise : Actor()
        class BradPitt : Actor()

        /* just the observable that does actually work
        val actorObservable = Observable.just(TomCruise(), BradPitt())

         */
        val actorObservable = Observable.just(TomCruise(), BradPitt())
        actorObservable.subscribe() { actors -> println("The observable returned $actors") }


    }

    class Car(i: String) {

        fun carBrand(): String {
            return "BMW"

        }

    }


    //### Task 5
    //
    //Steps
    //
    //1. Enforce Generic Constraints by creating a class and denoting the type of objects it can hold.
    //2. To finish this task 5, create a class Phone that only accepts objects of type CellularService.

    // I could refactor this but I want to keep it for my records lol
    // class Phone<CellularService>(c: CellularService)


    /* ### Task 6

     Steps

     1. Enforce restricted types for a class to related types of objects.
     2. To finish task 6, after task 5, refactor class Phone so that it can accept two types of CellularService
     like TMobile and Verizon.*/

    class Phone<CellularService>(TMobile: CellularService, Verizon: CellularService)*/


        /*### Task 9

    Steps

    1. Create a dummy network API like the one in the guided project to return four movies with custom attributes such as
   year of release, title, language, imdb rating (feel free to be creative here!, you will need to
   create a data class for Movie to start this task)
    2. Make a call to this NetworkAPI to fetch the movie data and then observe the response and print it to the console. */






    }

    override fun onStart() {
        super.onStart()
        val observable = FakeMovieApi.getMovieList()


        println(" ${observable.blockingFirst()}")

    }

}

class FakeMovieApi {

    companion object {
        fun getMovieList(): Observable<List<Movie>> {
            val movie = Movie("Back to the future 1", "Science fiction", 1.56f)
            val movie2 = Movie("Back to the future 2", "Science fiction", 1.48f)
            val movie3 = Movie("Back to the future 3", "Science fiction", 1.58f)
            val movie4 = Movie("Total Recall", "Science fiction", 1.53f)
            return Observable.just(listOf(movie, movie2, movie3, movie4))

        }
    }
}
