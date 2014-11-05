package com.pdavid0.android.rpid;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.octo.android.robospice.SpiceManager;
import com.octo.android.robospice.persistence.DurationInMillis;
import com.octo.android.robospice.persistence.exception.SpiceException;
import com.octo.android.robospice.request.listener.RequestListener;
import com.pdavid0.android.rpid.http.ApiService;
import com.pdavid0.android.rpid.http.requests.StateRequest;
import com.pdavid0.android.rpid.model.StateResponse;

import butterknife.ButterKnife;
import butterknife.InjectView;


public class MainActivity extends Activity implements RequestListener<StateResponse> {

    private static final String TAG = MainActivity.class.getSimpleName();
    private SpiceManager man = new SpiceManager(ApiService.class);
    @InjectView(R.id.text1)
    TextView mText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

        StateRequest req = new StateRequest();
        man.execute(req, req.createRequestCacheKey(), DurationInMillis.ONE_SECOND, this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (!man.isStarted()) {
            man.start(this);
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (man.isStarted()) {
            man.cancelAllRequests();
            man.shouldStop();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onRequestFailure(SpiceException spiceException) {

    }

    @Override
    public void onRequestSuccess(StateResponse o) {
        Log.d(TAG, o.toString());
        mText1.setText(o.toString());
    }
}
