package com.example.movieapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.movieapp.databinding.ItemMovieBinding

typealias OnClickFilm = (Film) -> Unit
class FilmAdapter(private val listFilm : List<Film>, private val onClickFilm: OnClickFilm):
    RecyclerView.Adapter<FilmAdapter.ItemFilmViewHolder>() {
    inner class ItemFilmViewHolder(private val binding: ItemMovieBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(data: Film) {
            with(binding) {
                pictFilm.setImageResource(data.pictFilm)
                txtFilmTitle.text = data.filmTitle
                txtFilmDuration.text = data.filmDuration
                txtFilmRatingUmur.text = data.filmRatingUmur
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailFilmActivity::class.java)
                    intent.putExtra("film", data)
                    itemView.context.startActivity(intent)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemFilmViewHolder {
        val binding = ItemMovieBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        return ItemFilmViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listFilm.size
    }

    override fun onBindViewHolder(holder: ItemFilmViewHolder, position: Int) {
        holder.bind(listFilm[position])
    }

}