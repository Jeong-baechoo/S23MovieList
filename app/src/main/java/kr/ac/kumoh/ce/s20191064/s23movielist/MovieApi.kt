package kr.ac.kumoh.ce.s20191064.s23movielist
import retrofit2.http.GET

interface MovieApi {
    @GET("movies")
    suspend fun getMovies(): List<Movie>
}
