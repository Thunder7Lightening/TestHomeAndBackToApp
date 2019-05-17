package tw.edu.ntut.sdtlab.crawler.testapp.testhomeandbacktoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    TextView textViewInPage2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textViewInPage2 = (TextView) findViewById(R.id.textViewInPage2);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        anomaly();
    }

    private void anomaly() {
        textViewInPage2.setText("Change");
    }
}
