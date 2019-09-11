package com.example.genericsassignment
import com.google.gson.annotations.SerializedName

data class Movie (@SerializedName("Movie Title") val movieTitle: String,
                  @SerializedName("Movie Genre") val movieGenre: String,
                  @SerializedName("Run Time") val runTime: Float

)