package lovera.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import lovera.mylibrary.JokeTeller;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JokeTeller.tellJoke();
    }
}
