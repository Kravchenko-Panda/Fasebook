package com.example.katerynakravchenko.fasebook.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by katerynakravchenko on 14.07.17.
 */

public class RecipeClient {
    private Retrofit retrofit;
    private final static String BASE_URL = "http://food2fork.com/api/";

    public RecipeClient() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public RecipeService getRecipeService(){
        return this.retrofit.create(RecipeService.class);
    }
}