package pool.marbum.marbumpoll;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Registration extends AppCompatActivity implements View.OnClickListener{
    private FirebaseAuth mAuth;
    private EditText emailText;
    private EditText passwordText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        mAuth = FirebaseAuth.getInstance();
        emailText = findViewById(R.id.EmailAddress);
        passwordText = findViewById(R.id.Password);

        findViewById(R.id.btnSignin).setOnClickListener(this);
        findViewById(R.id.btnRegistration).setOnClickListener(this);

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {
            Intent i = new Intent(Registration.this, MainActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(i);
        } else {
            Log.d(TAG, "onAuthStateChanged:signed_out");
        }

    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnSignin){
            signin(emailText.getText().toString(), passwordText.getText().toString());
        }else if(view.getId() == R.id.btnRegistration){
            registration(emailText.getText().toString(), passwordText.getText().toString());
        }
    }
    public void signin(String email, String password){
        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this, task -> {
            if(task.isSuccessful()) {
                Toast.makeText(Registration.this, "Вы успешно вошли в учетную запись.", Toast.LENGTH_LONG).show();
            } else{
                Toast.makeText(Registration.this, "Вы не смогли войти в учетную запись.", Toast.LENGTH_LONG).show();
            }
            if (task.isSuccessful()){
                Intent intent = new Intent(Registration.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void registration (String email, String password){
        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this, task -> {
            if (task.isSuccessful()) {
                Toast.makeText(Registration.this, "Регистрация выполнена успешно!", Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(Registration.this, "Регистрация не выполнена!", Toast.LENGTH_LONG).show();
            }
            if (task.isSuccessful()){
                Intent intent = new Intent(Registration.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}