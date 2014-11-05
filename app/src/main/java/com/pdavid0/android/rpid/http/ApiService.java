package com.pdavid0.android.rpid.http;

/**
 * Created by Phil on 11/4/2014.
 */

import com.octo.android.robospice.retrofit.RetrofitGsonSpiceService;

public class ApiService extends RetrofitGsonSpiceService {

    private final static String BASE_URL = "https://my_super_url.com";

    @Override
    public void onCreate() {
        super.onCreate();
        addRetrofitInterface(API.class);
    }

    @Override
    protected String getServerUrl() {
        return BASE_URL;
    }

}