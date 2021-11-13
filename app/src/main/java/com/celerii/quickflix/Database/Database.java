package com.celerii.quickflix.Database;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.celerii.quickflix.DAO.ActorDao;
import com.celerii.quickflix.DAO.ActorMoviesDao;
import com.celerii.quickflix.DAO.MovieCreditDao;
import com.celerii.quickflix.DAO.MovieDao;
import com.celerii.quickflix.DAO.SearchedMoviesDao;
import com.celerii.quickflix.DAO.SimilarMoviesDao;
import com.celerii.quickflix.DAO.TrendingMoviesDao;
import com.celerii.quickflix.DAO.UpcomingMoviesDao;
import com.celerii.quickflix.Mods.Actor;
import com.celerii.quickflix.Mods.ActorMovie;
import com.celerii.quickflix.Mods.Movie;
import com.celerii.quickflix.Mods.MovieCredit;
import com.celerii.quickflix.Mods.SearchedMovies;
import com.celerii.quickflix.Mods.SimilarMovies;
import com.celerii.quickflix.Mods.TrendingMovie;
import com.celerii.quickflix.Mods.UpcomingMovie;
import com.celerii.quickflix.Utility.Constants;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@androidx.room.Database(entities = {Actor.class,
        ActorMovie.class,
        Movie.class,
        MovieCredit.class,
        SearchedMovies.class,
        SimilarMovies.class,
        TrendingMovie.class,
        UpcomingMovie.class}, version = 1, exportSchema = true)
public abstract class Database extends RoomDatabase {
    public abstract ActorDao actorDao();

    public abstract ActorMoviesDao actorMoviesDao();

    public abstract MovieCreditDao movieCreditDao();

    public abstract MovieDao movieDao();

    public abstract SearchedMoviesDao searchedMoviesDao();

    public abstract SimilarMoviesDao similarMoviesDao();

    public abstract TrendingMoviesDao trendingMoviesDao();

    public abstract UpcomingMoviesDao upcomingMoviesDao();

    private static volatile Database INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    public static ExecutorService databaseWriteExecutor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    static Database getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (Database.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            Database.class, Constants.DATABASE_NAME).build();
                }
            }
        }

        return INSTANCE;
    }
}
