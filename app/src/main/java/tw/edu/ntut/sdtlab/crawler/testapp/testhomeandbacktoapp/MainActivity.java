package tw.edu.ntut.sdtlab.crawler.testapp.testhomeandbacktoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button nextPageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nextPageButton = (Button) findViewById(R.id.nextPageButton);
        nextPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToNextPage();
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        crash();
    }

    private void crash() {
        int i = 1 / 0;
    }

    private void goToNextPage() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
