package pool.marbum.marbumpoll;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    Button price;
    Button rules;
    FloatingActionButton account;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        account = findViewById(R.id.account);

        account.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Account.class);
            startActivity(intent);
        });


        boolean isFirstRun = getSharedPreferences("PREFERENCE", MODE_PRIVATE)
                .getBoolean("isFirstRun", true);

        if (isFirstRun) {

            startActivity(new Intent(MainActivity.this, Registration.class));
            Toast.makeText(MainActivity.this, "First Run", Toast.LENGTH_LONG)
                    .show();
        }


        getSharedPreferences("PREFERENCE", MODE_PRIVATE).edit()
                .putBoolean("isFirstRun", false).apply();
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