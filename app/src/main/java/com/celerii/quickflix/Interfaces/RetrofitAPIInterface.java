package com.celerii.quickflix.Interfaces;

import com.celerii.quickflix.Mods.Actor;
import com.celerii.quickflix.Mods.ActorMoviesResults;
import com.celerii.quickflix.Mods.Movie;
import com.celerii.quickflix.Mods.MovieCreditResults;
import com.celerii.quickflix.Mods.SearchedMoviesResults;
import com.celerii.quickflix.Mods.TrendingMoviesResult;
import com.celerii.quickflix.Mods.UpcomingMoviesResults;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RetrofitAPIInterface {

    @GET("movie/popular?api_key={api_key}")
    Call<TrendingMoviesResult> getTrendingMovies(@Query("api_key") String api_key);

    @GET("movie/upcoming?api_key={api_key}")
    Call<UpcomingMoviesResults> getUpcomingMovies(@Query("api_key") String api_key);

    @GET("movie/{movie_id}?api_key={api_key}")
    Call<Movie> getMovie(@Query("api_key") String api_key,
                         @Path("movie_id") String movie_id);

    @GET("movie/{movie_id}/credits?api_key={api_key}")
    Call<MovieCreditResults> getMovieCredits(@Query("api_key") String api_key,
                                             @Path("movie_id") String movie_id);

    @GET("movie/{movie_id}/similar?api_key={api_key}")
    Call<MovieCreditResults> getSimilarMovies(@Query("api_key") String api_key,
                                              @Path("movie_id") String movie_id);

    @GET("person/{person_id}?api_key={api_key}")
    Call<Actor> getActor(@Query("api_key") String api_key,
                         @Path("person_id") String person_id);

    @GET("person/{person_id}/movie_credits?api_key={api_key}")
    Call<ActorMoviesResults> getActorCredit(@Query("api_key") String api_key,
                                            @Path("person_id") String person_id);

    @GET("search/movie?api_key={api_key}&query={query}")
    Call<SearchedMoviesResults> getMovieSearchResults(@Query("api_key") String api_key,
                                                      @Query("query") String query);

}
