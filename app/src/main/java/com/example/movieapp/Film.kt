package com.example.movieapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Film(
    val pictFilm: Int,
    val filmTitle: String="",
    val filmGenre: String="",
    val filmDuration: String="",
    val filmRatingUmur: String="",
    val filmDescription: String=""
):Parcelable