package tw.org.iii.brad.brad01;
//主要看xml的layout方式呈現, 也可看life cycle
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("brad","create");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("brad","start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("brad","resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("brad","restart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("brad","pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("brad","stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("brad","destroy");
    }

    @Override
    public void finish() {
        super.finish();
        Log.v("brad","finish");
    }
}
