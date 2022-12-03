package pool.marbum.marbumpoll;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button information;
    Button price;
    Button rules;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        information = findViewById(R.id.button_information);
        information.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);
        });

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