package com.celerii.quickflix.DAO;

import androidx.lifecycle.LiveData;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.celerii.quickflix.Mods.Actor;

import java.util.List;

public interface ActorDao {
    @Insert
    void insertActor(Actor actor);

    @Insert
    void insertActors(List<Actor> actors);

    @Update
    void updateActor(Actor actor);

    @Delete
    void deleteActor(Actor actor);

    @Query("DELETE FROM actor_table")
    void deleteAllActors(Actor actor);

    @Query("SELECT * FROM actor_table WHERE id = :id")
    LiveData<Actor> getActor(String id);

    @Query("SELECT * FROM actor_table")
    LiveData<List<Actor>> getAllActors();
}
