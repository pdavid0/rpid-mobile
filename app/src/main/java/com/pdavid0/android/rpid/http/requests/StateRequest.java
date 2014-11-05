package com.pdavid0.android.rpid.http.requests;

/**
 * Created by Phil on 11/4/2014.
 */

import com.octo.android.robospice.retry.DefaultRetryPolicy;
import com.pdavid0.android.rpid.model.StateResponse;

/**
 * Created on 2014-11-03.
 *
 * @author philippe
 */
public class StateRequest extends AbstractRetrofitCachedRequest<StateResponse> {
    public StateRequest() {
        super(StateResponse.class);
        setRetryPolicy(new DefaultRetryPolicy(1, 10000, 2));
    }

    @Override
    public StateResponse loadDataFromNetwork() throws Exception {
        return getService().getState();
    }
}