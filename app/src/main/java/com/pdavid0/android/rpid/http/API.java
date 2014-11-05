package com.pdavid0.android.rpid.http;

import com.pdavid0.android.rpid.model.StateResponse;

import retrofit.http.GET;

/**
 * Created by Phil on 11/4/2014.
 */
public interface API {

    @GET("/")
    StateResponse getState();
}
