package pool.marbum.marbumpoll;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Account extends AppCompatActivity {
Button avtorization;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        avtorization = findViewById(R.id.btn_avtorization);
        avtorization.setOnClickListener(view -> {
            Intent intent = new Intent(Account.this, Registration.class);
            startActivity(intent);
        });
    }
}