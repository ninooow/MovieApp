package com.example.movieapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.movieapp.databinding.ActivityDetailFilmBinding

class DetailFilmActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailFilmBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailFilmBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val film = intent.getParcelableExtra<Film>("film")
        with(binding) {
            film?.let {
                pictFilm.setImageResource(it.pictFilm)
                txtFilmTitle.text = it.filmTitle
                txtFilmGenre.text = it.filmGenre
                txtFilmDuration.text = it.filmDuration
                txtFilmRatingUmur.text = it.filmRatingUmur
                filmDescription.text = it.filmDescription
            }
            btnBack.setOnClickListener{
                finish()
            }
        }

    }
}
