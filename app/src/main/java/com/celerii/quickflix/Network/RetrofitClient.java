package com.celerii.quickflix.Network;

import com.celerii.quickflix.Interfaces.RetrofitAPIInterface;
import com.celerii.quickflix.Utility.Constants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static RetrofitClient retrofitClient = null;
    private final RetrofitAPIInterface retrofitAPIInterface;

    private RetrofitClient() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        retrofitAPIInterface = retrofit.create(RetrofitAPIInterface.class);
    }

    public static synchronized RetrofitClient getInstance() {
        if (retrofitClient == null) {
            retrofitClient = new RetrofitClient();
        }

        return retrofitClient;
    }

    public RetrofitAPIInterface getMyAPIInterface() {
        return retrofitAPIInterface;
    }
}
