package kr.ac.kumoh.ce.s20191064.s23movielist

data class Movie(
    val id: Int,
    val title: String,
    val director: String,
    val releaseYear: Int,
    val rating: Int,
    val genre: String,
    val synopsis: String?,
    val poster: String
)
