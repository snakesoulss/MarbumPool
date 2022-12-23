package pool.marbum.marbumpoll;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class RulesActivity extends AppCompatActivity {

    Button generalInfo;
    Button admin;
    Button conflict;
    Button prohibition;
    Button visitors;
    Button visitorsCan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);

        generalInfo = findViewById(R.id.general_info);
        generalInfo.setOnClickListener(view -> {
            Intent intent = new Intent(RulesActivity.this, GeneralInfo.class);
            startActivity(intent);
        });

        admin = findViewById(R.id.admin);
        admin.setOnClickListener(view -> {
            Intent intent = new Intent(RulesActivity.this, Admin.class);
            startActivity(intent);
        });


        conflict = findViewById(R.id.conflict);
        conflict.setOnClickListener(view -> {
            Intent intent = new Intent(RulesActivity.this, Conflict.class);
            startActivity(intent);
        });

        visitors = findViewById(R.id.visitors);
        visitors.setOnClickListener(view -> {
            Intent intent = new Intent(RulesActivity.this, Visitors.class);
            startActivity(intent);
        });

        prohibition = findViewById(R.id.prohibition);
        prohibition.setOnClickListener(view -> {
            Intent intent = new Intent(RulesActivity.this, Prohibition.class);
            startActivity(intent);
        });

        visitorsCan = findViewById(R.id.visitor_can);
        visitorsCan.setOnClickListener(view -> {
            Intent intent = new Intent(RulesActivity.this, VisitorsCan.class);
            startActivity(intent);
        });

    }
}