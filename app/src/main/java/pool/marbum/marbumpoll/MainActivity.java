package pool.marbum.marbumpoll;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button price;
    Button rules;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        price = findViewById(R.id.button_price);
        price.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, PriceActivity.class);
            startActivity(intent);
        });
        rules = findViewById(R.id.button_rules);
        rules.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, RulesActivity.class);
            startActivity(intent);
        });
    }
}