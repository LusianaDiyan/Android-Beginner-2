package applusiana.loginactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsername = (TextView) findViewById(R.id.txtNama);

        Intent intent = MainActivity.this.getIntent();
        String username = intent.getStringExtra("username");
        txtUsername.setText(username);
    }
}
