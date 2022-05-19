package sg.edu.rp.c346.id20029699.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        textView = findViewById(R.id.textViewDouble);

        Intent intentReceived = getIntent();
        Double selected = intentReceived.getDoubleExtra("double", 0.0);
        textView.setText("Double value received is: " + selected);

    }
}