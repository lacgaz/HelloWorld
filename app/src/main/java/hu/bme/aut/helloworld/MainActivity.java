package hu.bme.aut.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnShowTime = (Button) findViewById(R.id.btnTime);
        btnShowTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("toast","time");
                Toast.makeText(MainActivity.this,
                        "The time is: " +
                                new Date(System.currentTimeMillis()).toString(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
    ///TODO test
}
