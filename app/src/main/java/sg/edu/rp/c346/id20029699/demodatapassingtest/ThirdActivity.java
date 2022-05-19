package sg.edu.rp.c346.id20029699.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        textView = findViewById(R.id.textView);

        Intent intentReceived = getIntent();
        String selected = intentReceived.getStringExtra("character");
        textView.setText("Character value received is: " + selected);
    }
}