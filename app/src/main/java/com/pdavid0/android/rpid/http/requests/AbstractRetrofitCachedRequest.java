package com.pdavid0.android.rpid.http.requests;

/**
 * Created by Phil on 11/4/2014.
 */

import com.octo.android.robospice.request.retrofit.RetrofitSpiceRequest;
import com.pdavid0.android.rpid.http.API;

/**
 * Created on 14-08-04.
 *
 * @author philippe
 */
public abstract class AbstractRetrofitCachedRequest<T> extends RetrofitSpiceRequest<T, API> {

    public AbstractRetrofitCachedRequest(Class<T> responseClass) {
        super(responseClass, API.class);

        //shorter retry policy
//        setRetryPolicy(new DefaultRetryPolicy(2, 2000, 2));
    }

    public Object createRequestCacheKey() {
        return "RPID_cache_" + System.currentTimeMillis();
    }
}