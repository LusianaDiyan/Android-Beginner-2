package applusiana.loginactivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText etUsername, etPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        btnLogin   = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                if (username.isEmpty()){
                    etUsername.setError("Silahkan Masukkan Username Anda");
                }else if (password.isEmpty()){
                    etPassword.setError("Silahkan Masukkan Password Anda");
                }else {

                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                intent.putExtra("username",username);
                intent.putExtra("password", password);
                startActivity(intent);
                }
            }
        });
    }
}
