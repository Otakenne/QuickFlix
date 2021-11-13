package com.celerii.quickflix.DAO;

import androidx.room.Insert;

import com.celerii.quickflix.Mods.Actor;

public interface ActorDao {
    @Insert
    void insertActor(Actor actor);
}
