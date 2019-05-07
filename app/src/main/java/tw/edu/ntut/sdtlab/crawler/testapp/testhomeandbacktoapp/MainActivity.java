package tw.edu.ntut.sdtlab.crawler.testapp.testhomeandbacktoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        crash();
    }

    private void crash() {
        int i = 1 / 0;
    }
}
