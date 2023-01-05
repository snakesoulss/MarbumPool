package pool.marbum.marbumpoll;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class PriceActivity extends AppCompatActivity {

    FloatingActionButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price);

        back = findViewById(R.id.button_back);
        back.setOnClickListener(view -> {
            Intent intent = new Intent(PriceActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}