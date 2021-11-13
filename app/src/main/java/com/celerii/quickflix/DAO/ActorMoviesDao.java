package com.celerii.quickflix.DAO;

import androidx.lifecycle.LiveData;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.celerii.quickflix.Mods.ActorMovie;
import com.celerii.quickflix.Mods.Movie;

import java.util.List;

public interface ActorMoviesDao {
    @Insert
    void insertActorMovie(ActorMovie actorMovie);

    @Insert
    void insertActorMovies(List<ActorMovie> actorMovies);

    @Delete
    void deleteActorMovie(ActorMovie actorMovie);

    @Query("DELETE FROM actor_movies_table")
    void deleteAllActorMovies();

    @Query("SELECT * FROM actor_movies_table WHERE actor_id = :actor_id")
    LiveData<List<Movie>> getActorMovies(String actor_id);
}
